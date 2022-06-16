// Your code here.
​
let obj = {here: {is: "an"}, object: 2};

// Saving conditions in variables as flags.
let objectLengthsAreSameFlag = Object.keys(a).length === Object.keys(b).length
​let objectAndNotNullFlag = typeof a[key] === 'object' && b[key] === 'object' && a[key] !== null && b[key] !== null
let objectAndNotObjectFlag = typeof a[key] === 'object' && typeof b[key] !== 'object'
let notObjectEqualFlag = typeof a[key] !== 'object' && typeof b[key] !== 'object' && a[key] === b[key]
let notObjectNotEqualFlag = typeof a[key] !== 'object' && typeof b[key] !== 'object' && a[key] !== b[key]

function deepEqual(a, b) {
  if (objectLengthsAreSameFlag) {
    for (let key in a) {
      if (objectAndNotNullFlag) {
        deepEqual(a[key], b[key])
      } else if (objectAndNotObjectFlag) {
        return false
      } else if (notObjectEqualFlag) {
       	return true 
      } else if (notObjectNotEqualFlag) {
        return false 
      }
    }
    return true
  }
}
​
console.log(deepEqual(obj, obj));
// → true
console.log(deepEqual(obj, {here: 1, object: 2}));
// → false
console.log(deepEqual(obj, {here: {is: "an"}, object: 2}));
// → true