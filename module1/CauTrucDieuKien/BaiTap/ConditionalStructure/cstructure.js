// Bai 1

let a = parseInt(prompt(" Nhập vào số a"))
let b = parseInt(prompt(" Nhập vào số b"))

if (a % b === 0) {
    document.writeln(" Số a chia hết cho số b")
} else {
    document.writeln(" Số a không chia hết cho số b")
}

// Bai 2

// let age = parseInt(prompt(" Nhập vào tuổi"))
//
// if (age >= 18) {
//     document.writeln(" Không đạt điều kiện vào học lớp 10")
// } else if (age >= 15) {
//     document.writeln(" Đạt điều kiện vào học lớp 10")
// } else {
//     document.writeln(" Không đạt điều kiện vào học lớp 10")
// }

// Bai 3

// let number = parseInt(prompt("Nhập vào một số nguyên bất kỳ"))
// if (number > 0){
//     document.writeln(" Số đã nhập lớn hơn 0")
// }else if(number < 0){
//     document.writeln(" Số đã nhập bé hơn 0")
// } else{
//     document.writeln(" ")
// }

// Bai 4

// let num1 = parseInt(prompt("Nhập vào số nguyên 1"))
// let num2 = parseInt(prompt("Nhập vào số nguyên 2"))
// let num3 = parseInt(prompt("Nhập vào số nguyên 3"))
//
// if (num1 > num2 && num1 > num3) {
//     document.writeln(" Số nguyên 1 là lớn nhất")
// } else if (num1 > num2 && num1 < num3) {
//     document.writeln(" Số nguyên 3 là lớn nhất")
// } else if (num1 < num2 && num1 > num3) {
//     document.writeln(" Số nguyên 2 là lớn nhất")
// } else {
//     if (num2 < num3) {
//         document.writeln(" Số nguyên 3 là lớn nhất")
//     } else {
//         document.writeln(" Số nguyên 2 là lớn nhất")
//     }
// }

// Bai 5

// let giuaky = parseInt(prompt("Nhập vào điểm giữa kỳ"))
// let cuoiky = parseInt(prompt("Nhập vào điểm cuối kỳ"))
// let tb = (giuaky + cuoiky)/2
//
// if (tb >= 9){
//     document.writeln("Điểm TB: " +tb +" Loại giỏi ")
// }else if(tb >=7){
//     document.writeln("Điểm TB: " +tb +" Loại khá ")
// } else if(tb >=5){
//     document.writeln("Điểm TB: " +tb +" Loại trung bình ")
// } else{
//     document.writeln("Điểm TB: " +tb +" Loại yếu ")
// }

// Bai 6

// let hoahong
// let doanhso = parseInt(prompt("Nhập vào doanh số bán hàng"))
//
// if (doanhso >= 2000000) {
//     hoahong = doanhso * 20 / 100
//     document.writeln("Hoa hồng nhận được là: " + hoahong)
// } else if (doanhso >= 1000000) {
//     hoahong = doanhso * 10 / 100
//     document.writeln("Hoa hồng nhận được là: " + hoahong)
// } else {
//     hoahong = doanhso * 5 / 100
//     document.writeln("Hoa hồng nhận được là: " + hoahong)
// }

// Bai 7

// Gia su cuoc phi goi dien thoai 1 phut la 3.300 dong
//Cuoc phi dien thoai
// let cuoc

//Tong so phut da goi
// let tong = parseInt(prompt("Nhập vào số phút đã gọi điện thoại"))
//

// if (tong >= 300){
//     cuoc = tong * 3000
//     document.writeln("Tổng cước phí điện thoại phải trả là: " + cuoc + "VND")
// }else if(tong >=150){
//     cuoc = tong * 3150
//     document.writeln("Tổng cước phí điện thoại phải trả là: " + cuoc + "VND")
// }else{
//     cuoc = tong * 3300
//     document.writeln("Tổng cước phí điện thoại phải trả là: " + cuoc + "VND")
// }
