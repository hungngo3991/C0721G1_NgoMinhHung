function convert() {
    let factor
    let f = document.getElementById('from').value
    let t = document.getElementById('to').value
    let input = document.getElementById('input').value
    let output
    let result = document.getElementById("output")
    if (f === 'VND' && t === 'USD') {
        factor = 0.000043
        output = input * factor

        result.innerHTML = "Result: " + output + " USD"


    } else if (f === 'USD' && t === 'VND') {
        factor = 23000
        output = input * factor
        result.innerHTML = "Result: " + output + " VND"

    } else{
        factor = 1
        output = input * factor
        result.innerHTML = "Result: " + output
    }
}