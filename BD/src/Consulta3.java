import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Consulta3 {
	public static void main(String[] args) throws ClassNotFoundException {
		try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/empresa","root","");

		Statement sentencia = conexion.createStatement();

		String sql = "SELECT empleados.apellido, empleados.salario, departamentos.dnombre FROM empleados INNER JOIN departamentos ON empleados.dept_no = departamentos.dept_no WHERE empleados.salario = (SELECT max(empleados.salario) FROM empleados);";

		ResultSet resul = sentencia.executeQuery(sql);
		
		while(resul.next()) {
			System.out.printf("%s, %.2f, %s", resul.getString(1), resul.getFloat(2), resul.getString(3));
		}
		resul.close();
		sentencia.close();
		conexion.close();
		
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Introduce un departamento");
		}
		
	}
}
