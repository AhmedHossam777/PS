1func removeElement(nums []int, val int) int {
2    k := 0
3    for i := 0; i < len(nums); i++ {
4        if nums[i] != val {
5            nums[k] = nums[i]
6            k++
7        }
8    }
9    return k
10}