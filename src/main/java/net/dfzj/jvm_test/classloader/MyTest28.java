package net.dfzj.jvm_test.classloader;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author qiankeqin
 * @Description: DESCRIPTION
 * @date 2020-08-19 19:31
 */
public class MyTest28 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/blog", "root", "123456");
    }
}