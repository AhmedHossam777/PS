1func merge(nums1 []int, m int, nums2 []int, n int) {
2    i := m - 1      
3    j := n - 1      
4    k := m + n - 1
5    
6    for j >= 0 {
7        if i >= 0 && nums1[i] > nums2[j] {
8            nums1[k] = nums1[i]
9            i--
10        } else {
11            nums1[k] = nums2[j]
12            j--
13        }
14        k--
15    }
16}