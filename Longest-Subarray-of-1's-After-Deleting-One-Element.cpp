class Solution {
public:
    int numOfMistakes = 0;
    int numOfOnes = 0;
    int maxNumOfOnes = 0;

    int longestSubarray(const vector<int> &nums) {
        int left = 0;

        for (int right = 0; right < nums.size(); ++right) {
            if (nums[right] == 0) {
                numOfMistakes++;
            }

            while (numOfMistakes > 1) {
                if (nums[left] == 0) {
                    numOfMistakes--;
                }
                left++;
            }

            numOfOnes = right - left + 1;
            maxNumOfOnes = max(maxNumOfOnes, numOfOnes - 1);
        }

        return maxNumOfOnes;
    }
};
