import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int year, x;

        System.out.print("Doğduğunuz yılı giriniz => ");
        year = scn.nextInt();

        if (year % 100 == 0)
            x = year % 400;
        else {
            x = year % 4;
        }

        if (x == 0)
            System.out.print(year + " Bir artık yıldır.");
        else
            System.out.println(year + " Bir artık yıl değildir.");

    }
}
