import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

/**
 * Created by Влад on 9/12/2016.
 */
@WebServlet(name = "RegistrationServlet")
public class RegistrationServlet extends HttpServlet {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/pokerdb";

    static final String USER = "root";
    static final String PASS = "vlad32ex421baep";

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {



        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        String n=request.getParameter("userName");
        String p=request.getParameter("userPass");


        try{
            Class.forName(JDBC_DRIVER);
            Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
            PreparedStatement ps=conn.prepareStatement("insert into users values(?,?,?,?,?,?)");
            ps.setInt(1,1);//userName
            ps.setString(2,"Kiev");//city
            ps.setString(3,"123456789");//phone
            ps.setString(4,"Vlad");//first
            ps.setString(5,"Petrishin");//last
            ps.setString(6,"abc@def"); //email

            int i=ps.executeUpdate();
            if(i>0)
                out.print("You are successfully registered...");
        }
        catch(Exception e){e.printStackTrace();}
        finally {
            out.close();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

       /* response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");

        try (PrintWriter writer = response.getWriter()) {

            writer.println("<!DOCTYPE html><html>");
            writer.println("<head>");
            writer.println("<meta charset=\"UTF-8\" />");
            writer.println("<title>MyServlet.java:doGet(): Servlet code!</title>");
            writer.println("</head>");
            writer.println("<body>");

            writer.println("<h1>This is a simple java servlet252.</h1>");

            writer.println("</body>");
            writer.println("</html>");
        }

        int userNumber = Integer.parseInt(request.getParameter("t1"));
        String city = request.getParameter("t2");
        String phone = request.getParameter("t3");
        String first = request.getParameter("t4");
        String last = request.getParameter("t5");
        String email = request.getParameter("t6");

        Connection conn=null;
        Statement stmt=null;
        PrintWriter out=response.getWriter();
        try{
            Class.forName("com.mysql.jdbc.driver");
            conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","root","vlad32ex421baep" );
            stmt=conn.createStatement();
            //int i = stmt.executeUpdate("insert into users values('"+userNumber+"', '"+city+"', '"+phone+"')");
            int i= 0;
            if(i>0)
            {try (PrintWriter writer = response.getWriter()) {writer.println("Inserted Successfully");}
                out.println("Inserted Successfully");}
            else
                out.println("Insert Unsuccessful");
        }
        catch (Exception e){e.printStackTrace();}*/
    }
}
