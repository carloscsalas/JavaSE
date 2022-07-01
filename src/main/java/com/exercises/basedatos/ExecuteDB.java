package com.exercises.basedatos;

import java.sql.Connection;

public class ExecuteDB {
    public static void main(String[] args) throws Exception {

        ProcessDBOracle processDBOracle = new ProcessDBOracle();

        Connection con = processDBOracle.driverManagerGetConnection(
                        "jdbc:oracle:thin:@137.184.120.243:1521:xe","corona","corona");

    }
}
