class app {
    constructor() {
        this.el = document.getElementById('products');
        this.products = ['Sony Xperia', 'Samsung Galaxy', 'Nokia 6', 'Xiaomi Redmi Note 4', 'Samsung Galaxy Note', 'Xiaomi Mi 5s Plus', 'Samsung Galaxy Note 8', 'Fujitsu F-04E', 'Oppo A71'];
    }

    count(data) {
        let el = document.getElementById('counter');
        let name = 'product';
        if (data) {
            if (data > 1) {
                name = 'products';
            }
            el.innerHTML = data + ' ' + name;
        } else {
            el.innerHTML = 'No ' + name;
        }
    }

    fetchAll() {
        let data = '';
        if (this.products.length > 0) {
            for (let i = 0; i < this.products.length; i++) {
                data += '<tr>';
                data += '<td>' + this.products[i] + '</td>';
                data += '<td><button onclick="app.edit(' + i + ')">Edit</button></td>';
                data += '<td><button onclick="app.delete(' + i + ')">Delete</button></td>';
                data += '</tr>';
            }
        }
        this.count(this.products.length);
        return this.el.innerHTML = data;
    }

    add() {
        let el = document.getElementById('add-name');
        let product = el.value;
        if (product) {
            this.products.push(product.trim());
            el.value = '';
            this.fetchAll();
        }
    }

    edit(item) {
        let el = document.getElementById('edit-name');
        el.value = this.products[item];
        document.getElementById('spoiler').style.display = 'block';
        self = this;
        document.getElementById('saveEdit').onsubmit = function () {
            let product = el.value;
            if (product) {
                self.products.splice(item, 1, product.trim());
                self.fetchAll();
                closeInput();
            }
        }
    }

    delete(item) {

        this.products.splice(item, 1);
        this.fetchAll();

    }
}

app.fetchAll();

function closeInput() {
    document.getElementById('spoiler').style.display = 'none';
}