package IO_test;

import java.io.*;

/**
 * @author guoqing
 * @create 2024-03-04-22:33
 * 转换流的测试
 */
public class test5 {

    public static void main(String[] args) throws IOException {

        FileOutputStream fos = new FileOutputStream("IO_study//Fileread_test_new.txt");
        OutputStreamWriter fr = new OutputStreamWriter(fos);
        String name = new String("郭庆");
        fr.write(name);
        fr.close();

        FileReader fis = new FileReader("IO_study//Fileread_test_new.txt");
        char[] buffered = new char[5];
        int len;
        while((len = fis.read(buffered)) != -1)
        {
            for(int i = 0;i < len;i++)
            {
                System.out.print(buffered[i]);
            }
        }

        fis.close();



    }
}
