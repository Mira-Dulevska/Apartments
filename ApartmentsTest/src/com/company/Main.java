package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        File file = new File("testData_Apartments.txt");

        Scanner input = null;
        List<Apartment> list = new ArrayList<>();

        Map<Set<Integer>, Integer> aparments = new HashMap<>();

        Map<String, Integer> cityApCounter = new HashMap<>();

        try {
            input = new Scanner(file);

            while (input.hasNext()) {
                String city  = input.next();
                int numberOfRooms = input.next();
                int m2 = input.nextInt();
                int price = input.next();
                int phone = input.next();
                Apartment apartment = new Apartment(city, numberOfRooms, m2, price, phone);
                list.add(apartment);

                if(city == "София" || city == "Варна" || city == "Бургас"){
                    if(numberOfRooms==3 && m2>100){
                        aparments.put(Collections.singleton(price), phone);
                    }
                }
                if(cityApCounter.containsKey(city)) {
                    cityApCounter.put(city, cityApCounter.get(city)+1);
                } else {
                    cityApCounter.put(city, 1);
                }
            }
        } catch (FileNotFoundException e) {
            e.getMessage();
        } finally {
            input.close();
        }

        List<Map.Entry<String, Integer>> listOfCities = new ArrayList<>(cityApCounter.entrySet());
        listOfCities.sort(Map.Entry.comparingByValue());

        File file2 = new File("output_Apartments.txt");
        if (file.exists()) {
            System.out.println("File already exists");
            System.exit(1);
        }
        PrintWriter output = null;
        try {
            output = new PrintWriter(file2);
            for(int i=0; i<5; i++){
                output.print(aparments);
            }
            output.print(listOfCities);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            // Close the file
            output.close();
        }

    }
}
