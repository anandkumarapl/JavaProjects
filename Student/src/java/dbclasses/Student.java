/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbclasses;

import database.DbConnect;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author lenovo
 */
public class Student {

    private int id, age;
    private String name;

    public Student(int id) {
        try {
            PreparedStatement ps = DbConnect.connect().prepareStatement("select * from student where id=?");
            ps.setString(1, "" + id);
            ResultSet rs = ps.executeQuery();
            rs.next();
            this.id = id;
            this.name = "" + rs.getObject("name");
            this.age = Integer.parseInt("" + rs.getObject("age"));
        } catch (Exception ex) {
            System.err.println(ex);
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", age=" + age + ", name=" + name + '}';
    }

    public boolean save() {
        try {

            PreparedStatement ps = database.DbConnect.connect().prepareStatement("insert into student values(?,?,?)");
            ps.setString(1, name);
            ps.setString(2, "" + id);
            ps.setString(3, "" + age);
            int n = ps.executeUpdate();
            return true;
        } catch (Exception ex) {
            System.out.println(ex);
            return false;
        }

    }
//    public String toString() {
//        return "Student{" + "id=" + id + ", age=" + age + ", name=" + name + '}';
//    }

    public boolean update() {
        try {

            PreparedStatement ps = database.DbConnect.connect().prepareStatement("UPDATE  student SET name=?,id=?,age=? where id=?");
            ps.setString(1, name);
            ps.setString(2, "" + id);
            ps.setString(3, "" + age);
            int n = ps.executeUpdate();
            return true;
        } catch (Exception ex) {
            System.out.println(ex);
            return false;
        }

    }

    public boolean delete() {
        try {

            PreparedStatement ps = database.DbConnect.connect().prepareStatement("delete from student where id=?");
            ps.setString(1, "" + id);
            int n = ps.executeUpdate();
            return true;
        } catch (Exception ex) {
            System.out.println(ex);
            return false;
        }

    }

}
