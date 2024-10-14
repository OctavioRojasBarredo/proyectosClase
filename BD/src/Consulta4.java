import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Consulta4 {
	public static void main(String[] args) throws ClassNotFoundException {
		try {
			int num_dep;
			String dep, loc;
			
		Scanner escaner = new Scanner(System.in);
		System.out.println("Introduce el numero de departamento");
		if (escaner.hasNextInt()) {
			num_dep = escaner.nextInt();
		} else {
			System.out.println("Introduce un número, no una letra");
			escaner.nextInt();
		}
		
		System.out.println("Introduce el departamento");
		if (escaner.hasNextLine()) {
			dep = escaner.nextLine();
		} else {
			System.out.println("Introduce una letra, no un número");
			escaner.nextLine();
		}
		
		System.out.println("Introduce la localidad");
		if (escaner.hasNextInt()) {
			num_dep = escaner.nextInt();
		} else {
			System.out.println("Introduce un número, no una letra");
			escaner.nextInt();
		}
		
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
