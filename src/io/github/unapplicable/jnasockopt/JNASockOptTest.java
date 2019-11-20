package io.github.unapplicable.jnasockopt;

// (c) 2015 Alex Bligh
// Released under the Apache licence - see LICENSE for details

import java.io.IOException;
import java.net.*;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

// Run using
// java -Djna.nosys=true -jar jnasockopt.jar JNASockOptTest
// or
// java -jar jnasockopt.jar JNASockOptTest

public class JNASockOptTest {
	   	
	public static void main(String args[]) throws Exception {
        try {
            System.out.println("Trying to set TCP_KEEP* on SocketChannel...");
            SocketChannel sc = SocketChannel.open();
            /*sc.connect(new InetSocketAddress("0.0.0.0", 1723));
            sc.configureBlocking(false);
			JNASockOpt.setSockOpt(sc, JNASockOptionLevel.SOL_TCP, JNASockOption.TCP_KEEPCNT, 2);
			JNASockOpt.setSockOpt(sc, JNASockOptionLevel.SOL_TCP, JNASockOption.TCP_KEEPINTVL, 5);
			JNASockOpt.setSockOpt(sc, JNASockOptionLevel.SOL_TCP, JNASockOption.TCP_KEEPIDLE, 5);
			JNASockOpt.setSockOpt(sc, JNASockOptionLevel.SOL_SOCKET, JNASockOption.SO_KEEPALIVE, 1);

			while (true) {
				boolean res = JNASockOpt.isDisconnected(sc);
				System.out.println(res);
				if (res) {
					break;
				}
			}*/
			JNASockOpt.setSockOpt(sc, JNASockOptionLevel.SOL_TCP, JNASockOption.TCP_KEEPCNT, 2);
            JNASockOpt.setSockOpt(sc, JNASockOptionLevel.SOL_TCP, JNASockOption.TCP_KEEPINTVL, 5);
            JNASockOpt.setSockOpt(sc, JNASockOptionLevel.SOL_TCP, JNASockOption.TCP_KEEPIDLE, 5);
            System.out.println("... succeeded setting TCP_KEEP* on SocketChannel");
        } catch (IOException e) {
            System.out.println("... failed to set TCP_KEEP* on SocketChannel");
            e.printStackTrace();
        }

        Socket sock = new Socket ();
		String connIp = "127.0.0.1";
		int port = 22;
		
		InetAddress addr = InetAddress.getByAddress(connIp, InetAddress.getByName(connIp).getAddress());
		InetSocketAddress iaddr = new InetSocketAddress(addr, port);
		sock.connect(iaddr);
		
		int sockfdnum = JNASockOpt.getOutputFd(sock);
		System.out.println("fdnum = "+sockfdnum);
		
		try {
			System.out.println("Trying to set SO_RCVBUF ...");
			JNASockOpt.setSockOpt(sock, JNASockOptionLevel.SOL_SOCKET, JNASockOption.SO_RCVBUF, 6553600);			
			System.out.println("... succeeded setting SO_RCVBUF");
		} catch (Exception e) {
			System.out.println("... failed to set SO_RCVBUF");
			e.printStackTrace();
		}
		
		try {
			System.out.println("Trying to set TCP_KEEPIDLE ...");
			JNASockOpt.setSockOpt(sock, JNASockOptionLevel.SOL_TCP, JNASockOption.TCP_KEEPIDLE, 60);
			System.out.println("... succeeded setting TCP_KEEPIDLE");
		} catch (Exception e) {
			System.out.println("... failed to set TCP_KEEPIDLE");
			e.printStackTrace();
		}

		sock.close();
		System.out.println("Completed");
	}
}
