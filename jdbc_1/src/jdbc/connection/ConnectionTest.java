package jdbc.connection;

import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @author HF_Lee
 * @create 2022-08-30-13:13
 */
public class ConnectionTest {

    //获取数据库的连接
    //方式一
    @Test
    public void testConnection1() throws SQLException {
        Driver driver = new com.mysql.cj.jdbc.Driver();

        String url = "jdbc:mysql://localhost:3306/haha";
        Properties info = new Properties();

        info.setProperty("user","root");
        info.setProperty("password","abc123");

        Connection conn = driver.connect(url, info);

        System.out.println(conn);
    }
    //方式二:对方式一的迭代
    @Test
    public void testConnection2() throws Exception {
        Class clazz = Class.forName("com.mysql.cj.jdbc.Driver");
        Driver driver = (Driver)clazz.newInstance();

        String url = "jdbc:mysql://localhost:3306/haha";

        Properties info = new Properties();
        info.setProperty("user","root");
        info.setProperty("password","abc123");

        Connection conn = driver.connect(url,info);
        System.out.println(conn);
    }

    //方式三：使用driverManager替换driver
    @Test
    public void testConnection3() throws Exception {
        Class clazz = Class.forName("com.mysql.cj.jdbc.Driver");
        Driver driver = (Driver) clazz.newInstance();

        String url = "jdbc:mysql://localhost:3306/haha";
        String user = "root";
        String password = "abc123";

        DriverManager.registerDriver(driver);

        Connection conn = DriverManager.getConnection(url,user,password);
        System.out.println(conn);
    }

    //方式四：方式三简化
    @Test
    public void testConnection4() throws Exception {
        String url = "jdbc:mysql://localhost:3306/haha";
        String user = "root";
        String password = "abc123";

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection conn = DriverManager.getConnection(url,user,password);
        System.out.println(conn);
    }

    //方式五:最终版   将数据库连接需要的4个基本信息声明在配置文件中，通过读取配置文件，获取连接
    @Test
    public void testConnection5() throws Exception {
        //1，读取配置文件中的四个基本信息
        InputStream is = ConnectionTest.class.getClassLoader().getResourceAsStream("jdbc.properties");

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
        System.out.println(conn);

    }

}
