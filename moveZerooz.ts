// 📥 Example 1
//
// Input:
//     nums = [0, 1, 0, 3, 12]
// Output:
//     [1, 3, 12, 0, 0]

// const moveZerooz = (nums: number[]): number[] => {
//     let numOfZeros = 0;
//     for (let num of nums) {
//         if (num === 0) numOfZeros++;
//     }
//
//     const newArr = nums.filter((value) => value !== 0)
//
//     while (numOfZeros) {
//         newArr.push(0);
//         numOfZeros--;
//     }
//
//     return newArr;
// }
const moveZerooz = (nums: number[]): number[] => {
    let left = 0;

    for (let right = 0; right < nums.length; right++) {
        if (nums[right] !== 0) {
            [nums[left], nums[right]] = [nums[right], nums[left]];
            left++;
        }
    }

    return nums;
}



console.log(moveZerooz([0, 1, 0, 3, 12]))
