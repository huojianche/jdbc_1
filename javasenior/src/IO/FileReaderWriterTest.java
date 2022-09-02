package IO;

import org.junit.Test;

import java.io.*;

/**
 * @author HF_Lee
 * @create 2022-08-01-17:07
 *
 * 一、流的分类:
 * 1.操作数据单位：字节流、字符流
 * 2.数据的流向：输入流、输出流
 * 3.流的角色：节点流、处理流
 * 二、流的体系结构
 * 抽象基类                   节点流(或文件流)               缓冲流(处理流的一种)
 * InputStream               FileInputStream             BufferedInputStream
 * OutputStream              FileOutputStream            BufferOutputStream
 * Reader                    FileReader                  BufferReader
 * Writer                    FileWriter                  BufferWriter
 *
 */
public class FileReaderWriterTest {
    public static void main(String[] args) {
        File file = new File("hello.txt");//相较于当前工程
        System.out.println(file.getAbsolutePath());


    }

    /*
    将javasenior下的hello.txt文件读入程序中，并输出到控制台
     */
    @Test
    public void test1(){
        FileReader fr = null;
        try {
            //实例化File类的对象，指明要操作的文件
            File file = new File("hello.txt");//相较于当前Module
            //提供具体的流
            fr = new FileReader(file);

            //3.数据的读入
            //read():返回读入的一个字符。如果到达文件末尾，返回-1
            //方式一
//        int data = fr.read();
//        while(data != -1){
//            System.out.println((char)data);
//            data = fr.read();
//        }

            //方式二
            int data;
            while((data = fr.read()) != -1){
                System.out.println((char)data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        //4.流的关闭操作
        try {
            if(fr != null)
                fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    //对read()操作升级:使用read的重载方法
    @Test
    public void testFileReader1(){
        FileReader fr = null;
        try {
            //1.File类的实例化
            File file = new File("hello.txt");
            //2。FileReader流的实例化
            fr = new FileReader(file);
            //3.读入的操作
            //read(char[] cbuf):返回每次读入cbuf数组中的字符的个数，如果达到文件末尾，返回-1
            char[] cbuf = new char[5];
            int len;
            while((len = fr.read(cbuf)) != -1){
                for (int i = 0;i < len; i++){
                    System.out.print(cbuf[i]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fr != null){
                //4.资源的关闭
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
    /*
    从内存中写出数据到硬盘文件里
     */
    @Test
    public void testFileWriter(){
        FileWriter fw = null;
        try {
            //1.提供File类的对象，指明写出到的文件
            File file = new File("hello1.txt");

            //2.提供FileWriter的对象，用于数据的写出
            fw = new FileWriter(file);

            //3.写出的操作
            fw.write("I have a dream!\n");
            fw.write("You need to have a dream!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fw != null){
                //4.流资源的关闭
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }



    }
    @Test
    public void testFileReaderFileWriter() throws IOException {
        FileReader fr = null;
        FileWriter fw = null;
        try {
            //1.创建File类的对象，指明读入和写出的文件
            File srcFile = new File("hello.txt");
            File destFile = new File("hello2.txt");

            //2.创建输入流和输出流的对象
            fr = new FileReader(srcFile);
            fw = new FileWriter(destFile);

            //3.数据的读入和写出
            char[] cbuf = new char[5];
            int len;//记录每次读入到cbuf数组中的字符的个数
            while((len = fr.read(cbuf)) != -1){
                //每次写出len个字符
                fw.write(cbuf,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.关闭流资源
            fw.close();
            fr.close();
        }

    }
}
