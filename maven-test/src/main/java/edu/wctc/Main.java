package edu.wctc;

import org.apache.commons.collections4.CollectionUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> freshmen = new ArrayList<>();
        List<String> sophomores = new ArrayList<>();

        freshmen.add("Stacy");
        freshmen.add("Charlie");
        freshmen.add("Jayne");

        sophomores.add("Phil");
        sophomores.add("Bean");
        sophomores.add("Zuul");
        sophomores.add("Indy");

        Collections.sort(freshmen);
        Collections.sort(sophomores);

        List<String> students =
                CollectionUtils.collate(freshmen, sophomores);
        for (String student : students) {
            System.out.println(student);
        }

    }
}