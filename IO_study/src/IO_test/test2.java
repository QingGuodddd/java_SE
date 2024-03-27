package IO_test;

import java.io.*;



/**
 * @author guoqing
 * @create 2024-03-04-15:10
 *对FileReader类和FileWriter类的使用进行测试;FileInputStream和FileOutputStream与之类似
 */
public class test2 {
    public static void main(String[] args){
        FileReader fr = null;
        FileWriter fw = null;
        try {
            //1.实例化File对象
            File file  = new File("IO_study//Fileread_test.txt");
            File file2 = new File("IO_study//Fileread_test_copy.txt");//用于write()复制
            //2.提供具体的字符流,但不能使用字符流来处理图片，只能用来处理文本信息
            fr = new FileReader(file);
            fw = new FileWriter(file2);
//            //3.数据的读入(挨个读入）
//            int data;
//            while ((data = fr.read()) != -1)//变量赋值的返回值是赋值的值
//            {
//                System.out.print((char)data);
//            }

//            //3.数据的读入方式2（一次性数组读入）
//            char[] cbuf = new char[5];
//            int len;
//            while((len = fr.read(cbuf))!= -1)
//            {
//                String str = new String(cbuf,0,len);
//                System.out.print(str);
//            }

            //3.数据的读入和写出
            char[] cbuf = new char[5];
            int len;
            while((len = fr.read(cbuf)) != -1)
            {
                String str = new String(cbuf,0,len);
                fw.write(str);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            //4.流的关闭操作
            if(fr != null)
                try {
                    fr.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            if(fw != null)
                try {
                    fw.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
        }

    }

}
