package com.example.garage.servlet;

import com.example.garage.model.Vehicle;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/vehicle")
public class VehicleServlet extends HttpServlet {
    private List<Vehicle> vehicleList = new ArrayList<>();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String licensePlate = request.getParameter("licensePlate");
        String model = request.getParameter("model");
        String owner = request.getParameter("owner");

        vehicleList.add(new Vehicle(licensePlate, model, owner));
        request.setAttribute("vehicles", vehicleList);
        request.getRequestDispatcher("addVehicle.jsp").forward(request, response);
    }
}


