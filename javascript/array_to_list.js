let arrayToList = (array) => {
  let result = {value: 0, rest: null}
  for(let i = array.length-1; i >= 0;  i--){
    let current = {}
    if (i === array.length-1){
        result.value = array[i] // {value: 20; rest = null}
    } else {
        current.value = array[i]
        current.rest = result // {value: 10 rest: {value: 20; rest = null}}
        result = current // {value: 10 rest: {value: 20; rest = null}}
    }
  }
console.log(result)
return result
}


// Gabi megoldasa
const prepend = (item, list) => ({ value: item, rest: list })
​
function arrayToList(arr) {
  return prepend(arr[0], arr.length > 1 ? arrayToList(arr.slice(1)) : undefined)
}
​
function nth(index, list) {
  if (!list.rest) return
  return index === 0 ? list.value : nth(index - 1, list.rest)
}

// Gabi megoldasa nem rekurziv fuggvennyel
function arrayToList(arr) {
  return arr.reduceRight((result, item) => (
    prepend(item, result)
  ), undefined)
}


// after memorisation I do have insight into the code

function listToArray(list) {
  let result = []
  let current = list
  while (current.rest) {
    result.push(current.value)
    current = current.rest
  }
  return result
}



