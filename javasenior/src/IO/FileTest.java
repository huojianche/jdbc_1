package IO;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**
 * @author HF_Lee
 * @create 2022-07-31-14:01
 *
 * 1.创建File类的实例
 *
 *
 * 2.相对路径：相较于某个路径下的，指明的路径
 *   绝对路径：包含盘符在内的文件或文件夹目录的路径
 *
 */
public class FileTest {

    @Test
    public void test(){
        //构造器一
        File file1 = new File("Hello.txt");
        System.out.println(file1);

        //构造器二
        File file2 = new File("ad","fa");
        System.out.println(file2);

        //构造器三
        File file3 = new File(file2,"hi.txt");
        System.out.println(file3);
    }
    /*
     File类的获取功能
 public String getAbsolutePath()：获取绝对路径
 public String getPath() ：获取路径
 public String getName() ：获取名称
 public String getParent()：获取上层文件目录路径。若无，返回null
 public long length() ：获取文件长度（即：字节数）。不能获取目录的长度。
 public long lastModified() ：获取最后一次的修改时间，毫秒值
 public String[] list() ：获取指定目录下的所有文件或者文件目录的名称数组
 public File[] listFiles() ：获取指定目录下的所有文件或者文件目录的File数组
     */
    @Test
    public void test1(){
        File file1 = new File("Hello.txt");
        File file2 = new File("d:\\IO\\hi.txt");

        System.out.println(file1.getAbsolutePath());
        System.out.println(file1.getPath());
        System.out.println(file1.getName());
        System.out.println(file1.getParent());
        System.out.println(file1.length());
        System.out.println(file1.lastModified());
        System.out.println(file1.list());
        System.out.println(file1.listFiles());
        System.out.println();

        System.out.println(file2.getAbsolutePath());
        System.out.println(file2.getPath());
        System.out.println(file2.getName());
        System.out.println(file2.getParent());
        System.out.println(file2.length());
        System.out.println(file2.lastModified());
        System.out.println(file2.list());
        System.out.println(file2.listFiles());
    }
    @Test
    public void test2(){
        File file = new File("F:\\IDEA\\contact\\javasenior\\src");
        String[] list = file.list();
        for(String s : list){
            System.out.println(s);
        }

    }
    /*
    File类的重命名功能
 public boolean renameTo(File dest)
     */
    @Test
    public void test3(){
        File file1 = new File("hello.txt");
        File file2 = new File("d:\\IO\\hi.txt");

        boolean renameTo = file2.renameTo(file1);
        System.out.println(renameTo);
    }

    /*
 public boolean isDirectory()：判断是否是文件目录
 public boolean isFile() ：判断是否是文件
 public boolean exists() ：判断是否存在
 public boolean canRead() ：判断是否可读
 public boolean canWrite() ：判断是否可写
 public boolean isHidden() ：判断是否隐藏
     */
    @Test
    public void test4(){
        File file1 = new File("hello.txt");
        System.out.println(file1.isDirectory());
        System.out.println(file1.isFile());
        System.out.println(file1.exists());
        System.out.println(file1.canRead());
        System.out.println(file1.canWrite());
        System.out.println(file1.isHidden());
        System.out.println();

        File file2 = new File("d:\\IO");
        System.out.println(file2.isDirectory());
        System.out.println(file2.isFile());
        System.out.println(file2.exists());
        System.out.println(file2.canRead());
        System.out.println(file2.canWrite());
        System.out.println(file2.isHidden());
    }

    /*
     File类的创建功能
 public boolean createNewFile() ：创建文件。若文件存在，则不创建，返回false
 public boolean mkdir() ：创建文件目录。如果此文件目录存在，就不创建了。如果此文件目录的上层目录不存在，也不创建。
 public boolean mkdirs() ：创建文件目录。如果上层文件目录不存在，一并创建
     */
    @Test
    public void test5() throws IOException {
        File file1 = new File("hi.txt");
        if(file1.exists()){
            file1.createNewFile();
            System.out.println("创建成功");
        }else{
            //文件存在
            file1.delete();
            System.out.println("文件删除成功");
        }
    }
}
