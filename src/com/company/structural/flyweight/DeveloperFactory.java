package com.company.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class DeveloperFactory {
    public static Map<String, Developer> developers = new HashMap();
    public static Developer developer;


    public static Developer getDeveloperBySpecialty(String specialty){
        Developer developer = developers.get(specialty);

        if(developer == null) {
            switch (specialty) {
                case "java":
                    developers.put(specialty, new JavaDeveloper());
                    System.out.println("Java developer created");
                    break;
                case "c++":
                    developers.put(specialty, new CppDeveloper());
                    System.out.println("C++ developer created");
                    break;
            }
        }

        return developer;
    }


}
