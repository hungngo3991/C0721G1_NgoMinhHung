package controller;

import model.Calculator;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CalculatorServlet", value = "/calculate")
public class CalculatorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double firstNumber = Double.parseDouble(request.getParameter("firstN"));
        double secondNumber = Double.parseDouble(request.getParameter("secondN"));
        char operator = request.getParameter("operator").charAt(0);
        PrintWriter writer = response.getWriter();
        try {
            double total = Calculator.calculate(firstNumber, secondNumber, operator);
            writer.println("<html>");
            writer.println("<h1>Result: </h1>");
            writer.println("<h3>" + firstNumber + " " + operator + " " + secondNumber + " = " + total + "</h3>");
            writer.println("</html>");
        } catch (Exception e) {
            writer.println("<html>");
            writer.println("<h3>" + e.getMessage() + "</h3>");
            writer.println("</html>");
        }
    }
}
