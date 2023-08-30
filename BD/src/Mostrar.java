import java.sql.*;

public class Mostrar {

	public static void main(String[] args) {
		// DanielHernandezOlague
		Connection con;
		Statement st;
		ResultSet re;
		try{
			con=DriverManager.getConnection("jdbc:ucanaccess://E:/Xbox.accdb");
			st=con.createStatement();
			re=st.executeQuery("SELECT * FROM Juegos"); 
			while (re.next()){
				System.out.println(re.getInt(1)+"\t"+re.getString(2)+"\t"+re.getString(3)+"\t"+re.getString(4));
		}
		}  catch(Exception e){
			System.out.println(e);

		}
}
}