import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Mostrar {
    public static void main(String[] args) throws ClassNotFoundException {
        try {
            Connection conexion = DriverManager.getConnection("jdbc:derby:C:\\Users\\nerwi\\Documents\\DB\\APACHE_DERBY\\EJERCICIO.db");
            DatabaseMetaData dbmd = conexion.getMetaData();
            
            String nombre = dbmd.getDatabaseProductName();
            String driver = dbmd.getDriverName();
            String url = dbmd.getURL();
            String usuario = dbmd.getUserName();
                
            ResultSet resul = dbmd.getTables(null, "APP", null, null);
        
            System.out.printf("Nombre: %s %nDriver: %s %nURL: %s %nUsuario: %s %n", nombre, driver, url, usuario);
            
            while (resul.next()) {
                String tableName = resul.getString("TABLE_NAME");
                System.out.printf("Tabla: %s %n", tableName);
                
                ResultSet exported = dbmd.getExportedKeys(null, "APP", tableName);
                while (exported.next()) {
                    String fk_name = exported.getString("FKCOLUMN_NAME");
                    String pk_name = exported.getString("PKCOLUMN_NAME");
                    System.out.printf("Exported Primary Keys: %s %n", pk_name);
                    System.out.printf("Exported Foreign Keys: %s %n", fk_name);
                }
                

                ResultSet imported = dbmd.getImportedKeys(null, "APP", tableName);
                while (imported.next()) {
                    String fk_name = imported.getString("FKCOLUMN_NAME");
                    String pk_name = imported.getString("PKCOLUMN_NAME");
                    System.out.printf("Imported Primary Keys: %s %n", pk_name);
                    System.out.printf("Imported Foreign Keys: %s %n", fk_name);
                }

                ResultSet primary = dbmd.getPrimaryKeys(null, "APP", tableName);
                while (primary.next()) {
                    String pk_name = primary.getString("COLUMN_NAME");
                    System.out.printf("Primary Keys: %s %n", pk_name);
                }
            }
            
            conexion.close();
            
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Introduce un departamento");
        }
    }
}
