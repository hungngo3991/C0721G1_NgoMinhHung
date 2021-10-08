package controller;

import model.Customer;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "CustomerServlet", urlPatterns = "")
public class CustomerServlet extends HttpServlet {

    private static final List<Customer> customerList;

    static {
        customerList = new ArrayList<>();
        customerList.add(new Customer("Mai Văn Hoàn", "1983-08-20", "Hà Nội", ""));
        customerList.add(new Customer("Nguyễn Văn Nam", "1983-08-21", "Bắc Giang", ""));
        customerList.add(new Customer("Nguyễn Thái Hòa", "1983-08-22", "Nam Định", ""));
        customerList.add(new Customer("Trần Đăng Khoa", "1983-08-17", "Hà Tây", ""));
        customerList.add(new Customer("Nguyễn Đình Thi", "1983-08-19", "Hà Nội", ""));
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("customerList", customerList);
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }
}
