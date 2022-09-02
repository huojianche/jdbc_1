package primary.objectorientedend.day_four.interface_exer;

public class CompareCircle extends Circle implements CompareObject{

    public CompareCircle(double radius) {
        super(radius);
    }

    @Override
    public int compareTo(Object o) {
        if(this == o){
            return 0;
        }
        if(o instanceof CompareCircle){
            CompareCircle c = (CompareCircle)o;
            if(this.getRadius() > c.getRadius()){
                return 1;
            }else if(this.getRadius() < c.getRadius()){
                return -1;
            }else{return 0;}
        }else{
//            return 0;
            throw new RuntimeException("传入的数据类型不匹配");
        }
    }
}
