package com.octp.servelets;

import com.octp.bean.Operation;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Calculator")
public class Calculator extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.getServletContext().getRequestDispatcher("/WEB-INF/calculatrice.jsp").forward(request,response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int numberOne = 0;
        if (request.getParameter("firstNumber") == null || request.getParameter("firstNumber").equals("")) {
            numberOne = 0;
        }
        else {
            numberOne = Integer.parseInt(request.getParameter("firstNumber"));
        }
        int numberTwo = 0;
        if (request.getParameter("secondNumber") == null || request.getParameter("secondNumber").equals("")) {
            numberTwo = 0;
        }
        else {
            numberTwo = Integer.parseInt(request.getParameter("firstNumber"));
        }
        Operation operation = new Operation(
                numberOne,
                request.getParameter("operator"),
                numberTwo);
        request.setAttribute("operation",operation);
        this.getServletContext().getRequestDispatcher("/WEB-INF/calculatrice.jsp").forward(request, response);

    }

}
