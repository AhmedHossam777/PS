// 📥 Example 1

// Input:
// nums = [3, 2, 3]
// Output:
// 3
//
//
// 📥 Example 2

// Input:
// nums = [2,2,1,1,1,2,2]
// Output:
// 2

const majority = (arr: number[]) => {
  let max = 0;
  let maxEl;
  const obj: { [key: number]: number } = {};

  const newSet = new Set(arr);
  newSet.forEach((el) => (obj[el] = 0));
  console.log(obj);

  for (let i = 0; i < arr.length; i++) {
    for (let el in obj) {
      if (Number(el) === arr[i]) {
        obj[el]++;
      }
    }
  }

  for (let el in obj) {
    if (obj[el] > max) {
      max = obj[el];
      maxEl = el;
    }
  }
  return { obj, max, maxEl };
};

console.log(majority([2, 2, 1, 1, 1, 2, 2]));
