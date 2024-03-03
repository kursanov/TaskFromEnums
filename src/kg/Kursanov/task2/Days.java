package kg.Kursanov.task2;

import java.util.Scanner;

public enum Days {

    MONDAY("Дуйшөмбү куну жава окуйм"),
    TUESDAY("Шейшемби куну практика"),
    WEDNESDAY("Шаршемби куну жава окуйм"),
    THURSDAY("Бейшемби куну практика"),
    FRIDAY("Жума куну жава окуйм"),
    SATURDAY("Aнглис тилине барам"),
    SUNDAY("Футбол ойнойм");

    String plan;

    Days(String plan) {
        this.plan = plan;

    }


}
