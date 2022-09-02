package primary.exception._throws;

/*
*异常处理方式二: throws + 异常类型
*
*
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ThrowsTest {
    public static void main(String[] args) {
        try{
            method2();
        }catch(IOException e){
            e.printStackTrace();
        }

    }

    public static void method2() throws IOException{
        method1();
    }

    public static void method1() throws FileNotFoundException, IOException {
        File file = new File("Hello.txt");
        FileInputStream fis = new FileInputStream(file);
         int data = fis.read();
         while(data != -1){
             System.out.println((char)data);
             data = fis.read();
         }
         fis.close();
    }
}
