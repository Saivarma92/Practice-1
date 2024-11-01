<html>
<head><title>Appointments</title></head>
<body>
    <h2>View Appointments</h2>
    <form action="appointment" method="post">
        Vehicle Plate: <input type="text" name="vehiclePlate"><br>
        Mechanic Name: <input type="text" name="mechanicName"><br>
        <input type="submit" value="Add Appointment">
    </form>
    <h3>Appointment List</h3>
    <ul>
        <c:forEach var="appointment" items="${appointments}">
            <li>${appointment.vehiclePlate} with ${appointment.mechanicName} on ${appointment.appointmentDate}</li>
        </c:forEach>
    </ul>
</body>
</html>

