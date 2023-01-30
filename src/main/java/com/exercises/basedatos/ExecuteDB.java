package com.exercises.basedatos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class ExecuteDB {
    public static void main(String[] args) throws Exception {

        ProcessDBOracle processDBOracle = new ProcessDBOracle();
//
//        Connection con = processDBOracle.driverManagerGetConnection(
//                        "jdbc:oracle:thin:@137.184.120.243:1521:xe","corona","corona");
        Connection con = processDBOracle.driverManagerGetConnection(
                        "jdbc:oracle:thin:@localhost:1521:orcl","pctx","pctx");
        Statement sentencia = con.createStatement();

        String currency = "USD";
        Integer page = 1;
        Integer pageSize = 5;

        StringBuilder sb = new StringBuilder();
        sb.append("select rn, fa.external_contract_id, fa.account_entity_name,fa.ORIGIN_CURRENCY_ID ");
//        sb.append("select count(*) val_count ");
        sb.append("from ( select rownum rn, f.* from t_pctx_foreign_account f ");
        sb.append("WHERE f.ORIGIN_CURRENCY_ID = '"+currency+"'" );
        sb.append("AND f.ACCOUNT_STATUS_TYPE = 'ACTIVE') fa ");
        sb.append("where rn >=("+page+"*"+pageSize+")-"+(pageSize-1)+" and rn< =("+page+"*"+pageSize+")");

        ResultSet rs=sentencia.executeQuery(sb.toString());
        Object objVal = null;
        while (rs.next()) {
//            System.out.println(rs.getString("val_count"));
            System.out.print(rs.getString(1)+" ");
            System.out.println(rs.getString(2));
        }
        System.out.println("obj: "+objVal);
        Integer intVal = (Integer) objVal;

        System.out.println("::COUNT:: "+intVal);
    }
}
