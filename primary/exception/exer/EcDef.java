package primary.exception.exer;
//自定义异常类
public class EcDef extends Exception{
    static final long SerialVersionUID = -33875614229923L;

    public EcDef(){

    }
    public EcDef(String msg){
        super(msg);
    }
}
