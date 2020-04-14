package com.company;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class wordscounter {

    public static void main(String[] args) throws IOException {

        Path imputPath = Paths.get("F:\\javadeveloper\\Projekty\\Words counter\\src\\com\\company/ala.txt");
        List<String> lines =  Files.readAllLines(imputPath, Charset.forName("UTF-8"));
        int a = 0;

        for(int i=0; i<lines.size(); i++){
            String linia = lines.get(i);
            linia = linia.trim();
            for(int j=0; j<linia.length(); j++){
                if(linia.charAt(j)==' '&&linia.charAt(j+1)!=' ')
                    a++;
                }
            a++;
            }
        System.out.println("W tekscie znajduj się: "+a+" wyrazów");
        }
    }

