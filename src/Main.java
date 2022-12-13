public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
    }
    public static void task1(){
        System.out.println("Задача 1");
        for (int x = 0; x <= 10; x++ ) {
            System.out.println("Итерация " + x);
        }
    }
    public static void task2(){
        System.out.println("Задача 2");
        for (int x = 10; x >= 1; x = x-1) {
            System.out.println("Итерация " + x);
        }
    }
    public static void task3(){
        System.out.println("Задача 3");
        for (int x = 0; x < 17; x = x+2){
            System.out.println("Итерация " + x);
        }
    }
    public static void task4(){
        System.out.println("Задача 4");
        for (int x = 10; x >= -10; x = x-1){
            System.out.println("Итерация" + x);
        }
    }
    public static void task5(){
        System.out.println("Задача 5");
        for (int year = 1904; year <= 2096; year = year + 4){
            System.out.println( year + " год является високосным");
        }
    }
    public static void task6(){
        System.out.println("Задача 6");
        for (int x = 7; x <= 98; x = x + 7){
            System.out.print( x + " " );
        } {
            System.out.println();
        }
    }
    public static void task7(){
        System.out.println("Задача 7");
        for (int x = 1; x <= 512; x = x*2){
            System.out.print(x + " ");
        } {
            System.out.println();
        }
    }
    public static void task8(){
        System.out.println("Задача 8");
        int contribution = 29000;
        int total = 0;
        for(int x = 1; x <= 12; x++){
            total=total+contribution;
            System.out.println("Месяц " + x + " ,сумма накоплений равна " + total + " рублей");
        }
    }
    public static void task9(){
        System.out.println("Задача 9");
        int contribution = 29000;
        double total = 0;
        double percent = 0.01;
        for(int x = 1; x <= 12; x++){
            total= (total+contribution) * (1 + percent);
            System.out.println("Месяц " + x + " ,сумма накоплений равна " + total + " рублей");
        }
    }
    public static void task10(){
        System.out.println("Задача 10");
        int x = 2;
        int total = 0;
        for (int y = 1; y <= 10; y = y + 1){
            total = y * x;
            System.out.println(x + "*" + y + " = " + total );
        }
    }
}