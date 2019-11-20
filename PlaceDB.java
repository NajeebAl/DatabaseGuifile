package DatabaseGui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class PlaceDB {
    private static final String DB_CONNECTION_URL = "jdbc:sqlite:places.sqlite";
    private static final String NAME_COL = "name";
    private static final String ELEV_COL = "elev";

    PlaceDB(){
        try(Connection conn = DriverManager.getConnection(DB_CONNECTION_URL);
            Statement statement = conn.createStatement()){
            String createTableSQL = "CREATE TTABLE IF NOT EEXISTS places " + "(name TEXT PRIMARY KEY, elev DOUBLE )";
            statement.execute(createTableSQL);
        } catch (SQLException sqle){
            throw new RuntimeException(sqle);
        }
    }
}
