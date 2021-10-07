function calculateDay() {
    let input = parseInt(document.getElementById('input').value)
    let result = document.getElementById('output')
    switch (input) {

        case 1:
        case 3:
        case 5:
        case 7:
        case 8:
        case 10:
        case 12:
            result.innerHTML = "Tháng " + input + " có 31 ngày"
            break;
        case 2:
            result.innerHTML = "Tháng " + input + " có 28 ngày"
            break;
        case 4:
        case 6:
        case 9:
        case 11:
            result.innerHTML = "Tháng " + input + " có 30 ngày"
            break;
        default:
            result.innerHTML = "Chỉ được nhập vào từ tháng 1-12"


    }
}