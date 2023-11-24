package org.edwardoboh.springlite;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

public class Main {
    public static void main(String[] args) throws LifecycleException {
        Tomcat tomcat = new Tomcat();
        tomcat.setPort(8080);

        Context context = tomcat.addContext("", null);
        Tomcat.addServlet(context, "SimpleServlet", new SimpleServlet());
        context.addServletMappingDecoded("/", "SimpleServlet");

        tomcat.start();
        tomcat.getServer().await();
    }
}