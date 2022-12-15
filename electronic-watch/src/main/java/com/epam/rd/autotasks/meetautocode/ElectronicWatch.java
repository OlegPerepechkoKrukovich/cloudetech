package com.epam.rd.autotasks.meetautocode;

import java.util.Scanner;

public class ElectronicWatch {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int h= 0;
        int mm = 0;
        while (true) {

            System.out.println("Введите количество секунд");
            int seconds = scanner.nextInt();
            if (seconds < 0){
                System.out.println("Отрицательное число");
                continue;
            }
            if (seconds == 0){
                System.out.println("Остановка программы");
                break;
            }
            while (seconds > 59) {


                mm++;
                if (mm > 59) {
                    h++;
                    mm -= 60;
                }
                if (h > 23) {
                    h -= 24;
                }
                seconds -= 60;

            }



            System.out.printf("%2d:%2d:%2d\n", h, mm, seconds);

        }





    }
}
