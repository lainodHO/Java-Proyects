import java.sql.*;

public class Agregar {

	public static void main(String[] args) {
		// DanielHernandezOlague
		Connection con;
		Statement st;
		ResultSet re;
		try{
			con=DriverManager.getConnection("jdbc:ucanaccess://E:/Xbox.accdb");
			st=con.createStatement();
			int reg=st.executeUpdate("INSERT INTO Juegos(Numero del juego,Nombre del juego,Nombre del fabricante,Pais) VALUES "
					+ "('6','Fallout 4','Bethesda','U.S.A.')");
				System.out.println("Registros Insertados:"+reg);
				re=st.executeQuery("SELECT * FROM Directorio"); 
				while (re.next()){
					System.out.println(re.getInt(1)+"\t"+re.getString(2)+"\t"+re.getString(3)+"\t"+re.getString(4));
			}
		}  catch(Exception e){
			System.out.println(e);
		}
	}
}