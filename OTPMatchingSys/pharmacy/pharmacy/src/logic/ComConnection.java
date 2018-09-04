package logic;
import java.sql.Connection;
import java.sql.DriverManager;

public class ComConnection {
Connection con=null;
public Connection commonMeth() {
	try{
	Class.forName("oracle.jdbc.driver.OracleDriver");
	con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","chinu");
}catch(Exception e){
	e.printStackTrace();
	return null;
}
	return con;
}}
