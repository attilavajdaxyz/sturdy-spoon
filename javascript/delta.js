function delta(string){
    let array = string.split(' ')
    let result = []
    result.push(array[0]) // [10]
    for (let i = 0; i < array.length - 1; i++) { // [10, 20, 30]
      result.push(array[i] - array[i + 1])
    }
    return result.join(' ')
  }
