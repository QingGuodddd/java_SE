package InternetProgram_test;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @author guoqing
 * @create 2024-03-05-20:56
 * 本机ip：10.24.8.92
 * 模拟TCP协议，客户端
 */
public class test2_Client
{
    public static void main(String[] args) {
        Socket socket = null;
        OutputStream os = null;
        try {
            //创建ip
            InetAddress inetClient = InetAddress.getByName("10.24.8.92");
            //创建ip和端口
            socket = new Socket(inetClient,6666);
            //创建流
            os = socket.getOutputStream();
            os.write("你好，这里是TCP客户端测试".getBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            //关闭流
            if(os != null)
                try {
                    os.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            if(socket != null)
                try {
                    socket.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
        }



    }
}
