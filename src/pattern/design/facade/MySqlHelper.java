package pattern.design.facade;

import java.sql.Connection;

/**
 * Created by Alex on 2017/5/22.
 */
public class MySqlHelper {

    public static Connection getMySqlDBConnection(){
        //get MySql DB connection using connection parameters
        return null;
    }

    public void generateMySqlPDFReport(String tableName, Connection con) {
        //get data from table and generate pdf report
    }

    public void generateMySqlHTMLReport(String tableName, Connection connection) {
        //get data from table and generate html report
    }


}
