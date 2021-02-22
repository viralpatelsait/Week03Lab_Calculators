/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 834171
 */
public class ArithmeticCalculatorServlet extends HttpServlet {
     @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         request.setAttribute("ans", "--");
       getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String first = request.getParameter("first");
        String second = request.getParameter("second");
        String operator = request.getParameter("calculate");
        if( first == null || first.equals("") || second == null || second.equals("")){
        request.setAttribute("ans", "Enter valid number");
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
        }
            int firstInt = Integer.parseInt(first);
            int secondInt = Integer.parseInt(second);
            int ans = 0;
            
        if("+".equals(operator)){
            ans = firstInt + secondInt;     
        }
        else if ("-".equals(operator)){
            ans = firstInt - secondInt;   
        }
        else if ("*".equals(operator)){
            ans = firstInt * secondInt;   
        }
        else if ("%".equals(operator)){
            ans = firstInt % secondInt;   
        }
         request.setAttribute("ans",ans);
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
        }
}
