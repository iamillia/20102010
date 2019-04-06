<%-- 
    Document   : mainPage
    Created on : 01.04.2019, 8:31:28
    Author     : Даниил
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <style>
            * {
                box-sizing: border-box;
            }

            /* Create three unequal columns that floats next to each other */
            .column {
                float: left;
                padding: 10px;
                height: 1000px; /* Should be removed. Only for demonstration */
            }

            .left, .right {
                width: 25%;
            }

            .middle {
                width: 50%;
            }

            /* Clear floats after the columns */
            .row:after {
                content: "";
                display: table;
                clear: both;
            }
        </style>
    </head>
<body>
    <div class="row">
        <div class="column left" style="background-color:#aaa;">
            <form action="Controller" method="get">
                <p><b>telephone model &quot;ОС&quot;?</b></p>
                <p><input type="radio" name="model" value="MeizuM6" checked>MeizuM6<Br>
                    <input type="radio" name="model" value="Homtion">Homtion<Br>
                    <input type="radio" name="model" value="Qukitel">Qukitel<Br>
                    <input type="radio" name="model" value="LenovoA5">LenovoA5
                </p>
                <br><br>
                <select name="findType">
                    <option value="getMinPriceLotStores">min price for lot</option>
                    <option value="existsSuspiciousStore">price less than stated</option>
                </select>
                <br><br>
                <p><input type="submit" value = "Find"></p>
            </form>
        </div>       
        <div class="column middle" style="background-color:#bbb;">
            <c:choose>
                <c:when test = "${requestType == 'getMinPriceLotStores'}">
                    <h2>Price for ${modelName}</h2>
                    <hr align="center"/>
                    <c:forEach items="${MinPriceStores}" var="OnlineStore">
                        <h2><c:out value="Store : ${OnlineStore.name}"/></h2>
                        <h2><c:out value=" Price : ${Price}"/></h2><p>
                        <hr align="center"/>
                    </c:forEach> 
                </c:when>
                    <c:when test = "${requestType == 'existsSuspiciousStore'}">
                        <h2><c:out value="${Exist}"/></h2>
                    </c:when>
            </c:choose>

        </div>
        <div class="column right" style="background-color:#ccc;">
        </div>
    </div>
</body>
</html>
