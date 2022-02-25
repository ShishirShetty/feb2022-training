package org.example;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class CollectionsApp {
    public static void main(String[] args) {
        String[] stringsArr = new String[10];
        stringsArr[0]= "A";
        stringsArr[1]= "B";
        stringsArr[2]= "C";
        stringsArr[3]= "D";
        stringsArr[4]= "E";
        stringsArr[5]= "F";

        for(String string : stringsArr){
            System.out.println(string);
        }

        List<String> stringsList = new ArrayList<>();
        stringsList.add("A");
        stringsList.add("B");
        stringsList.add("C");
        stringsList.add("C");
        stringsList.add("C");
        stringsList.add("D");
        stringsList.add("E");
        stringsList.add("F");

        for(String string : stringsList){
            if(!StringUtils.equalsIgnoreCase(string, "C")) {
                System.out.println(string);
            }
        }

        stringsList.stream().filter(s -> !StringUtils.equalsIgnoreCase(s, "C")).forEach(System.out::println);

        //Lambda
    }
}
