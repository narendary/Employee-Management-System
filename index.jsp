<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search Page</title>
</head>
<body>
   <h1 style='color:red; text-align: center'>EMPLOYEE DATA PAGE</h1>
     <form method='GET' action='./retrieve'>
         <table>
                <tr> 
                     <th>USERID</th>
                          <td>
                             <input type='text' name='userid'/>
                          </td>
                </tr>
                <tr> 
                     <th></th>
                          <td>
                             <input type='submit' value='getRecord'/>
                          </td>
                </tr>
         </table>
     </form>

</body>
</html>