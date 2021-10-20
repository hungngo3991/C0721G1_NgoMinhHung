package controller;

import model.bean.Contract;
import model.bean.ContractDetail;
import model.service.impl.ContractDetailServiceImpl;
import model.service.impl.ContractServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "ContractDetailServlet", value = "/contractDetail")


public class ContractDetailServlet extends HttpServlet{
    private static final long SERIAL_VERSION_UID = 1L;
    private ContractDetailServiceImpl contractDetailService;

    public void init() {
        contractDetailService = new ContractDetailServiceImpl();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        if ("create".equals(action)) {
            showNewForm(request, response);
        }


    }



    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        try {
            if ("create".equals(action)) {
                createContractDetail(request, response);
            }
        } catch (SQLException ex) {
            throw new ServletException(ex);
        }
    }


    private void showNewForm(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("contractDetail/create.jsp");
        dispatcher.forward(request, response);
    }

    private void createContractDetail(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {

        int id = Integer.parseInt(request.getParameter("id"));
        int contractId = Integer.parseInt(request.getParameter("contractId"));
        int attachServiceId = Integer.parseInt(request.getParameter("attachServiceId"));
        int quantity = Integer.parseInt(request.getParameter("quantity"));



        ContractDetail contractDetailCreate = new ContractDetail(id, contractId, attachServiceId, quantity);
        contractDetailService.addContractDetail(contractDetailCreate);

        request.setAttribute("message", "New Contract Detail has been created successfully!");
        RequestDispatcher dispatcher = request.getRequestDispatcher("contractDetail/create.jsp");
        dispatcher.forward(request, response);
    }

}
