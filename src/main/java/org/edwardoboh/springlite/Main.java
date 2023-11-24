package org.edwardoboh.springlite;

import org.apache.catalina.LifecycleException;

public class Main {

    public static void main(String[] args) throws LifecycleException {
        SimpleServer simpleServer = new SimpleServer();
        simpleServer.run();
    }
}