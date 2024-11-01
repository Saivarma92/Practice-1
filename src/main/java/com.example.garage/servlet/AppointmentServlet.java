package com.example.garage.servlet;

import com.example.garage.model.Appointment;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@WebServlet("/appointment")
public class AppointmentServlet extends HttpServlet {
    private List<Appointment> appointments = new ArrayList<>();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String vehiclePlate = request.getParameter("vehiclePlate");
        String mechanicName = request.getParameter("mechanicName");
        Date appointmentDate = new Date(); // For simplicity

        appointments.add(new Appointment(vehiclePlate, mechanicName, appointmentDate));
        request.setAttribute("appointments", appointments);
        request.getRequestDispatcher("viewAppointments.jsp").forward(request, response);
    }
}

