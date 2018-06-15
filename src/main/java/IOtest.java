import java.io.File;
import java.io.IOException;

public class IOtest {

    public static void main(String[] args) {

        File dir1 = new File("D:/0_IOtest");
        if(!dir1.exists()){
            dir1.mkdir();// 如果D:/IOTest/dir1不存在，就创建为目录
            System.out.println("dir1目录创建完成！");
        }
        File dir2 = new File(dir1,"subTest");
        if(!dir2.exists()){
            dir2.mkdir();//创建目录
            System.out.println("dir2目录创建完成!");
        }

        try {
            File f1 = new File(dir2, "test.txt");
            if (!f1.exists()) {
                f1.createNewFile();//创建文件
                System.out.println("f1文件创建完成！");
            }
        }catch (IOException e){
            System.out.println(e);
        }

        String [] strs =null;
        strs = dir2.list();

        for (String s:strs) {
            System.out.println(s);
        }

    }
}
