package edu.biwu.json;

import cn.hutool.json.JSONUtil;
import edu.biwu.Student;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
利用hutool实现java对象和json数据的互转
使用JSONUtils类中的方法:
 toJsonStr():可以将java对象转换成JSON
 toBean():可以将JSON转换成Java对象
 toJsonPrettyStr():将java对象转换成格式化良好的JSON
 parseArray(),toList():将json串转换成java中的集合

*/
public class JSONTest01 {

    /*将一个java对象转换成JSON格式*/
    @Test
    public void testObjectToJson() {
        Student student = new Student(20131210, "无忌", "男", 25);
        String jsonStr = JSONUtil.toJsonStr(student);
        System.out.println(jsonStr);
    }

    /*将JSON字符串转换成Java对象*/
    @Test
    public void testJsonToObject() {
        String jsonStr = "{\"sno\":20131210,\"sname\":\"无忌\",\"gender\":\"男\",\"age\":25}";
        String jsonStr02 = "{'sno':20131210,'sname':'无忌','gender':'男','age':25}";
        Student student = JSONUtil.toBean(jsonStr, Student.class);
        Student student02 = JSONUtil.toBean(jsonStr02, Student.class);
        System.out.println(student);
        System.out.println(student02);
    }

    /*将一个集合转换成json*/
    @Test
    public void testListToJson() {
        List<Student> students = Arrays.asList(
                new Student(20131210, "无忌", "男", 25),
                new Student(20131223, "敏敏", "女", 20)
        );
        System.out.println(JSONUtil.toJsonStr(students));
        System.out.println(JSONUtil.toJsonPrettyStr(students));
    }

    /*将一个json转换成集合*/
    @Test
    public void testJsonToList() {
        String jsonStr = "[{\"sno\":20131210,\"sname\":\"无忌\",\"gender\":\"男\",\"age\":25},{\"sno\":20131223,\"sname\":\"敏敏\",\"gender\":\"女\",\"age\":20}]";
        //List<Student> students = JSONUtil.parseArray(jsonStr).toList(Student.class);
        //students.forEach(System.out::println);
        JSONUtil.parseArray(jsonStr).toList(Student.class).forEach(System.out::println);
    }

    /*将map转换成json串*/
    @Test
    public void testMapToJson() {
        List<Student> students = Arrays.asList(
                new Student(20131210, "无忌", "男", 25),
                new Student(20131223, "敏敏", "女", 20)
        );
        Map<String, Student> map = students.stream().collect(Collectors.toMap(stu -> stu.getSno() + "", stu -> stu));
        System.out.println(JSONUtil.toJsonStr(map));
        System.out.println(JSONUtil.toJsonPrettyStr(map));
    }
}
