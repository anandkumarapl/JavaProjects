/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbclasses;

/**
 *
 * @author lenovo
 */
public class Test {

    public static void main(String[] args) {
//        Student student=new Student(100, 71, "bhhjjv");
        Student student = new Student(1);
        System.out.println(student);
        student.setName("Sachin");
        student.save();
        student.delete();
    }
}

