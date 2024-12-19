package org.example;

import org.glassfish.tyrus.server.Server;

public class WebSocketServerSample {
    /* サーバ側のサンプルプログラム
     * このメインメソッドの例ではサーバインスタンスの生成と起動のみを行っている．
     */

    static String contextRoot = "/app";
    static String protocol = "ws";
    static int port = 8080;


    public static void main(String[] args) throws Exception {
        Server server = new Server(protocol, port, contextRoot, null, EndpointSample.class/*, EndpointExample.class*/);
        System.out.println("server: " + server);

        try {
            server.start();
            System.in.read();
        } finally {
            server.stop();
        }
    }

    WebSocketServerSample() { }
}