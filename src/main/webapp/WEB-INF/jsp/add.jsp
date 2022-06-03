<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>Online shop</title>

    <link href="<c:url value="/theme/css/main.css"/>" rel="stylesheet">

</head>
<%@ include file="header.jsp" %>
<body>

    <div id="header_main">
        <div id="header_main_image">
            <div id="header_main_text">
                <p>
                    Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut
                    laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation
                    ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat.
                </p>
            </div>
        </div>
    </div>
    <div id="boxy">
        <div id="boxy_box_1">
            <h2>Formularz uczestnika festiwalu</h2>
            <p>
                <form:form method="post"
                           modelAttribute="participant">
                    <form:hidden path="id"/>
                    <form:input path="name" />
                    <form:input path="surname" />
                    <form:input path="quantityOfDays" />
                    <form:input path="type" />
                    <input type="submit">
                </form:form>
            </p>
            <a href="#">Oferta</a>
        </div>
    </div>
</div>
</body>
</html>
