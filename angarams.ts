// 📥 Example 1

// Input:
// s = "anagram", t = "nagaram"
// Output:
// true

// 📥 Example 2

// Input:
// s = "rat", t = "car"
// Output:
// false

const validAngarams = (str1: string, str2: string) => {
  const sorted1 = str1.split("").sort().join("");
  const sorted2 = str2.split("").sort().join("");

  return sorted1 === sorted2;
};

console.log(validAngarams("rat", "car"));
