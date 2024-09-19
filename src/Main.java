import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
    public static void task1() {
        System.out.println("Задание 1");

        int age = 13;
        System.out.println(" Если тебе " + age + " лет");
        if (age >= 18) {
            System.out.println(" То ты совершеннолетний ");}else{
            System.out.println(" Значит ты несовершеннолетний ");
        }
    }
    public static void task2() {
        System.out.println("Задание 2");

        int degrees = 3;
        System.out.println(" На улице " + degrees + " градуса");
        if (degrees < 5){
            System.out.println(" На улице холодно, нужно надеть шапку ");}else{
        System.out.println(" Сегодня тепло, можно идти без шапки ");
        }
    }
    public static void task3() {
        System.out.println("Задание 3");

        int speed = 140;
        System.out.println(" Если ты едешь со скоростью - " + speed + " км/ч ");
        if (speed > 60) {
            System.out.println(" Дружище, ты превышаешь скорость ");}else {
            System.out.println(" Ты красава, едешь с положенной скоростью ");
        }
    }
    public static void task4(){
        System.out.println("Задание 4");

        int age = 35;
        System.out.println(" Если тебе - " + age + " лет ");
        boolean needToGoKindergarten = age>2 && age<6;
        if ( needToGoKindergarten ){
            System.out.println(" Тебе нужно идти в детский сад ");}else{
            System.out.println(" Тебе в детский сад уже не нужно ходить ");}
        boolean needToGoSchool = age>7 && age<18;
        if (needToGoSchool) {
            System.out.println(" Иди в школу, школьник ");}else{
            System.out.println(" Я думаю, что ты уже выпустился из школы ");}
        boolean needToGoUniversity = age>17 && age<24;
        if (needToGoUniversity){
            System.out.println(" Ты студент ");}else{
            System.out.println(" Ты не являешься студентом ");}
        boolean goToWork = age>24;
        if (goToWork){
            System.out.println(" Ты наверняка уже работаешь ");}else{
            System.out.println(" Ты бездельник ");}


    }
}

