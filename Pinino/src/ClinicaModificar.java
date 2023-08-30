import java.sql.*;


public class ClinicaModificar {

	public static void main(String[] args) {
		// DanielHernandezOlague
				Connection con;
				Statement st;
				ResultSet re;
				try{
					con=DriverManager.getConnection("jdbc:ucanaccess://E:/Amigos.accdb");
					st=con.createStatement();
					int reg=st.executeUpdate("UPDATE  Directorio SET Nombre='Alexis',Cel='854-645-45-45' Where id=3"); 
					System.out.println("Registros Modificados:"+reg);
				}  catch(Exception e){
					System.out.println(e);
				}
		}
		
	}


