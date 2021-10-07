package casestudy.src.models;

public class Customer extends Person {
    private String idCustomer;
    private String customerType;
    private AddressCustomer addressCustomer;

    public Customer() {
    }

    public Customer(String name, String birthday, String gender, String idCardNumber, String phoneNumber, String email,
                    String idCustomer, String customerType, AddressCustomer addressCustomer) {
        super(name, birthday, gender, idCardNumber, phoneNumber, email);
        this.idCustomer = idCustomer;
        this.customerType = customerType;
        this.addressCustomer = addressCustomer;
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public AddressCustomer getAddressCustomer() {
        return addressCustomer;
    }

    public void setAddressCustomer(AddressCustomer addressCustomer) {
        this.addressCustomer = addressCustomer;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "idCustomer='" + idCustomer + '\'' +
                ", customerType=" + customerType +
                ", addressCustomer=" + addressCustomer +
                "} " + super.toString();
    }
}
