package com.exercises.basedatos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ProcessDBOracle {

    Connection con;

    {
        try {
            con = driverManagerGetConnection(
//                    "jdbc:oracle:thin:@137.184.120.243:1521:xe","corona","corona"
                    "jdbc:oracle:thin:@localhost:1521:orcl","pctx","pctx"
            );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Connection driverManagerGetConnection(String url, String user, String password) throws Exception{
        Class.forName("oracle.jdbc.OracleDriver");
        return DriverManager.getConnection(url, user, password);
    }

//    public static Boolean saveVenta(Connection con, String query, Venta venta) throws Exception{
//        PreparedStatement preparedStmt = con.prepareStatement(query);
//        preparedStmt.setString (1, accountDTO.getNum_cuenta());
//        preparedStmt.setString (2, accountDTO.getCod_banco());
//        preparedStmt.setString (3, accountDTO.getIdentificador_comercial());
//        preparedStmt.setDate(4, Date.valueOf(accountDTO.getFecha_creacion()));
//        Boolean result = preparedStmt.execute();
//
//        LOGGER.info("INFO==>WRITER: " + accountDTO.toString());
//        return result;
//    }


}
