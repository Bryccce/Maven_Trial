package edu.biwu.schema.dom4j;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.List;

/**
 *  1.SAXReader类
 *    read(): 读取或加载指定的xml文件
 *  2. Document类:代表内存中的整个DOM文档
 *    getRootElement():获取根节点
 *  3.Element类
 *    elements():获取所有的子标签
 *    element():可以获取指定名称的第一个子标签
 *    getName():获取当前元素的名称
 *    getText():获取标签之间的文本
 *    attributeValue():获取指定的属性值
 */
public class DOM4JTest {
    public static void main(String[] args) throws DocumentException {
        //1.利用SAXReader加载Demo03.xml
        Document doc = new SAXReader().read("day01-xml-json/Demo03.xml");
        System.out.println(doc);

        //2.利用Document获取xml文件的根节点
        Element rootElement = doc.getRootElement();
        System.out.println(rootElement.getName());

        System.out.println("--------------------------------");
        //3.获取根节点下的所有子节点
        List<Element> elements = rootElement.elements();
        System.out.println(elements.size());

        //4.遍历所有的根节点下的所有子元素(product),然后再做进一步操作
        for (Element childElement : elements) {
            System.out.println(childElement.getName()+" "
                              +" "+childElement.attributeValue("pid")
                              +" "+childElement.attributeValue("color"));

            //获取每个子元素下面的子元素(product元素下面的所有子元素)
            for (Element ele : childElement.elements()) {
                System.out.println(ele.getName()+" "+ele.getText()
                        +" "+ele.attributeValue("name"));
            }
            System.out.println();
        }
    }
}
