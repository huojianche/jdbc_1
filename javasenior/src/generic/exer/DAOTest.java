package generic.exer;

import java.util.List;

/**
 * @author HF_Lee
 * @create 2022-07-31-9:59
 */
public class DAOTest {
    public static void main(String[] args) {
        DAO<User> dao = new DAO<User>();

        dao.save("1001",new User(1001,23,"周杰伦"));
        dao.save("1002",new User(1002,22,"蔡依林"));
        dao.save("1003",new User(1003,22,"昆凌"));

        dao.update("1002",new User(1002,34,"方文山"));

        List<User> list = dao.list();
        System.out.println(list);
    }
}
