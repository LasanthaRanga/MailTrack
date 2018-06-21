<%@page import="java.util.ArrayList"%>

<%
    ArrayList plList;
    if (request.getSession().getAttribute("luid") != null) {
        if (request.getSession().getAttribute("pl") != null) {
            plList = (ArrayList<String>) request.getSession().getAttribute("pl");
        }
    }
%>