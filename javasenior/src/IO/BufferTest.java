package IO;

import org.junit.Test;

import java.io.*;

/**
 * @author HF_Lee
 * @create 2022-08-02-16:48
 *
 *
 * 1.缓冲流的使用：
 * BufferedInputStream
 * BufferOutputStream
 * BufferReader
 * BufferWriter
 *
 * 2.缓冲流作用：提升流的读取、写入速度
 *
 */
public class BufferTest {

    /*
    非文本文件的复制
     */
    @Test
    public void BufferStreamTest() throws FileNotFoundException {
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            //1.造文件
            File srcFile = new File("abc.png");
            File descFile = new File("abc2.png");

            //2.造流
            //2.1造节点流
            FileInputStream fis = new FileInputStream(srcFile);
            FileOutputStream fos = new FileOutputStream(descFile);
            //2.2造缓冲流
            bis = new BufferedInputStream(fis);
            bos = new BufferedOutputStream(fos);

            //3.复制的细节：读取、写入
            byte[] buffer = new byte[10];
            int len;
            while((len = bis.read(buffer)) != -1){
                bos.write(buffer,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.资源关闭
            //要求:先关闭外侧的流，在关闭内侧的流
            if(bos != null){
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(bis != null){
                try {
                    bis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            //关闭外层流的同时，内层流也会自动关闭。关于内层流的关闭，可以省略
//        fos.close();
//        fis.close();

        }
    }


}
