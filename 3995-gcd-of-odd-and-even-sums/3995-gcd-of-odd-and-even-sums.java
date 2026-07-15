class Solution {
  public int gcdOfOddEvenSums(int n) {
    int sumOdd = 1;
    int sumEven = 2;
    int res1 = sumOdd;
    int res2 = sumEven;

    if(n == 0) return 0;
    if(n==1) return 1;
    for (int i = 1; i < n; i++) {
        sumOdd += 2;
        res1 += sumOdd;
        sumEven += 2;
        res2 += sumEven;
    }

    

    return res1 > res2 ? res1%res2 : res2%res1;
  }

}