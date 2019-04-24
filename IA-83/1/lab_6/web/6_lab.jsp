<%@ page contentType="text/html;charset=UTF-8" language="java" import="list.ListOfInf" import="java.util.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="list.Param" %>
<%@ page import="java.util.function.BiConsumer" %>
<%@ page import="java.util.function.Function" %>

<html>
<head>
    <title>Title</title>
    <link href="6_lab.css" rel="stylesheet">
</head>
<body>
<div class="wrapper">
    <div class="container">
        <div class="topmenu clearfix">
            <ul>
                <li><a href="team.jsp">Home</a></li>
                <li><a href="#">Premium</a></li>
                <li><a href="#">Modelhub</a></li>
                <li><a href="#">Shop</a></li>
                <li><a href="#">Toys</a></li>
                <li><a href="#">Wellnes</a></li>
                <li><a href="#">Insights</a></li>
                <li><a href="#">Sites</a></li>
                <li><a href="#">En</a></li>
            </ul>
        </div>
    </div>
    <div class="container-grey">
        <div class="container">
            <div class="mainlogo">
                <div class="logo">
                    IA83
                </div>
                <div class="hub">
                    hub
                </div>
            </div>
            <div class="search">
                <form action="" method="get">
                    <input name="s" placeholder="Search" type="search">
                    <a href="#">➢</a>
                </form>
            </div>
            <div class="buttons">
                <a href="#" class="first">Upload</a>
                <a href="${pageContext.request.contextPath}/choseform.jsp" class="second">5 lab</a>
            </div>
        </div>
    </div>
    <div class="content">
        <div class="content_container">
            <hr/>
            <h1>Formula</h1>
            <hr/>
            <form action="${pageContext.request.contextPath}/6_lab.jsp" method="get" style="color:white" class="forma">
                <table style="color: #ffffff;" class="inputFormTable">
                    <%
                        session = request.getSession(true);
                        Map <String, Param> params = new HashMap <>();
                        try {
                            for (String paramName : ListOfInf.getParamNames()) {
                                params.put(paramName, new Param(
                                        Integer.parseInt(request.getParameter(paramName)),
                                        Integer.parseInt(request.getParameter(paramName + "_end")),
                                        Integer.parseInt(request.getParameter(paramName + "_step")
                                        )
                                ));
                            }
                        } catch (NumberFormatException e) {
                            params.clear();
                        }
                        for (String paramName : ListOfInf.getParamNames()) {%>
                    <tr>
                        <td>
                            <%=paramName%>:
                        </td>
                        <%
                            Param param1 = params.getOrDefault(paramName, null);
                        %>
                        <td>
                            <label>from:</label><input name="<%=paramName%>" placeholder="<%=paramName%>" type="text"
                                                       autocomplete="off"
                                                       value="<%= (param1 != null) ? param1.getStart() : ""%>">
                        </td>
                        <td>
                            <label>to:</label><input name="<%=paramName%>_end" placeholder="<%=paramName%>_end"
                                                     type="text"
                                                     autocomplete="off"
                                                     value="<%=(param1 != null) ? param1.getEnd() : ""%>">
                        </td>

                        <td>
                            <label>step:</label><input name="<%=paramName%>_step" placeholder="<%=paramName%>_step"
                                                       type="text"
                                                       autocomplete="off"
                                                       value="<%=(param1 != null) ? param1.getStep() : ""%>">
                        </td>
                        <br>
                    </tr>
                    <%}%>
                </table>
                <input type="submit" name="submit" value="submit"/>
            </form>

            <table>
                <tr>
                    <c:forEach var="par" items="${ListOfInf.paramNames}">
                        <td><c:out value="${par}"/></td>
                    </c:forEach>
                    <td>res</td>
                </tr>
                <%

                    int i = 0;
                    double res = 0;
                    Set <String> keys = params.keySet();

                    boolean allKeysPresent = true;
                    for (String keyName : ListOfInf.getParamNames()) {
                        allKeysPresent &= params.containsKey(keyName);
                    }

                    if (allKeysPresent) {


                        for (int a = params.get("a").getStart(); a <= params.get("a").getEnd(); a += params.get("a").getStep()) {
                            for (int b = params.get("b").getStart(); b <= params.get("b").getEnd(); b += params.get("b").getStep()) {
                                for (int c = params.get("c").getStart(); c <= params.get("c").getEnd(); c += params.get("c").getStep()) {
                                    for (int d = params.get("d").getStart(); d <= params.get("d").getEnd(); d += params.get("d").getStep()) {
                                        double count = Math.log(b) / Math.pow(c, d);
                                        double temp = Math.sin(a) - 4 * count;

                                        res=Math.sqrt(Math.abs(temp));

                                        session.setAttribute("a", a);
                                        session.setAttribute("b", b);
                                        session.setAttribute("c", c);
                                        session.setAttribute("d", d);
                                        session.setAttribute("res", res);
                %>
                <tr>
                    <td><%=a%>
                    </td>
                    <td><%=b%>
                    </td>
                    <td><%=c%>
                    </td>
                    <td><%=d%>
                    </td>
                    <td><%=res%>
                    </td>
                </tr>
                <%
                                    }
                                }
                            }
                        }
                    }
                %>
            </table>
        </div>
    </div>
    <div class="footer">
        <p class="footer-text">The Pornhub team is always updating and adding more porn videos every day. It's all here
            and 100% free porn. We have a huge free XXX DVD selection that you can download or stream. Pornhub is the
            most complete and revolutionary porn tube site. We offer streaming porn videos, downloadable XXX DVDs, photo
            albums, and the number 1 free sex community on the net. We’re always working towards adding more features
            that will keep your love for porno alive and well. Send us feedback if you have any questions/comments.</p>
        <div class="container-grey">
            <div class="footer-container">
                <div class="columns">
                    <ul>
                        <li class="column-main-text">Zaglushka</li>
                        <li><a href="#">Terms & Conditions</a></li>
                        <li><a href="#">Privacy Policy</a></li>
                        <li><a href="#">DMCA</a></li>
                        <li><a href="#">2257</a></li>
                    </ul>
                </div>
                <div class="columns">
                    <ul>
                        <li class="column-main-text">Work With Us</li>
                        <li><a href="#">Content Partners</a></li>
                        <li><a href="#">Advertise</a></li>
                        <li><a href="#">Webmasters</a></li>
                        <li><a href="#">Zaglushka</a></li>
                        <li><a href="#">Press</a></li>
                    </ul>
                </div>
                <div class="columns">
                    <ul>
                        <li class="column-main-text">Support and Help</li>
                        <li><a href="#">FAQ</a></li>
                        <li><a href="#">Contact Support</a></li>
                        <li><a href="#">Feedback Forum</a></li>
                        <li><a href="#">Sitemap</a></li>
                    </ul>
                </div>
                <div class="columns">
                    <ul>
                        <li class="column-main-text">Discover</li>
                        <li><a href="#">Zaglushka</a></li>
                        <li><a href="#">Zaglushka</a></li>
                        <li><a href="#">Zaglushka</a></li>
                        <li><a href="#">Zaglushka</a></li>
                        <li><a href="#">Zaglushka</a></li>
                        <li><a href="#">More</a></li>
                    </ul>
                </div>
            </div>
        </div>
        <footer><p class="footer-down-text">© IA83HUB.com, 2019</p></footer>
    </div>
</div>
</body>
</html>
