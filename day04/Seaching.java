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
    
    System.out.println(binarySearch(nums,36));
    System.out.println(binarySearch(nums,196));
    System.out.println(binarySearch(nums,195));
  }
}