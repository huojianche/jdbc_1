package IO;

import org.junit.Test;

import java.io.*;

/**
 * @author HF_Lee
 * @create 2022-08-02-15:58
 *
 * 结论：
 * 1.对于文本文件，使用字符流处理
 * 2.对于非文本文件，舒勇字节流处理
 *
 */
public class FileInputOutputStreamTest {

    @Test
    public void testFileInputStream() {
        FileInputStream fis = null;

        try {
            //造文件
            File file = new File("hello.txt");

            //造流
            fis = new FileInputStream(file);

            //读数据
            byte[] buffer = new byte[5];
            int len;//记录每次读取的字节个数
            while((len = fis.read(buffer)) != -1){
                String str = new String(buffer,0,len);
                System.out.println(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null)
            //关闭资源
            {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
    /*
    实现对图片复制
     */
    @Test
    public void testFileInputOutputStream() throws FileNotFoundException {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            //
            File srcFile = new File("abc.png");
            File descFile = new File("abc1.png");

            //
            fis = new FileInputStream(srcFile);
            fos = new FileOutputStream(descFile);

            //复制
            byte[] buffer = new byte[5];
            int len;
            while((len = fis.read(buffer)) != -1){
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
    public void copyFile(String srcFilePath,String descFilePath){
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            //
            File srcFile = new File(srcFilePath);
            File descFile = new File(descFilePath);

            //
            fis = new FileInputStream(srcFile);
            fos = new FileOutputStream(descFile);

            //复制
            byte[] buffer = new byte[5];
            int len;
            while((len = fis.read(buffer)) != -1){
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
    @Test
    public void testCopyFile(){
        long start = System.currentTimeMillis();

        String srcPath = "";
        String descPath = "";

        copyFile(srcPath,descPath);

        long end = System.currentTimeMillis();

        System.out.println("复制操作的时间是" + (end - start) );
    }
}
