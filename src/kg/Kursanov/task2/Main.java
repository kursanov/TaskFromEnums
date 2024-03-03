package kg.Kursanov.task2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        System.out.println("Aпта кундорун танданыз");
        switch (new Scanner(System.in).nextLine()){
            case "MONDAY" , "monday" ->{
                Days days = Days.MONDAY;
                System.out.println(days.plan);
            }
            case "TUESDAY" , "tuesday"->{
                Days days = Days.THURSDAY;
                System.out.println(days.plan);
            }
            case "WEDNESDAY" ,"wednesday"->{
                Days days = Days.WEDNESDAY;
                System.out.println(days.plan);
            }
            case "THURSDAY", "thursday" ->{
                Days days = Days.THURSDAY;
                System.out.println(days.plan);
            }
            case "FRIDAY","friday" ->{
                Days days = Days.FRIDAY;
                System.out.println(days.plan);
            }
            case "SATURDAY","saturday" ->{
                Days days = Days.SATURDAY;
                System.out.println(days.plan);
            }
            case "SUNDAY","sunday" ->{
                Days days = Days.SATURDAY;
                System.out.println(days.plan);
            }
        }

    }
}
