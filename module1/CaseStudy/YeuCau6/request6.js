
class Customer {
    constructor(name) {
        this.lotte = [];
        this.name = name;
    }

    buyLotte(lotte) {
        if (this.lotte.length <= 4) {
            this.lotte.push(lotte.number);
        } else {
            alert("You have purchased more than 4 tickets!")
        }
    }
}


class Lotte {
    constructor() {
        this.number = [];
    }

    inputNumber(number) {
        if (number >= 0 && number <= 99) {
            this.number.push(number);
        } else {
            alert("You entered the wrong format!")
        }
    }
}



let customer = new Customer("Alex Telles");



function buyLotte() {
    if (customer.lotte.length < 4) {
        for (let a = 0; a < 4; a++) {
            alert("You buy a ticket " + (a + 1));
            let b = parseInt(prompt("You have 2 options: " + "\n" + "1. You want to choose the number yourself" +
                "\n" + "2. Number selection system"));
            switch (b) {
                case 1:
                    let lotte = new Lotte();
                    for (let i = 1; i <= 6; i++) {
                        let number = parseInt(prompt("Please enter the number " + i + " between 0-99"));
                        document.getElementById("number" + i).innerHTML = number;
                        document.getElementById("number" + i).value = number;
                        lotte.inputNumber(number);
                    }
                    customer.buyLotte(lotte);
                    document.getElementById("num" + a).innerHTML = "You bought the ticket number " + (a + 1) + " : " + customer.lotte[a];
                    break;
                case 2:
                    let lotteRandom = new Lotte();
                    for (let j = 1; j <= 6; j++) {
                        let numberRandom = Math.floor(Math.random() * 99);
                        document.getElementById("number" + j).innerHTML = numberRandom;
                        document.getElementById("number" + j).value = numberRandom;
                        lotteRandom.inputNumber(numberRandom);
                    }
                    customer.buyLotte(lotteRandom);
                    document.getElementById("num" + a).innerHTML = "You bought the ticket number " + (a + 1) + " : " + customer.lotte[a];
                    break;
                default:
                    alert("Please enter 1 or 2");
            }
        }
    } else {
        alert("You have bought 4 tickets for the day!");
    }
}


function checkResult() {
    let randomResult = [];
    let count = 0;
    for (let i = 0; i < 6; i++) {
        randomResult[i] = Math.floor(Math.random() * 99);
    }
    document.getElementById("random").innerHTML = "The winning ticket is: " + randomResult.join();
    for (let i = 0; i < customer.lotte.length; i++) {
        for (let j = 0; j < customer.lotte[i].length; j++)
            for (let k = 0; k < randomResult.length; k++) {
                if (customer.lotte[i][j] === randomResult[k]) {
                    count++;
                    break;
                }
            }
    }
    if (count === 6) {
        alert("You won first prize")
    } else if (count === 5) {
        alert("You won second prize")
    } else if (count === 3) {
        alert("You have won a consolation prize")
    } else if (count < 3) {
        alert("Wish you luck next time")
    }
}