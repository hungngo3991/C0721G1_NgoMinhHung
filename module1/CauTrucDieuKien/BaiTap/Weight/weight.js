
let wei = parseInt(prompt("Nhập vào cân nặng"))
let hei= parseFloat(prompt("Nhập vào chiều cao"))

let bmi = wei / (hei * hei)
let BMI = bmi.toFixed(2)

if ( bmi >= 30){
    document.writeln("BMI = " +BMI +": Obese")
} else if ( bmi >= 25){
    document.writeln("BMI = " +BMI +": Overweight")
} else if ( bmi >= 18.5){
    document.writeln("BMI = " +BMI +": Normal")
} else{
    document.writeln("BMI = " +BMI +": Underweight")
}




