package com.leetcode.code.Ali;

import java.util.ArrayList;
import java.util.List;

//评测题目: 编程实现：老师有a,b,c,d,e五个任务，分别需要5个同学A，B，C，D，E去处理，已知ABCDE五个同学分别只能处理和他自己对应的abcde一个任务。
//老师分配任务的策略是将5个任务都直接交给了A，要求A处理不了交给B，B处理不了交给C，C处理不了交给D，依次类推完成任务。打印出最终处理结果
public class TaskDeal {

    public static void main(String[] args) {
        List<Task> tasks = new ArrayList() {
            {
                add(new Task("a"));
                add(new Task("b"));
                add(new Task("c"));
                add(new Task("d"));
                add(new Task("e"));
            }
        };
        Student A = new Student("A");
        List<Student> students = new ArrayList() {
            {
                add(A);
                add(new Student("B"));
                add(new Student("C"));
                add(new Student("D"));
                add(new Student("E"));
            }
        };
        A.dealTask(tasks,students);
    }

    static class Student {
        // 学生a
        private String name;

        public Student(String name) {
            this.name = name;
        }

        public void dealTask(List<Task> tasks, List<Student> students) {
//            if (students.size() < 0 || tasks.size() < 0) {
//                return;
//            }
            // 处理任务
            for (Task task : tasks) {
                if (name.toLowerCase().equals(task.getName())) {
                    // 任务匹配，移出任务池
                    tasks.remove(task);
                    System.out.println(name+"执行了"+task.getName()+"任务,剩余任务池："+tasks);
                    break;
                }
            }
            if (tasks.size() <= 0) {
                return;
            }
            students.remove(this);
            students.get(0).dealTask(tasks, students);
        }
    }

    static class Task {
        // 任务
        private String name;

        public Task(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
    }

}
