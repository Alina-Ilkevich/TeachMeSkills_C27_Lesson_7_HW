package com.teachmeskills.lesson7.task1.runner;
import com.teachmeskills.lesson7.task1.Accountant;
import com.teachmeskills.lesson7.task1.Director;
import com.teachmeskills.lesson7.task1.Worker;
import java.util.Scanner;
public class Runner {
    public static void main(String[] args) {

        //This class is used to check the written code

        Accountant accountant = new Accountant();
        Director director = new Director();
        Worker worker = new Worker();
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter position code: ");
        int code = scan.nextInt();
        if (code == 1) {
            System.out.println("Position: worker");
        } else if (code == 2) {
            System.out.println("Position: director");
        } else if (code == 3) {
            System.out.println("Position: accountant");
        } else {
            System.out.println("Incorrect code");
        }
    }
}
