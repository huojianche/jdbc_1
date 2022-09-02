package Enum;

/**
 * @author HF_Lee
 * @create 2022-07-19-15:47
 */
public class SeasonTest1 {
    public static void main(String[] args) {
        Season1 test = Season1.SPRING;
        System.out.println(test);

        System.out.println("******");

        Season1[] values = Season1.values();
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
            values[i].show();
        }

        Season1 winter = Season1.valueOf("WINTER");
        System.out.println(winter);
        System.out.println("****************");
        winter.show();
    }
}

interface info{
    void show();
}
//使用enum定义枚举类
enum Season1 implements info{
    //3、提供当前枚举类的多个对象；public static final;
    WINTER("冬天","冰天雪地"){
        @Override
        public void show() {
            System.out.println("这是冬天！");
        }
    },
    SPRING("春天","春暖花开"){
        @Override
        public void show() {
            System.out.println("这是春天！");
        }
    },
    SUMMER("夏天","鸟语花香"){
        @Override
        public void show() {
            System.out.println("这是夏天！");
        }
    },
    AUTUMN("秋天","秋高气爽"){
        @Override
        public void show() {
            System.out.println("这是秋天！");
        }
    };

    //1、声明Season对象的属性；private final修饰
    private final String seasonDesc;
    private final String seasonName;


    //2、私有化类的构造器
    private Season1(String seasonName,String seasonDesc){
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    //4、其他诉求一: 获取枚举类对象的属性
    public String getSeasonName(){
        return seasonName;
    }
    public String getSeasonDesc(){
        return seasonDesc;
    }

//    @Override
//    public void show() {
//        System.out.println("真是个不错的季节！");
//    }

    //    //5、其他诉求二:提供toString方法
//    @Override
//    public String toString() {
//        return "Season{" +
//                "seasonName='" + seasonName + '\'' +
//                ", seasonDesc='" + seasonDesc + '\'' +
//                '}';
//    }
}
