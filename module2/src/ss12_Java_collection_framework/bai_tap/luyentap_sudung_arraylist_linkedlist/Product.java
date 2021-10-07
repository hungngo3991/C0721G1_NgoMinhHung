package ss12_Java_collection_framework.bai_tap.luyentap_sudung_arraylist_linkedlist;


public class Product implements Comparable<Product>{
    private String id;
    private String nameProduct;
    private String manufacturer;
    private int price;

    public Product() {
    }

    public Product(String id, String nameProduct, String manufacturer, int price) {
        this.id = id;
        this.nameProduct = nameProduct;
        this.manufacturer = manufacturer;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", nameProduct='" + nameProduct + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", price=" + price +
                '}';
    }
//    Sap xep tang dan

//    @Override
//    public int compareTo(Product o) {
//        if(this.getPrice() > o.getPrice()){
//            return 1;
//        }
//        return -1;
//    }

//    Sap xep giam dan
    @Override
    public int compareTo(Product o) {
        if(this.getPrice() < o.getPrice()){
            return 1;
        }
        return -1;
    }

}
