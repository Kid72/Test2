package com.company.patterns.creational.prototyp;

public class Main {
    public static void main(String[] args) {
        Project project = new Project(1, "Name", "sourceCode");

        ProjectFactory projectFactory = new ProjectFactory(project);
        Project projectCopy = projectFactory.cloneProject();

        System.out.println(projectCopy);




    }
}
