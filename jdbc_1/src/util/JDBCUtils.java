package util;

import jdbc.connection.ConnectionTest;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * @author HF_Lee
 * @create 2022-08-30-16:42
 */
public class JDBCUtils {

    //获取数据库连接
    public static Connection getConnection() throws Exception {
        //1，读取配置文件中的四个基本信息
        InputStream is = ClassLoader.getSystemClassLoader().getResourceAsStream("jdbc.properties");

        Properties pros = new Properties();
        pros.load(is);

        String user = pros.getProperty("user");
        String password = pros.getProperty("password");
        String url = pros.getProperty("url");
        String driverClass = pros.getProperty("driverClass");

        //2，加载驱动
        Class.forName(driverClass);

        //3,获取连接
        Connection conn = DriverManager.getConnection(url,user,password);
        return conn;
    }

    //关闭连接资源
    public static void closeResource(Connection conn, Statement ps){
        try{
            if (ps != null)
                ps.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
        try{
            if (conn != null)
                conn.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
