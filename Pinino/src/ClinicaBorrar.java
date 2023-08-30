import java.sql.*;
public class ClinicaBorrar {

	public static void main(String[] args) {
		// DanielHernandezOlague
		Connection con;
		Statement st;
		ResultSet re;
		try{
			con=DriverManager.getConnection("jdbc:ucanaccess://E:/Amigos.accdb");
			st=con.createStatement();
			int reg=st.executeUpdate("DELETE  FROM Directorio Where id=18"); 
			System.out.println("Registros BORRADOS:"+reg);
		}  catch(Exception e){
			System.out.println(e);
		}
}
} 



