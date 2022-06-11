// this is today collage script 😉

function addVAT(price, vat) {
    return price * (1 + vat) // Oh! You add and mulitply with numbers, so it's a number
}   

let heading = document.getElementById("this-is-heading") // What can I do with this? 
heading.innerText = heading.innerText.split('').reverse().join();

const input = document.querySelector('input');
const log = document.getElementById('values');

input.addEventListener('input', updateValue);

function updateValue(e) {
  log.textContent = e.target.value;
}


// window.alert("Hello good morning how are you? 😉")

// window.alert(document.getElementById("this-is-heading"))


// display code in browser
// Write heading backwards