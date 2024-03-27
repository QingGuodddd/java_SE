package IO_test;

import java.io.*;

/**
 * @author guoqing
 * @create 2024-03-04-19:32
 * 用FileInputStream和FileOutputStream方法，实现指定路径下文件的复制
 */
public class test3 {

    public static void main(String[] args) {

        new test3().copyFile("IO_study//Fileread_test.txt","IO_study//Fileread_test_copy.txt");

    }

    //实现指定路径下文件的复制
    public void copyFile(String srcPath,String destPath){
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            //1
            File file_Src = new File(srcPath);
            File file_Dest = new File(destPath);
            //2
            fis = new FileInputStream(file_Src);
            fos = new FileOutputStream(file_Dest);
            //3
            byte[] arr = new byte[5];
            int len;
            while((len = fis.read(arr)) != -1)
            {
                fos.write(arr,0,len);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            //4
            if(fis != null)
                try {
                    fis.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            if(fos != null)
                try {
                    fos.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
        }




    }
}
