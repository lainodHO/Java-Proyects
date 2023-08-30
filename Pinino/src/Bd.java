import java.sql.*;

public class Bd {

	public static void main(String[] args) {
		// DanielHernandezOlague
		Connection con;
		Statement st;
		ResultSet re;
		try{
			con=DriverManager.getConnection("jdbc:ucanaccess://E:/Amigos.accdb");
			st=con.createStatement();
			re=st.executeQuery("SELECT * FROM Directorio"); //consulta a la talbla Amigos
			while (re.next()){
				System.out.println(re.getInt(1)+"\t"+re.getString(2)+"\t"+re.getString(3)+"\t"+re.getString(4)+"\t"+re.getString(5));
		}
		}  catch(Exception e){
			System.out.println(e);
		}
}
}