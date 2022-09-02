package primary.exception._throw;

public class StudentTest {
    public static void main(String[] args) {
        try {
            Student s = new Student();
            s.regist(-100);
            System.out.println(s);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
class Student{
    private int id;

    public void regist(int id) throws Exception {
        if(id > 0){
            this.id = id;
        }else{
//            throw new RuntimeException("您输入的数据非法！");
            throw new Exception("您输入的数据非法！");
        }
    }
}