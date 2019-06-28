public class Seaching {
  public static int binarySearch(int[] array, int target) {
    int low = 0;
    int high = array.length - 1;
    while (low <= high) {
      int mid = (low + high)/2;
      if (array[mid] < target) {
        low = mid + 1;
      } else if (array[mid] > target) {
        high = mid - 1;
      } else {
        return mid;
      }
    }
    return -1;   // not found
  }
  
  private static void binarySearchRecursive(int[] array, int target, int low, int high) {
    if (low > high) {
      return -1;
    } else {
      int mid = (low + high)/2;
      if (array[mid] < target) {
        return binarySearchRecursive(array, target, mid+1, high);
      } else if (array[mid] > target) {
        return binarySearchRecursive(array, target, low, mid-1);
      } else {
        return mid;
      }
    }
  }
  
  public static void binarySearchRecursive(int[] array, int target) {
    return binarySearchRecursive(array, target, 0, array.length-1);
  }
      
    public static void main(String[] args)
  {
    int count = 30;
    int[] nums = new int[count];
    for (int i=0; i < nums.length; i++)
    {
      nums[i] = i*i;
    }
    
    for (int i=0; i < nums.length; i++)
    {
      System.out.println(i + " " + nums[i]);
    }
    
    System.out.println(binarySearchRecursive(nums,36));
    System.out.println(binarySearchRecursive(nums,196));
    System.out.println(binarySearchRecursive(nums,195));
  }
}