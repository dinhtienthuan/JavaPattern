package test;

import java.sql.Connection;

import facade.HelperFacade;
import facade.MySqlHelper;
import facade.OracleHelper;

public class FacadePatternTest {
    public static void main(String[] args) {
        String tableName = "employee";

        // Without using Facade
        Connection connection = MySqlHelper.getMySqlDBConnection();
        MySqlHelper mySqlHelper = new MySqlHelper();
        mySqlHelper.generateMySqlHTMLReport(tableName, connection);

        Connection connection1 = OracleHelper.getOracleDBConnection();
        OracleHelper oracleHelper = new OracleHelper();
        oracleHelper.generateOraclePDFReport(tableName, connection1);

        // With using Facade
        HelperFacade.generateReport(HelperFacade.DBTypes.MYSQL,
                HelperFacade.ReportTypes.HTML, tableName);
        HelperFacade.generateReport(HelperFacade.DBTypes.ORACLE,
                HelperFacade.ReportTypes.PDF, tableName);
    }
}
