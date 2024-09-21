public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        System.out.println("Задание 1");

        byte age = 13;
        System.out.println(" Если тебе " + age + " лет");
        if (age >= 18) {
            System.out.println(" То ты совершеннолетний ");
        } else {
            System.out.println(" Значит ты несовершеннолетний ");
        }
    }

    public static void task2() {
        System.out.println("Задание 2");

        byte degrees = 15;
        System.out.println(" На улице " + degrees + " градусов(а)");
        if (degrees <= 5) {
            System.out.println(" На улице холодно, нужно надеть шапку ");
        } else {
            System.out.println(" Сегодня тепло, можно идти без шапки ");
        }
    }

    public static void task3() {
        System.out.println("Задание 3");

        short speed = 140;
        System.out.println(" Если ты едешь со скоростью - " + speed + " км/ч ");
        if (speed > 60) {
            System.out.println(" Дружище, ты превышаешь скорость ");
        } else {
            System.out.println(" Ты красава, едешь с положенной скоростью ");
        }
    }

    public static void task4() {
        System.out.println("Задание 4");

        byte age = 18;
        boolean needToGoKinderGarden = ((age >= 2) && (age <= 6));
        boolean needToGoSchool = ((age >= 7) && (age <= 17));
        boolean needToGoUniversity = (age >= 18 && age <= 24);
        boolean needToWork = (age > 24);
        System.out.println(" Если тебе - " + age + " лет ");
        if (needToGoKinderGarden) {
            System.out.println(" Тебе нужно идти в детский сад ");
        } else {
            System.out.println(" Тебе в детский сад уже не нужно ходить ");
        }
        if (needToGoSchool) {
            System.out.println(" Иди в школу, школьник ");
        } else {
            System.out.println(" Я думаю, что ты не ходишь в школу ");
        }
        if (needToGoUniversity) {
            System.out.println(" Ты студент ");
        } else {
            System.out.println(" Ты не являешься студентом ");
        }
        if (needToWork) {
            System.out.println(" Ты наверняка уже работаешь ");
        } else {
            System.out.println(" Ты еще не ходишь на работу ");
        }
    }

    public static void task5() {
        System.out.println("Задание 5");

        byte age = 5;
        boolean uDoNot = (age < 5);
        boolean mustBeAdults = ((age >= 5) && (age < 14));
        boolean uCan = (age >= 14);
        System.out.println("Если тебе - " + age + " лет.  Можно ли кататься на аттракционе? ");
        if (uDoNot) {
            System.out.println("Ты не можешь кататься на аттракционе ");
        } else if (mustBeAdults) {
            System.out.println("Ты можешь кататься на аттракционе, но в присутствии взрослых ");
        } else if (uCan) {
            System.out.println("Ты можешь кататься на аттракционе ");
        }
    }

    public static void task6() {
        System.out.println("Задание 6");

        byte passengers = 89;
        byte totalSeatsInTheCarriage = 102;
        byte seatsInTheCarriage = 60;
        boolean stillFreeSeats = (seatsInTheCarriage > passengers);
        boolean stillFreeStandingPlaces = ((seatsInTheCarriage <= passengers) && (passengers < totalSeatsInTheCarriage));
        System.out.println("Всего в вагоне - " + totalSeatsInTheCarriage + " мест(а). Из них - " + seatsInTheCarriage + " сидячих мест(а).");
        System.out.println("Если в вагон зайдет - " + passengers + " пассажира(ов)");
        if (stillFreeSeats) {
            System.out.println("То останется - " + (seatsInTheCarriage - passengers) + " свободных сидячих мест. И - " + (totalSeatsInTheCarriage - seatsInTheCarriage) + " свободных стоячих мест(а).");
        } else if (stillFreeStandingPlaces) {
            System.out.println("То сидячих мест не осталось, но осталось - " + ((totalSeatsInTheCarriage - seatsInTheCarriage) - (passengers - seatsInTheCarriage)) + " свободных стоячих мест(а)");
        } else {
            System.out.println("То вагон уже полностью забит! Не хватило места - " + (passengers - totalSeatsInTheCarriage) + " пассажиру(ам).");
        }
    }

    public static void task7() {
        System.out.println("Задание 7");

        int one = 33568;
        int two = 23456;
        int three = 33567;
        boolean oneBiggest = ((one > two) && (one > three));
        boolean twoBiggest = ((one < two) && (two > three));
        System.out.println("Сравним три числа: первое " + one + " второе " + two + " третье " + three + " какое из них больше?");
        if (oneBiggest) {
            System.out.println("Правильно, самое большое число " + one);
        } else if (twoBiggest) {
            System.out.println("Правильно, самое большое число " + two);
        } else {
            System.out.println("Правильно, самое большое число " + three);
        }
    }
}



