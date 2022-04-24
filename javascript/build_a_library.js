class Media {
  constructor(title) {
    this._title = title
    this._isCheckedOut = false
    this._ratings = []
  }

  get title() {
    return this._title
  }

  get isCheckedOut() {
    return this._isCheckedOut
  }

  get ratings(){
    return this._ratings
  }

  toggleCheckOutStatus(){
    this._isCheckedOut = !this._isCheckedOut
  }

  getAverageRating(){
    return this._ratings.reduce((currentSum, rating) => currentSum + rating, 0) / this._ratings.length
  }

  addRating(rating){
    this._ratings.push(rating)
  }
}

class Book extends Media {
  constructor(author, pages, isCheckedOut, ratings){
    super(title)
    this._author = author
    this._pages = pages
    this._isCheckedOut = false
    this._ratings = []
  }
  get author(){
    return this._author
  }
  get pages(){
    return this._pages
  }
  get isCheckedOut(){
    return this._isCheckedOut
  }
  get ratings(){
    return this._ratings
  }
  getAverageRating(){
    return this._ratings.reduce((currentSum, rating) => currentSum + rating, 0)
  }
  toggleCheckOutStatus(){
    this._isCheckedOut = !this._isCheckedOut
  }
  addRating(rating){
    this._ratings.push(rating)
  }
}

class Movie extends Media {
  constructor(director, runTime, isCheckedOut, ratings, movieCast){
    super(title)
    this._director = director
    this._runTime = runTime    
    this._isCheckedOut = false
    this._ratings = []
    this._movieCast = []
  }
  get director(){
    return this._director
  }
  get runTime(){
    return this._runTime
  }
  get isCheckedOut(){
    return this._isCheckedOut
  }
  get ratings(){
    return this._ratings
  }
  getAverageRating(){
    this._ratings.reduce((currentSum, rating) => currentSum + rating, 0)
  }
  toggleCheckOutStatus(){
    this._isCheckedOut = !this._isCheckedOut
  }
  addRating(rating){
    this._ratings.push(rating)
  }
}

historyOfEverything = new Book('Bill Bryson', 'A Short History Of Everything', 544)

historyOfEverything.toggleCheckOutStatus()
console.log(historyOfEverything.isCheckedOut())
historyOfEverything.addRating(4)
historyOfEverything.addRating(5)
historyOfEverything.addRating(5)

console.log(historyOfEverything.getAverageRating())

speed = new Movie ('Jan de Bont', 'Speed', 116)

speed.toggleCheckOutStatus()
console.log(speed.isCheckedOut())
speed.addRating(1)
speed.addRating(1)
speed.addRating(5)
console.log(speed.getAverageRating())

