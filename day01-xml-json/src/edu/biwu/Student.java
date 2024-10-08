package edu.biwu;

public class Student {
    /*学号*/
    private int sno;

    /*姓名*/
    private String sname;

    /*性别*/
    private String gender;

    /*年龄*/
    private int age;

    public Student() {
    }

    public Student(int sno, String sname, String gender, int age) {
        this.sno = sno;
        this.sname = sname;
        this.gender = gender;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sno=" + sno +
                ", sname='" + sname + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
