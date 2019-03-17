import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class calculating extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-16");
        PrintWriter printWriter = resp.getWriter();
        try {

            String a = req.getParameter("a1");
            String b = req.getParameter("b1");
            String c = req.getParameter("c1");
            String d = req.getParameter("d1");

            double a1 = Double.parseDouble(a);
            double b1 = Double.parseDouble(b);
            double c1 = Double.parseDouble(c);
            double d1 = Double.parseDouble(d);
            if(c1 == 0){
                resp.sendError(400, "c != 0 exception" );
            }
            else if (b1==0){
                resp.sendError(400,"b != 0 exception");
            }
            else if (d1 == 0){
                resp.sendError(400, "d != 0 exception");
            }


            double result = (Math.pow(a1, b1)/Math.sinh(Math.abs(b1))) + 4* (Math.log10(c1)/ Math.pow(d1,(1.0/4)));
            String result1 = Double.toString(result);
            String a2 = Double.toString(a1);
            String b2 = Double.toString(b1);
            String c2 = Double.toString(c1);
            String d2 = Double.toString(d1);
            System.out.println(d2);
            if(result != 0){

                Cookie cookie1 = new Cookie("test", "result");
                cookie1.setValue("a: " +  a2 +" " + "b: "+  b2 +" "+ "c: " +  c2 +" "+ "d: "+ d2);
                cookie1.setMaxAge(24 * 2 * 60 * 60);
                resp.addCookie(cookie1);
                printWriter.println(cookie1.getValue());
                printWriter.println(cookie1.getName());

            }
            resp.setContentType("text/html");


            printWriter.println("<!DOCTYPE html>");
            printWriter.println("<html>");
            printWriter.println("<head>");
            printWriter.println("<title>Servlet</title>");
            printWriter.println("<style>");
            printWriter.println("body{background: palegreen;}");
            printWriter.println("</style>");
            printWriter.println("</head>");
            printWriter.println("<body>");
            printWriter.println("<p>it's working!</p>");
            printWriter.println("<p>here is corgi</p>");
            printWriter.println(String.format("(Math.pow(a1, b1)/Math.sinh(Math.abs(b1))) + 4* (Math.log10(c1)/ Math.pow(d1,(1.0/4))) =\n"+ result ));
            printWriter.println("<p><img src= data:image/jpeg;base64,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 alt=\"сложнота\"></p>");
            printWriter.println("<body>");
            printWriter.println("</html>");
        }finally{
            printWriter.close();
        }
    }
}
