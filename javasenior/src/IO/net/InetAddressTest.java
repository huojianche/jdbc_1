package IO.net;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author HF_Lee
 * @create 2022-08-03-14:59
 */
public class InetAddressTest {
    public static void main(String[] args) {
        try {
            InetAddress inet1 = InetAddress.getByName("172.0.0.1");
            System.out.println(inet1);

            InetAddress inet2 = InetAddress.getByName("www.baidu.com");
            System.out.println(inet2);

            InetAddress inet3 = InetAddress.getLocalHost();
            System.out.println(inet3);

            System.out.println(inet2.getHostName());
            System.out.println(inet2.getHostAddress());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
