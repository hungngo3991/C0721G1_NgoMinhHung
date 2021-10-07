package casestudy.src.models;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Booking implements Comparable<Booking> {
    private String idBooking;
    private String startDate;
    private String endDate;
    private String idCustomer;
    private String nameService;
    private String idService;

    public Booking() {
    }

    public Booking(String idBooking, String startDate, String endDate, String idCustomer, String nameService, String idService) {
        this.idBooking = idBooking;
        this.startDate = startDate;
        this.endDate = endDate;
        this.idCustomer = idCustomer;
        this.nameService = nameService;
        this.idService = idService;
    }

    public String getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(String idBooking) {
        this.idBooking = idBooking;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public String getIdService() {
        return idService;
    }

    public void setIdService(String idService) {
        this.idService = idService;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "idBooking='" + idBooking + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", idCustomer='" + idCustomer + '\'' +
                ", nameService='" + nameService + '\'' +
                ", idService='" + idService + '\'' +
                '}';
    }

    @Override
    public int compareTo(Booking o) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            if (dateFormat.parse(this.getStartDate()) == dateFormat.parse(o.getStartDate())) {
                return (dateFormat.parse(this.getEndDate()).compareTo(dateFormat.parse(o.getEndDate())));
            } else if (dateFormat.parse(this.getStartDate()).compareTo(dateFormat.parse(o.getStartDate())) > 0) {
                return -1;
            }

        } catch (ParseException e) {
            e.printStackTrace();
        }
        return 1;
    }
}
