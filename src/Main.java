public class Main {
    public static void main(String[] args) {
//        task1();
//        task2();
//        task3();
//        task4();
//        task5();
//        task6();
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

        byte age = 7;
        boolean smallAge = age > 5;
        boolean averageAge = age >= 5 && age <= 14;
        boolean olderAge = age > 14;
        boolean thereIsAnAdult = true;
        System.out.println("Если тебе - " + age + " лет.  Можно ли кататься на аттракционе? ");
        if (smallAge && olderAge) {
            System.out.println("Ты можешь кататься на аттракционе ");
        } else if (averageAge && thereIsAnAdult) {
            System.out.println("Ты можешь кататься на аттракционе, но в присутствии взрослых ");
        } else {
            System.out.println("Ты не можешь кататься на аттракционе ");
        }
    }

    public static void task6() {
        System.out.println("Задание 6");

        byte passengers = 10;
        byte totalSeatsInTheCarriage = 102;
        byte seatsInTheCarriage = 60;
        boolean stillFreeSeats = (seatsInTheCarriage > passengers);
        boolean stillFreeStandingPlaces = ((seatsInTheCarriage <= passengers));
        boolean allStillSeats = (totalSeatsInTheCarriage > passengers);
        System.out.println("Вместимость одного вагона поезда - " + totalSeatsInTheCarriage + " мест(а). Вагон рассчитан на - " + seatsInTheCarriage + " сидячих мест(а). Все остальные  - стоячие.");
        System.out.println("Если в вагон хочет зайти - " + passengers + " пассажира(ов)");
        if (allStillSeats) {
            System.out.println("Останется - " + (totalSeatsInTheCarriage - passengers) + " свободных мест(а)");
        } else {
            System.out.println("Вагон уже полностью забит! Мест не осталось - " + (passengers - totalSeatsInTheCarriage) + " пассажирам(у).");
        }
        if (stillFreeSeats) {
            System.out.println("Сидячих мест - " + (seatsInTheCarriage - passengers) + " и стоячих мест - " + (totalSeatsInTheCarriage - seatsInTheCarriage));
        } else if (stillFreeStandingPlaces && allStillSeats) {
            System.out.println("Сидячих мест не осталось, стоячих мест - " + ((totalSeatsInTheCarriage - seatsInTheCarriage) - (passengers - seatsInTheCarriage)));
        }
    }

    public static void task7() {
        System.out.println("Задание 7");

        int one = 33563;
        int two = 33561;
        int three = 33561;
        boolean oneBiggest = one >= two && one >= three;
        boolean twoBiggest = two >= one && two >= three;
        boolean threeBiggest = three >= one && three >= two;
        System.out.println("Сравним три числа: первое " + one + " второе " + two + " третье " + three + " какое из них больше?");
        if (oneBiggest) {
            System.out.println("Правильно, самое большое число " + one);
        } else if (twoBiggest) {
            System.out.println("Правильно, самое большое число " + two);
        } else if (threeBiggest) {
            System.out.println("Правильно, самое большое число " + three);
        }
    }
}



