import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Consulta {
	public static void main(String[] args) throws ClassNotFoundException {
		try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/empresa","root","");
		
		Statement sentencia = conexion.createStatement();
		
		String sql = "SELECT apellido, oficio, salario FROM empleados WHERE dept_no = 10;";
		
		ResultSet resul = sentencia.executeQuery(sql);
		
		while(resul.next()) {
			System.out.printf("%s, %s, %.2f %n", resul.getString(1), resul.getString(2), resul.getFloat(3));
		}
		resul.close();
		sentencia.close();
		conexion.close();
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
