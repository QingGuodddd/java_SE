package InternetProgram_test;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author guoqing
 * @create 2024-03-05-17:09
 * IP和端口号的测试
 */
public class test1 {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress inet1 = InetAddress.getByName("192.168.2.41");
        InetAddress inet2 = InetAddress.getByName("www.baidu.com");
        InetAddress inet3 = InetAddress.getLocalHost();
        System.out.println(inet2.getHostName() + " "+inet2.getHostAddress()+" "+inet3.getHostAddress());

    }
}
