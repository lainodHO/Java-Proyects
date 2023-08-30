import java.sql.*;

public class Clinica {

	public static void main(String[] args) {
		// DanielHernandezOlague
		Connection con;
		Statement st;
		ResultSet re;
		try{
			con=DriverManager.getConnection("jdbc:ucanaccess://E:/Amigos.accdb");
			st=con.createStatement();
			int reg=st.executeUpdate("INSERT INTO Directorio(id,Nombre,Paterno,Materno,Cel) VALUES "
					+ "('18','An','Mendoza','Simon','123-327-09-77')");
				System.out.println("Registros Insertados:"+reg);
				re=st.executeQuery("SELECT * FROM Directorio"); 
				while (re.next()){
					System.out.println(re.getInt(1)+"\t"+re.getString(2)+"\t"+re.getString(3)+"\t"+re.getString(4)+"\t"+re.getString(5));
			}
		}  catch(Exception e){
			System.out.println(e);
		}
	}
}