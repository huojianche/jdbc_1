package collection.map;

/**
 * @author HF_Lee
 * @create 2022-07-27-17:37
 */
public class User implements Comparable {
    private String name;
    private int age;

    public User() {
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    //按照姓名从小到大
    @Override
    public int compareTo(Object o) {
        if(o instanceof User){
            User user = (User)o;
//            return this.name.compareTo(user.name);
            int compare = this.name.compareTo(user.name);
            if(compare != 0){
                return this.name.compareTo(user.name);
            }else{
                return Integer.compare(this.age,user.age);
            }
        }else{
            throw new RuntimeException("输入的类型不匹配！");
        }
    }
}
