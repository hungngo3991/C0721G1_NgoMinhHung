function change(vitri) {
    let above = document.getElementById('above')
    let center = document.getElementById('center')
    let below = document.getElementById('below')
    if (vitri === above) {
        if (above.getAttribute('src') === "top.PNG") {
            above.src = "top2.PNG"
        } else if (above.getAttribute('src') === "top2.PNG") {
            above.src = "top3.PNG"
        } else {
            above.src = "top.PNG"
        }

    } else if (vitri === center) {
        if (center.getAttribute('src') === "mid.PNG") {
            center.src = "mid2.PNG"
        } else if (center.getAttribute('src') === "mid2.PNG") {
            center.src = "mid3.PNG"
        } else {
            center.src = "mid.PNG"
        }

    } else if (vitri === below) {
        if (below.getAttribute('src') === "bot.PNG") {
            below.src = "bot2.PNG"
        } else if (below.getAttribute('src') === "bot2.PNG") {
            below.src = "bot3.PNG"
        } else {
            below.src = "bot.PNG"
        }

    }

    checkImage()

}

function checkImage() {
    if (above.getAttribute('src') === "top2.PNG" &&
        center.getAttribute('src') === "mid2.PNG" &&
        below.getAttribute('src') === "bot2.PNG") {

        alert("Perfect House")

    } else if (above.getAttribute('src') === "top3.PNG" &&
        center.getAttribute('src') === "mid3.PNG" &&
        below.getAttribute('src') === "bot3.PNG") {

        alert("Wonderful Samsung Galaxy")
    }

}














