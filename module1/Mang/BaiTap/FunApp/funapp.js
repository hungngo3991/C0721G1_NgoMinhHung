let a = Array(),
    n = "";
a[1] = 'M';
a[2] = 'R';
a[3] = '.';
a[4] = 'H';
a[5] = 'U';
a[6] = 'N';
a[7] = 'G';
a[8] = ' ';
a[9] = 'W';
a[10] = 'I';
a[11] = 'L';
a[12] = 'L';
a[13] = ' ';
a[14] = 'B';
a[15] = 'E';
a[16] = 'C';
a[17] = 'O';
a[18] = 'M';
a[19] = 'E';
a[20] = ' ';
a[21] = 'A';
a[22] = 'N';
a[23] = ' ';
a[24] = 'A';
a[25] = 'I';
a[26] = ' ';
a[27] = 'E';
a[28] = 'X';
a[29] = 'P';
a[30] = 'E';
a[31] = 'R';
a[32] = 'T';

function typeTextarea() {
    let t = document.fun.txt.value
    let j = t.length
    if (j > 0) {
        for (let i = 1; i <= j; i++) {
            n = n + a[i]
            if (i === 33) {
                document.fun.txt.value = ""
                n = ""
            }
        }
    }
    document.fun.txt.value = n
    n = ""
    setTimeout("typeTextarea()", 1)
    //return false;
}