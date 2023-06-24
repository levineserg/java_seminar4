// ввод данных и хранение данных

package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> people = new ArrayList<>();
        Scanner iScanner = new Scanner(System.in);
        System.out.print("how many people? ");
        int n = Integer.parseInt(iScanner.nextLine());

        for (int i = 0; i < n; i++){
            System.out.print("family, name, surname: ");
            String name = iScanner.nextLine();
            System.out.print("age, sex: ");
            String age = iScanner.nextLine();
            people.add(name + " " + age);

        }
        System.out.println(people);
        iScanner.close();

//  вывод в формате Фамилия И.О. возраст пол
        for (String s : people) {
            String[] array = s.split(" ");
            System.out.println(array[0] + " " + array[1].toUpperCase().charAt(0) + "."
                    + array[2].toUpperCase().charAt(0) + ". " + array[3]);
        }


 // 3. добавить возможность выхода или вывода списка отсортированного по возрасту!)
        people.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.parseInt(o1.split(" ")[3]) - Integer.parseInt(o2.split(" ")[3]);
            }
        });

        for (String person : people) {
            String[] array = person.split(" ");
            System.out.println(array[0] + " " + array[1].toUpperCase().charAt(0) + "."
                    + array[2].toUpperCase().charAt(0) + ". " + array[3]);
        }
    }

}