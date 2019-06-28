import java.util.*;

public class Sorts {

   private static void swap(int[] array, int i, int j) {
      int temp = array[i];
      array[i] = array[j];
      array[j] = temp;
   }

   public static void bubbleSort(int[] array) {
      for (int i=0; i < array.length-1; i++)
         for (int j=0; j < array.length-1-i ; j++)
            if (array[j] > array[j+1])
               swap(array,j,j+1);
   }
    
   public static void selectionSort(int[] array) {
      int smallestPos;

      for (int i=0; i < array.length; i++) {
         smallestPos = i;
         for (int j=i+1; j < array.length; j++)
            if (array[j] < array[smallestPos])
               smallestPos = j;
         int temp = array[i];
         array[i] = array[smallestPos];
         array[smallestPos] = temp;
      }
   }

   public static void insertionSort(int[] array) {
      for (int i=1; i < array.length; i++) {
         int j = i;
         while (j > 0 && array[j] < array[j-1]) {
            swap(array,j,j-1);
            j--;
         }
      }
   }

   public static void insertionSortOptimized(int[] array) {
      for (int nextToFile = 1; nextToFile < array.length; nextToFile++) {
         int swapPos = nextToFile;
         int swapVal = array[nextToFile];
         while (swapPos > 0 && array[swapPos-1] > swapVal) {
            array[swapPos] = array[swapPos-1];
            swapPos--;
         }
         array[swapPos] = swapVal;
      }
   }


   private static void merge(int array[], int tempArray[],
                             int leftStart, int rightStart, int rightEnd)
   {
      int leftEnd = rightStart - 1;
      int temp = 0;
      int left = leftStart;
      int right = rightStart;

      // Start merging until one of the halves is exhausted
      while (left <= leftEnd && right <= rightEnd)
      {
         if (array[left] <= array[right])
         {
            tempArray[temp] = array[left];
            left++;
         }
         else
         {
            tempArray[temp] = array[right];
            right++;
         }
         temp++;
      }
    
      // Copy rest of first half
      while (left  <= leftEnd)
      {
         tempArray[temp] = array[left];
         temp++;
         left++;
      }

      // Copy rest of second half
      while (right <= rightEnd)
      {
         tempArray[temp] = array[right];
         temp++;
         right++;
      }
    
      // Copy temp array over original array
      for (int i=0; i < rightEnd - leftStart + 1; i++)
         array[leftStart+i] = tempArray[i];
   }

   private static void mergeSort(int[] array, int[] tempArray,
                                 int left, int right)
   {
      if (left < right)
      {
         int center = (left + right) / 2;
         mergeSort(array, tempArray, left, center);
         mergeSort(array, tempArray, center+1, right);
         merge(array, tempArray, left, center+1, right);
      }
   }

   public static void mergeSort(int[] array)
   {
      int[] tempArray = new int[array.length];
      mergeSort(array,tempArray,0,array.length-1);
   }

   private static void quickSort(int[] array, int left, int right)
   {
      if (left < right)
      {
         int pivot = array[left];
         int up = left+1;
         int down = right;

         do {
            while (up < right && array[up] < pivot)
               up++;

            while (down > left && array[down] > pivot)
               down--;

            if (up < down)
               swap(array,up,down);
         } while (up < down);

         // Move pivot to the middle. down is now at the rightmost spot less
         // than or equal to pivot.
         swap(array,left,down);

         quickSort(array,left,down-1);
         quickSort(array,down+1,right);
      }
   }    

   public static void quickSort(int[] array)
   {
      quickSort(array,0,array.length-1);
   }

   public static void shuffle(int[] array) {
      Random rand = new Random(55057);
      for (int i=0; i < 1000000; i++) {
         int spot1 = rand.nextInt(array.length);
         int spot2 = rand.nextInt(array.length);
         swap(array,spot1,spot2);
      }
   }

   public static void main(String[] args)
   {
      int size = 50000;
      int[] array = new int[size];
      for (int i=0; i < array.length; i++)
         array[i] = i;
      shuffle(array);
      for (int i=0; i < 100; i++)
         System.out.print(array[i] + " ");
      System.out.println();
      System.out.println();
      insertionSort(array);
      for (int i=0; i < 100; i++)
         System.out.print(array[i] + " ");
      System.out.println();

      for (int i=0; i < array.length; i++) {
         assert(array[i] == i);
      }
   }
}
