package edu.biwu.json;

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONWriter;
import edu.biwu.Student;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * FastJSON2实现JSON和Java对象的互转
 * 1.将java对象(普通对象,集合对象,map对象)转换成json字符串
 *  JSON.toJSONString()
 * 2.将Json字符串解析成普通java对象
 *   JSON.parseObject()
 * 3.将含有数组的json字符串解析成java的集合对象
 *   JSONArray.parseArray()
 */
public class JSONTest02 {
    @Test
    public void testObjectToJson() {
        Student student = new Student(20131210, "无忌", "男", 25);
        System.out.println(JSON.toJSONString(student));
    }

    @Test
    public void testJsonToObject() {
        String jsonStr = "{\"age\":25,\"gender\":\"男\",\"sname\":\"无忌\",\"sno\":20131210}";
        Student student = JSON.parseObject(jsonStr, Student.class);
        System.out.println(student);
    }

    @Test
    public void testListToJson() {
        List<Student> students = Arrays.asList(
                new Student(20131210, "无忌", "男", 25),
                new Student(20131223, "敏敏", "女", 20)
        );
        System.out.println(JSON.toJSONString(students));
        System.out.println(JSON.toJSONString(students,JSONWriter.Feature.PrettyFormat));
    }

    @Test
    public void testJsonToList() {
        String jsonStr = "[{\"age\":25,\"gender\":\"男\",\"sname\":\"无忌\",\"sno\":20131210},{\"age\":20,\"gender\":\"女\",\"sname\":\"敏敏\",\"sno\":20131223}]";
        //List<Student> students = JSONArray.parseArray(jsonStr, Student.class);
        JSONArray.parseArray(jsonStr, Student.class).forEach(System.out::println);
    }

    @Test
    public void testMapToJson() {
        List<Student> students = Arrays.asList(
                new Student(20131210, "无忌", "男", 25),
                new Student(20131223, "敏敏", "女", 20)
        );
        Map<String, Student> map = students.stream().collect(Collectors.toMap(stu -> stu.getSno() + "", stu -> stu));

        System.out.println(JSON.toJSONString(map));
        System.out.println(JSON.toJSONString(map, JSONWriter.Feature.PrettyFormat));
    }
}
