public class Main {
    public static void main(String[] args) {

        System.out.println("Task 1");
        int age = 16;
        if (age >= 18) {
        System.out.println("Он совершеннолетний");
        } else {
            System.out.println("Он не достиг совершеннолетия, нужно немного подождать");}

        System.out.println("Task 2");

        int temperature = 5;
        if ( temperature < 5) {
            System.out.println("На улице холодно, нужно надеть шапку");
        } else {
            System.out.println("Сегодня тепло, можно идти без шапки");}

        System.out.println("Task 3");

        int carSpeed = 55;
        if (carSpeed > 60) {
            System.out.println("Если скорость более 60 км/ч, то придется заплатить штраф");}
        else {
            System.out.println("Если скорость менее 60 км/ч, то можно ездить спокойно");
        }
        System.out.println("Task 4");

        int humanAge = 7;
        if (humanAge >=2 && humanAge <=6) {
            System.out.println("Если возраст человека равен от 2 до 6 лет, то ему нужно ходить в детский сад");} else if (humanAge >=7 && humanAge <=17) {
            System.out.println("Если возраст человека равен от 7 до 17 лет, то ему нужно ходить в школу");}
        else if (humanAge >=18 && humanAge <=24) {
            System.out.println("Если возраст человека больше или равен 18 лет, но меньше или равен 24, то его место в университете");}
        else {
            System.out.println("Если возраст человека более 24 лет, то ему нужно ходить на работу");}

        System.out.println("Task 5");

        int childAge = 5;
        if (childAge <5) {
            System.out.println("Если возраст ребенка менее 5 лет, то ему нельзя кататься на аттракционе");} else if (childAge >=5 && childAge <14) {
            System.out.println("Если возраст ребенка равен и более 5 лет, но менее 14 лет, то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");}
        else { System.out.println("Если возраст ребенка старше 14 лет, то он может кататься без сопровождения взрослого");}

        System.out.println("Task 6");

        int seatsOccupied = 102;

        if (seatsOccupied < 60) {
            System.out.println("В ввгоне есть сидячие и стоячие места");} else if (seatsOccupied >=60 && seatsOccupied <102) {
            System.out.println("В вагоне есть стоячие места");
        } else {
            System.out.println("В вагоне нет мест");}

        System.out.println("Task 7");
        // Задача 7
        //Даны три числа:
        //
        //int one;
        //int two;
        //int three;
        //
        //С помощью условного оператора и конструкции else напишите программу, которая вычисляет,
        // какое из трех чисел бо́льшее, и выводит результат в консоль.
        int one = 2;
        int two = 7;
        int three = 1;

        if (one > two && one > three) {
            System.out.println(one);} else if (two > one && two > three) {
            System.out.println(two);} else if (three > one && three > two) {
            System.out.println(three);}

        }

    }




