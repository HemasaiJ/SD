package org.hemasai;

import org.hemasai.model.Student;

public class Main {
  public static void main(String[] args) {
    Student student = Student.getInstance();
    student.setEmail("Test@gmail.com");
    student.setId("1");
    student.setName("Test");
    Student student1 = Student.getInstance();
    student.setEmail("Test1@gmail.com");
    student.setId("2");
    student.setName("Test1");

    System.out.println(student);
    System.out.println(student1);
    System.out.println(student.hashCode());
    System.out.println(student1.hashCode());
  }
}