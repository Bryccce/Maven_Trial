package edu.biwu.schema;

import java.util.ArrayList;


/**
 * Java中的包的概念类似XML中的命名空间的概念
 *  对于java中同名的类或接口
 *  我们一般通过包名来进行区分
 *    java.util.List的包名就是java.util
 *    java.awt.List 的包名就是java.awt
 */
public class Demo {
    public static void main(String[] args) {
        //不同包下同名类或接口
        java.util.List list = new ArrayList();
        java.awt.List list02 = null;
    }
}
