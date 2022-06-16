
document.getElementById("btn1").addEventListener("click", function(){ alert("You pressed the shdang btn.")})

document.getElementById("btn2").addEventListener("click", 
    function() {
        function appendElement (elemNode, textContent, parent) {
            parent.appendChild(document.createElement(elemNode)).textContent = textContent;
        }
        appendElement("button","lorem", document.getElementById("container"));
    }
)