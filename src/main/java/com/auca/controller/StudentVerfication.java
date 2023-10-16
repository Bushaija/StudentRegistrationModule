package com.auca.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.auca.util.DatabaseConnection;

@WebServlet("/verifyStudentId")
public class StudentVerfication extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public StudentVerfication() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().append("Served at: ").append(request.getContextPath());
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = null;
        String studentId = request.getParameter("studentId");

        try {
            Connection connection = DatabaseConnection.getConnection();
            PreparedStatement pst = connection.prepareStatement("SELECT * FROM Student WHERE student_id = ?");
            pst.setString(1, studentId);

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                dispatcher = request.getRequestDispatcher("AddCourses.jsp");
            } else {
                dispatcher = request.getRequestDispatcher("index.jsp");
            }

            dispatcher.forward(request, response);
        } catch (Exception ex) {
            // Properly log the exception instead of just printing the stack trace
            ex.printStackTrace();
        }
    }
}