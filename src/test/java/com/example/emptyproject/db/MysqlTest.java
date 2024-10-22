package com.example.emptyproject.db;


import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;

import static org.assertj.core.api.Fail.fail;

public class MysqlTest {
    static {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Test
    public void connectionTest(){
        try{
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/flyway", "root", "1234");
            System.out.println(conn);
        }catch(Exception e){
            fail(e.getMessage());
        }
    }
}
