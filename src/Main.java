import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Задание 1");

        int age = 20;
        if (age >= 18) {
            System.out.println(" Если тебе " + age + " лет, то ты совершеннолетний ");
        }
        int ageTwo = 16;
        if (ageTwo <= 18) {
            System.out.println(" Если тебе " + ageTwo + " лет, значит ты несовершеннолетний ");
        }
    }

    public static void task2() {
        System.out.println("Задание 2");

        int degrees = 3;
        System.out.println(" На улице " + degrees + " градуса");
        if (degrees < 5) {
            System.out.println(" На улице холодно, нужно надеть шапку ");
        }
        int degreesTwo = 23;
        System.out.println(" На улице " + degreesTwo + " градуса");
        if (degreesTwo > 5) {
            System.out.println(" Сегодня тепло, можно идти без шапки ");
        }
    }
    public static void task3(){
        System.out.println("Задание 3");

        int speed = 140;
        System.out.println(" Если ты едешь со скоростью - " + speed + " км/ч ");
        if(speed > 60){
            System.out.println(" Дружище, ты превышаешь скорость ");
        }else {
            System.out.println(" Ты красава, едешь с положенной скоростью ");
        }
        int speedTwo = 55;
            System.out.println(" Если ты едешь со скоростью - " + speedTwo + " км/ч ");
        if (speedTwo < 60){
            System.out.println(" Ты красава, едешь с положенной скоростью ");

        }
    }
}

