package com.company;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Main {
    public static List<String> readFile (String fileName){
        List<String> lines = Collections.emptyList();
        try {
            lines = Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }
    public static void main(String[] args) throws IOException {
        List filePath = readFile("C:\\Users\\96653\\Desktop\\T1000\\labs\\Java\\W07D03-Collections-Lab\\Lab2\\src\\com\\company\\randomWords.txt");
        Iterator<String> itr= filePath.iterator();
        List<String> newList = new ArrayList<String>();

        while (itr.hasNext()){
            newList.add(itr.next().toLowerCase(Locale.ROOT));
        }
        Collections.sort(newList);
        System.out.println(newList);
    }
}
