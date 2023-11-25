package org.edwardoboh.springlite;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        new AnnotationConfigApplicationContext(SimpleConfiguration.class);
    }
}