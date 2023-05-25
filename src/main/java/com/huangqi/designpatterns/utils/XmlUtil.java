package com.huangqi.designpatterns.utils;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

/**
 * 从 XML 配置文件中提取具体类类名,并返回一个实例
 *
 * @author huangqi
 * @date 2023-05-25 14:26
 */
public class XmlUtil {
    public static Object getBean() {
        Object object = null;
        try {
            // 创建文档对象
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            Document doc;
            doc = documentBuilder.parse(new File("D:\\workspacenethosp\\java-design-patterns\\src\\main\\resources\\config.xml"));
            // 获取包含类名的文本节点
            NodeList className = doc.getElementsByTagName("className");
            Node firstChild = className.item(0).getFirstChild();
            String nodeValue = firstChild.getNodeValue();
            // 通过类名生成实例对象并将其返回
            Class aClass = Class.forName(nodeValue);
            object = aClass.newInstance();
        } catch (Exception e) {
            System.out.println(e + "@@" + e.getMessage());
        }
        return object;
    }

}
