// Bai 1

// let c = parseInt(prompt(" Nhập vào độ C"))
//
// let f = c * 9 / 5 + 32
//
// document.writeln("Chuyển sang độ F là: " + f)

// Bai 2

// let m = parseInt(prompt(" Nhập vào mét"))
//
// let ft = m * 3.2808
//
// document.writeln("Chuyển sang feet là: " + ft)

// Bai 3

// let a = parseInt(prompt(" Nhập vào giá trị cạnh hình vuông"))
//
// let dt = a * a
//
// document.writeln("Diện tích hình vuông là: " + dt)

// Bai 4

// let a = parseInt(prompt(" Nhập vào giá trị cạnh a"))
// let b = parseInt(prompt(" Nhập vào giá trị cạnh b"))
//
// let dt = a * b
// document.writeln("Diện tích hình chữ nhật là: " + dt)

// Bai 5

// let a = parseInt(prompt(" Nhập vào giá trị cạnh a"))
// let b = parseInt(prompt(" Nhập vào giá trị cạnh b"))
//
// let dt = a * b * 1 / 2
// document.writeln("Diện tích tam giác vuông là: " + dt)

// Bai 6


function EquationOfTheFirstOrder() {
    let a = document.getElementById("a6").value;
    let b = document.getElementById("b6").value;
    let res = document.getElementById("result6");
    if (isNaN(a)||isNaN(b)) {
        res.innerHTML = `Dữ liệu không hợp lệ`;
    }
    else if (a == 0 && b == 0){
        res.innerHTML = `Phương trình vô số nghiệm`;
    }
    else if (a != 0 && b == 0){
        res.innerHTML = `Phương trình có nghiệm x = 0`;
    }
    else if (a == 0 && b != 0){
        res.innerHTML = `Phương trình vô nghiệm`;
    }
    else {
        res.innerHTML = `Phương trình có nghiệm x = ${-b/a}`;
    }
}

// Bai 7
function quadraticEquation() {
    let a = document.getElementById("a7").value;
    let b = document.getElementById("b7").value;
    let c = document.getElementById("c7").value;
    let res = document.getElementById("result7");
    if (isNaN(a)||isNaN(b)||isNaN(c)) {
        res.innerHTML = "Dữ liệu không hợp lệ"
    } else {
        let delta = b*b -4*a*c;
        if (delta == 0) {
            res.innerHTML = `Phương trình có nghiệm kép ${-b/(2*a)}`;
        } else if (delta < 0) {
            res.innerHTML = `Phương trình vô nghiệm`
        } else {
            let x1=(-b-Math.sqrt(delta))/(2*a);
            let x2=(-b+Math.sqrt(delta))/(2*a);
            res.innerHTML = `Phương trình có 2 nghiệm phân biệt : ${x1} ;  ${x2}`
        }
    }
}

// Bai 8
function isAge() {
    let age = document.getElementById("age").value;
    let res = document.getElementById("result8");
    if (isNaN(age)) {
        res.innerHTML = "Dữ liệu không hợp lệ"
    } else if ( age >120 || age<0) {
        res.innerHTML = "Dữ liệu nhập vào không phải tuổi"
    } else {
        res.innerHTML = "Dữ liệu nhập vào là tuổi"
    }
}
// Bai 9
function checkTriangle() {
    let a = document.getElementById("a9").value;
    let b = document.getElementById("b9").value;
    let c = document.getElementById("c9").value;
    let res = document.getElementById("result9");
    if (isNaN(a)||isNaN(b)||isNaN(c)) {
        res.innerHTML = "Dữ liệu không hợp lệ"
    } else if ( (a>0 && b>0 && c>0) && ((a + b > c) || (a + c > b) || (b + c > a)) ) {
        res.innerHTML = "Dữ liệu là các cạnh của một hình tam giác"
    } else {
        res.innerHTML = "Dữ liệu nhập vào không phải là các cạnh của một tam giác"
    }
}



