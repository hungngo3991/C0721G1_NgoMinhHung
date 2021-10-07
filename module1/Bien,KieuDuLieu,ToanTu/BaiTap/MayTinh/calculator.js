function calculate(operator) {
    let input = parseInt(document.getElementById('input').value)
    let input2 = parseInt(document.getElementById('input2').value)
    let output

    let cong = document.getElementById('cong')

    let tru = document.getElementById('tru')
    let nhan = document.getElementById('nhan')
    let chia = document.getElementById('chia')
    let result = document.getElementById("output")

    if (operator === cong) {
        output = input + input2
        result.innerHTML = "Result Division: " + output
    } else if (operator === tru) {
        output = input - input2
        result.innerHTML = "Result Division: " + output
    } else if (operator === nhan) {
        output = input * input2
        result.innerHTML = "Result Division: " + output
    } else if (operator === chia) {
        output = input / input2
        let op = output.toFixed(2)
        result.innerHTML = "Result Division: " + op
    }


}



