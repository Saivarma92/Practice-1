<html>
<head><title>Add Vehicle</title></head>
<body>
    <h2>Add a New Vehicle</h2>
    <form action="vehicle" method="post">
        License Plate: <input type="text" name="licensePlate"><br>
        Model: <input type="text" name="model"><br>
        Owner: <input type="text" name="owner"><br>
        <input type="submit" value="Add Vehicle">
    </form>
    <h3>Vehicle List</h3>
    <ul>
        <c:forEach var="vehicle" items="${vehicles}">
            <li>${vehicle.licensePlate} - ${vehicle.model} - ${vehicle.owner}</li>
        </c:forEach>
    </ul>
</body>
</html>

