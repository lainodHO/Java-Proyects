import java.sql.*;

public class Modificar {

	public static void main(String[] args) {
		// DanielHernandezOlague
		Connection con;
		Statement st;
		ResultSet re;
		try{
			con=DriverManager.getConnection("jdbc:ucanaccess://D:/Xbox.accdb");
			st=con.createStatement();
			int reg=st.executeUpdate("UPDATE  Juegos SET Numero del juego='Skyrim',Nombre fabricante='Bethesda' Where Numero del juego=5"); 
			System.out.println("Registros Modificados:"+reg);
		}  catch(Exception e){
			System.out.println(e);
		}
}

}


