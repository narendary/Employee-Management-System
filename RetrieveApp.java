//Seeing the need of JSP when html can't retrieve data from employee object bcz of it's static nature, 
//Html does not have for or while loop. We will see the user of JSP to solve this issue in JDBCServletJSP Code

package in.pwskills.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.pwskills.entity.Employee;
import in.pwskills.utility.JdbcUtil;

 
@WebServlet("/retrieve")
public class RetrieveApp extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String SQL_SELECT_QUERY = "select id,name,age,address from employee where id = ?";
 
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		//collect input supplied by the user
		String userId =request.getParameter("userid");
		
		try {
			Connection connection= JdbcUtil.getDbConnection();
			PreparedStatement pstmt=connection.prepareStatement(SQL_SELECT_QUERY);
			pstmt.setInt(1, Integer.parseInt(userId));
            ResultSet resultSet=pstmt.executeQuery();
            
           
            RequestDispatcher rd=null;
            
            
            if(resultSet.next()) {
            	 Employee employee =new Employee();
                 employee.setId(resultSet.getInt(1));
                 employee.setName(resultSet.getString(2));
                 employee.setAge(resultSet.getInt(3));
                 employee.setAddress(resultSet.getString(4));
                 
                 //forwarding to jsp age
                 rd= request.getRequestDispatcher("success.jsp");
                 request.setAttribute("employee", employee);   //keeping the data. it will be retrieve from success page
                 rd.forward(request, response);
            	     
            }else {
            	
            	//forwarding to jsp page
                  rd= request.getRequestDispatcher("failure.jsp");
                  request.setAttribute("userId", userId);   //keeping the data 
                  rd.forward(request, response);
            }
			 
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
