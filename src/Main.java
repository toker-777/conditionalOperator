public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
    }
    public static void task1() {
        System.out.println("Задание 1");

        byte age = 13;
        System.out.println(" Если тебе " + age + " лет");
        if (age >= 18) {
            System.out.println(" То ты совершеннолетний ");}else{
            System.out.println(" Значит ты несовершеннолетний ");
        }
    }
    public static void task2() {
        System.out.println("Задание 2");

        byte degrees = 3;
        System.out.println(" На улице " + degrees + " градуса");
        if (degrees < 5){
            System.out.println(" На улице холодно, нужно надеть шапку ");}else{
        System.out.println(" Сегодня тепло, можно идти без шапки ");
        }
    }
    public static void task3() {
        System.out.println("Задание 3");

        short speed = 140;
        System.out.println(" Если ты едешь со скоростью - " + speed + " км/ч ");
        if (speed > 60) {
            System.out.println(" Дружище, ты превышаешь скорость ");}else {
            System.out.println(" Ты красава, едешь с положенной скоростью ");
        }
    }
    public static void task4() {
        System.out.println("Задание 4");

        byte age = 35;
        System.out.println(" Если тебе - " + age + " лет ");
        boolean needToGoKindergarden = (age > 2 && age < 6);
        if (needToGoKindergarden) {
            System.out.println(" Тебе нужно идти в детский сад ");
        } else {
            System.out.println(" Тебе в детский сад уже не нужно ходить ");
        }
        boolean needToGoschool = (age > 7 && age < 18);
        if (needToGoschool) {
            System.out.println(" Иди в школу, школьник ");
        } else {
            System.out.println(" Я думаю, что ты не ходишь в школу ");
        }
        boolean needToGoUniversity = (age > 17 && age < 24);
        if (needToGoUniversity) {
            System.out.println(" Ты студент ");
        } else {
            System.out.println(" Ты не являешься студентом ");
        }
        boolean needToWork = (age > 24);
        if (needToWork) {
            System.out.println(" Ты наверняка уже работаешь ");
        } else {
            System.out.println(" Ты бездельник ");
        }
    }
    public static void task5() {
        System.out.println("Задание 5");

        byte age = 35;
        System.out.println("Если тебе - " + age + " лет ");
        boolean uDoNot = age < 5;
        boolean mustBeAdults = age > 5 && age < 14;
        boolean uCan = age > 14;
        if (uDoNot) {
            System.out.println(" Ты не можешь кататься на аттракционе ");
        } else if (mustBeAdults) {
            System.out.println(" Ты можешь кататься на аттракционе, но в присутствии взрослых ");
        } else if (uCan) {
            System.out.println(" Ты можешь кататься на аттракционе ");
        } else {
            System.out.println(" Ты не можешь кататься на аттракционе ");
        }
    }
    public static void task6(){
        System.out.println("Задание 6");

        byte people = 65;
        byte allPlaces = 102;
        byte sitDownPlaces = 60;
        System.out.println(" Всего зашло - " + people + " пассажира(ов) в вагон ");
        if (allPlaces > people){
            System.out.println(" В вагоне всего осталось - " + (allPlaces - people) + " свободных мест(а)");}
        if (people < sitDownPlaces){
            System.out.println(" Из них осталось - " + (sitDownPlaces - people) + " сидячих мест ");}else if(people >= sitDownPlaces){
            System.out.println(" Сидячих мест не осталось ");}
        if ((allPlaces - people) <= (allPlaces - sitDownPlaces)){
            System.out.println(" Осталось - " + (allPlaces - people) + " свободных стоячих мест ");}else if ((allPlaces - people) > (allPlaces - sitDownPlaces)){
            System.out.println(" Свободных стоячих осталось -  " + (allPlaces - sitDownPlaces) + " мест(а) ");}
        if (allPlaces - people <= 0){
            System.out.println(" Вагон уже полностью забит ");}
            }
        }


