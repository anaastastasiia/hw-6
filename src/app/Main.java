package app;

public class Main {
    public static void main(String[] args) {
        int totalSum = 0;

        for (int i = 1; i <= 6; i++) {
            totalSum += i;
            //STR - StringTemplate
            //inteliJ підсказав мені, що можна його використати
            //STR допомагає легко створювати багаторядкові рядки з вбудованими параметрами
            System.out.println(STR."\{i}) Num is \{i}, sum is \{totalSum}");
        }

        System.out.println("-----------------------");
        System.out.println(STR."Sum of numbers is \{totalSum}");
    }
}