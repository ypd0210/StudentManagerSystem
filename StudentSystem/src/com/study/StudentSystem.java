package com.study;

import java.util.Scanner;

public class StudentSystem {
    public static void main(String[] args) {
        loop: while (true){
            System.out.println("--------------欢迎来到学生管理系统-------------");
            System.out.println("1:添加学生");
            System.out.println("2:删除学生");
            System.out.println("3:修改学生");
            System.out.println("4:查询学生");
            System.out.println("5:退出");
            System.out.println("请输入你们的选择：");

            Scanner scanner = new Scanner(System.in);
            String choose = scanner.next();

            switch (choose){
                case "1" -> addStudent();
                case "2" -> deleteStudent();
                case "3" -> updateStudent();
                case "4" -> queryStudent();
                case "5" -> {
                    System.out.println("退出");
                    //break loop;跳出指定循环
                    System.exit(0);//停止运行虚拟机
                }
                default -> System.out.println("选项错误，请重新输入：");
            }
        }
    }

    private static void queryStudent() {
    }

    private static void updateStudent() {
    }

    private static void addStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入学生的id：");
        String id = scanner.next();

        System.out.println("请输入学生的name：");
        String name = scanner.next();

        System.out.println("请输入学生的age：");
        int age = scanner.nextInt();

        System.out.println("请输入学生的address：");
        String address = scanner.next();

        //创建学生对象并保存相关信息
        student student = new student(id,name,age,address);
    }

    private static void deleteStudent() {
    }
}
