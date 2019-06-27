import java.util.*;

public class SlowSorts {

    private static void swap(int[] array, int i, int j)
    {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void selectionSort(int[] array)
    {
        int smallestPos;

        for (int i=0; i < array.length-1; i++)
        {
            smallestPos = i;
            for (int j=i+1; j < array.length; j++)
            {
                if (array[j] < array[smallestPos])
                {
                    smallestPos = j;
                }
            }
            swap(array, smallestPos, i);
        }
    }

    /*public static void insertionSort(int[] array)
    {
        for (int i=___________; i < ___________________________; i++)
        {
            int j = i;
            while (j > 0 && ________________________________)
            {
                swap(array,j,j-1);
                j--;
            }
        }
    }

    public static void insertionSortOptimized(int[] array)
    {
        for (int i = _______________; i < ________________________; i++)
        {
            int j = i;
            int swapVal = array[_____________________];

            while (j > 0 && _______________________________)
            {
                array[j] = array[j-1];
                j--;
            }
            array[j] = swapVal;
        }
        }*/

    public static void main(String[] args)
    {
        int[] myArray = {6, 3, 1, 4, 9, 8};
        selectionSort(myArray);
        for (int value : myArray)
        {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
