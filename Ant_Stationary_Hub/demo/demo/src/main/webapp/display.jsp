<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.example.demo.domani.Customer"%>
<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Order List</title>
    <style>
        table {
            width: 100%;
            border-collapse: collapse;
        }

        th, td {
            border: 1px solid #dddddd;
            text-align: left;
            padding: 8px;
        }

        th {
            background-color: #f2f2f2;
        }
    </style>
</head>
<body>

<h2>Order List</h2>

<table>
    <thead>
        <tr>
            <th>Order Number</th>
            <th>Name</th>
            <th>Surname</th>
            <th>Phone Number</th>
            <th>Address</th>
            <!-- Add more table headers as needed -->
        </tr>
    </thead>
    <tbody>
        <% 
            List<Customer> prod = (List<Customer>) request.getAttribute("prod");
            if (prod != null && !prod.isEmpty()) {
                for (Customer events : prod) {
        %>
        <tr>
            <td><%=events.getOrderNum()%></td>
            <td><%=events.getName()%></td>
            <td><%=events.getSurname()%></td>
            <td><%=events.getAddress()%></td>
            <td><%=events.getPhoneNumber()%></td>
            <!-- Add more table cells with corresponding event properties -->
        </tr>
        <% 
                }
            } else { 
        %>
        <tr>
            <td colspan="5">No Customer found</td>
        </tr>
        <% } %>
    </tbody>
</table>
<p>Click <a href="menu.html">here</a> to go back to the menu.</p>
</body>
</html>
