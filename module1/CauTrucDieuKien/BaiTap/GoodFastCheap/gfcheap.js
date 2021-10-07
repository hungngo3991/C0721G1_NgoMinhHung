function switchGood() {
    let good = document.getElementById("g").checked
    let cheap = document.getElementById("c").checked
    let fast = document.getElementById("f").checked
    console.log(good, cheap, fast)
    if (cheap && fast) {
        if (Math.random() < 0.5) {
            document.getElementById("c").checked = false
        } else {
            document.getElementById("f").checked = false
        }
    }
}

function switchCheap() {
    let good = document.getElementById("g").checked
    let cheap = document.getElementById("c").checked
    let fast = document.getElementById("f").checked
    console.log(good, cheap, fast);
    if (good && fast) {
        if (Math.random() < 0.5) {
            document.getElementById("g").checked = false
        } else {
            document.getElementById("f").checked = false
        }
    }
}

function switchFast() {
    let good = document.getElementById("g").checked
    let cheap = document.getElementById("c").checked
    let fast = document.getElementById("f").checked
    console.log(good, cheap, fast)
    if (good && cheap) {
        if (Math.random() < 0.5) {
            document.getElementById("g").checked = false
        } else {
            document.getElementById("c").checked = false
        }
    }
}