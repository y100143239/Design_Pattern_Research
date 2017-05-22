package pattern.design.facade;

import java.sql.Connection;

/**
 * Created by Alex on 2017/5/22.
 */
public class OracleHelper {

    public static Connection getOracleDBConnection(){
        //get MySql DB connection using connection parameters
        return null;
    }

    public void generateOraclePDFReport(String tableName, Connection con) {
        //get data from table and generate pdf report
    }

    public void generateOracleHTMLReport(String tableName, Connection connection) {
        //get data from table and generate pdf report
    }


}
