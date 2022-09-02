package IO.exer;

import org.junit.Test;

import java.io.*;

/**
 * @author HF_Lee
 * @create 2022-08-02-21:26
 */
public class PicTest {

    //图片的加密
    @Test
    public void test1(){

        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream(new File("abc.png"));
            fos = new FileOutputStream(new File("abcsecret.png"));

            byte[] buffer = new byte[20];
            int len;
            while((len = fis.read(buffer)) != -1){
                //字节数组进行修改
                for(int i = 0;i < len;i++){
                    buffer[i] = (byte)(buffer[i] ^ 5);
                }
                fos.write(buffer,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fos != null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(fis != null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    //图片的解密
    @Test
    public void test2(){
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream(new File("abcsecret.png"));
            fos = new FileOutputStream(new File("abc3.png"));

            byte[] buffer = new byte[20];
            int len;
            while((len = fis.read(buffer)) != -1){
                //字节数组进行修改
                for(int i = 0;i < len;i++){
                    buffer[i] = (byte)(buffer[i] ^ 5);
                }
                fos.write(buffer,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fos != null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(fis != null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
