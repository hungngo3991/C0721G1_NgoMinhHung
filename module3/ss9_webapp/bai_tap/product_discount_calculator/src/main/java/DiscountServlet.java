import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DiscountServlet", value = "/display-discount")
public class DiscountServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String productdescription = request.getParameter("productdescription");
        float listprice = Float.parseFloat(request.getParameter("listprice"));
        float discountpercent = Float.parseFloat(request.getParameter("discountpercent"));

        float discountamount = (float) (listprice * discountpercent * 0.01);
        float discountprice = listprice - discountamount;

        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h2>Product Description: " + productdescription + "</h2><br>");
        writer.println("<h2>List Price: " + listprice + "</h2><br>");
        writer.println("<h2>Discount Percent: " + discountpercent + "%</h2><br>");
        writer.println("<h2>Discount Amount: " + discountamount + "</h2><br>");
        writer.println("<h2>Discount Price: " + discountprice + "</h2><br>");
        writer.println("</html>");
    }
}
