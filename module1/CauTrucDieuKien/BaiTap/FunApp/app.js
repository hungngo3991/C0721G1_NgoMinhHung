function clickonY() {
    alert("Of course he will")
}

function noHover() {
    let no = document.getElementById('no')

    let w = window.innerWidth
    let h = window.innerHeight

    let left = Math.round(Math.random() * w)
    let top = Math.round(Math.random() * h)

    no.style.left = left + 'px'
    no.style.top = top + 'px'


}


