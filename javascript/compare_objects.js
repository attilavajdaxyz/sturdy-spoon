// Your code here.
​
let obj = {here: {is: "an"}, object: 2};
​
function deepEqual(a, b) {
  if (Object.keys(a).length === Object.keys(b).length) {
    for (let key in a) {
      console.log('key is', key, '--- a[key] is ', a[key], '--- b[key] is', b[key])
      if (typeof a[key] === 'object' && b[key] === 'object' && a[key] !== null && b[key] !== null) {
        console.log('Inside first if statement', typeof a[key], typeof b[key])
        deepEqual(a[key], b[key])
      } else if (typeof a[key] === 'object' && typeof b[key] !== 'object') {
        return false
      } else if (typeof a[key] !== 'object' && typeof b[key] !== 'object' && a[key] === b[key]) {
        console.log('Inside second if statement', typeof a[key], typeof b[key])
       	return true 
      } else if (typeof a[key] !== 'object' && typeof b[key] !== 'object' && a[key] !== b[key]) {
        console.log('Inside last if statement', typeof a[key], typeof b[key])
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