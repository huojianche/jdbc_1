package jdbc.connection;

import org.junit.Test;
import util.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * 使用PrepareStatement实现批量数据操作
 * @author HF_Lee
 * @create 2022-08-30-20:14
 */
public class InsertTest {
    @Test
    public void testInsert1() {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = JDBCUtils.getConnection();
            String sql = "insert into goods(name)values(?)";
            ps = conn.prepareStatement(sql);
            for(int i = 0; i <= 20000;i++){
                ps.setObject(1, "name_" + i);

                ps.execute();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.closeResource(conn,ps);
        }

    }
}
