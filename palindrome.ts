// 📥 Example 1
//
// Input:
//     s = "A man, a plan, a canal: Panama"
// Output:
//     true
// Explanation:
//     After removing non-alphanumeric characters and converting to lowercase, it becomes "amanaplanacanalpanama" — which reads the same both ways.
//
// 📥 Example 2
//
// Input:
//     s = "race a car"
// Output:
//     false
//
// 📥 Example 3
//
// Input:
//     s = " "
// Output:
//     true
// Explanation:
//     Empty strings (after cleaning) are palindromes by definition.

const isPalindrome = (s: string): boolean => {
    const clean = s
        .toLowerCase()
        .replace(/[^a-z0-9]/g, ''); // keep only letters and numbers

    const reversed = clean.split('').reverse().join('');
    return clean === reversed;
};

console.log(isPalindrome('A man, a plan, a canal: Panama'))