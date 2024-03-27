package InternetProgram_test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author guoqing
 * @create 2024-03-05-20:57
 *  * 本机ip：10.24.8.92
 *  * 模拟TCP协议，服务器端
 */
public class test2_Service {
    public static void main(String[] args){
        ServerSocket ss = null;
        Socket socket = null;
        InputStream is = null;
        BufferedReader br = null;
        try {
            //创建服务器
            ss = new ServerSocket(6666);
            //服务器接收
            socket = ss.accept();
            //创建输入流
            is = socket.getInputStream();
            //输出接收内容
            InputStreamReader isr = new InputStreamReader(is);
            br = new BufferedReader(isr);
            String data;
            while((data = br.readLine()) != null)
            {
                System.out.println(data);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            //关闭流
            if(br != null)
                try {
                    br.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            if(is != null)
                try {
                    is.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            if(socket != null)
                try {
                    socket.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            if(ss != null)
                try {
                    ss.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
        }





    }
}
