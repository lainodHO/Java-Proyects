import java.sql.*;

public class Borrar {

	public static void main(String[] args) {
		// DanielHernandezOlague
		Connection con;
		Statement st;
		ResultSet re;
		try{
			con=DriverManager.getConnection("jdbc:ucanaccess://D:/Xbox.accdb");
			st=con.createStatement();
			int reg=st.executeUpdate("DELETE  FROM Juegos Where id=5"); 
			System.out.println("Registros BORRADOS:"+reg);
		}  catch(Exception e){
			System.out.println(e);
		}
}
} 


