class Solution {
  public static int findGCD(int a, int b) {
    if (b == 0)
      return a;

    return findGCD(b, a % b);
  }

  public int findGCD(int[] nums) {
    int[] sorted = Arrays.stream(nums).sorted().toArray();
    int result = 1;

    int max = sorted[sorted.length - 1];
    int min = sorted[0];


    result = findGCD(min, max);

    return result;
  }
}