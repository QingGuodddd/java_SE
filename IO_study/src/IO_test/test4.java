package IO_test;

import java.io.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author guoqing
 * @create 2024-03-04-20:57
 * 读取一个文本文件，判断其中汉字和符号出现的次数，并将其保存到新的文本文件中
 */
public class test4 {

    public static void main(String[] args) {
        new test4().searchTxt("IO_study//Fileread_test.txt","IO_study//search_test.txt");


    }


    public void searchTxt(String srcPath,String destPath){
        BufferedReader fs = null;
        BufferedWriter fr = null;
        try {
            //创建IO流对象
            fs = new BufferedReader(new FileReader(srcPath));
            fr = new BufferedWriter(new FileWriter(destPath));
            //创建map对象
            HashMap<Character,Integer> map = new HashMap<>();

            //读取文本内容
            int len;
            while((len = fs.read()) != -1)
            {
                char text = (char)len;
                if(map.get(text) == null)
                    map.put(text,1);
                else
                    map.put(text,map.get(text) + 1);
            }

            //根据map内容输出保存的文件
            Set<Map.Entry<Character,Integer>> set = map.entrySet();
            Iterator<Map.Entry<Character,Integer>> iterator = set.iterator();
            while(iterator.hasNext())
            {
                Map.Entry<Character,Integer> entry = iterator.next();
                switch (entry.getKey())
                {
                    case ' ':
                        fr.write("空格出现"+entry.getValue()+"次"+"\n");
                        break;
                    case '\t':
                        fr.write("Tab键出现"+entry.getValue()+"次"+"\n");
                        break;
                    case '\r':
                        fr.write("回车出现"+entry.getValue()+"次"+"\n");
                        break;
                    case '\n':
                        fr.write("换行出现"+entry.getValue()+"次"+"\n");
                        break;
                    default:
                        fr.write(entry.getKey()+"出现了"+entry.getValue()+"次"+"\n");
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            //关闭文件流
            if(fr != null)
                try {
                    fr.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            if(fs != null)
                try {
                    fs.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
        }

    }


}
