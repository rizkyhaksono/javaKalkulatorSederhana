package com.tutorial;

import java.util.*;

public class Main {

    public static void main(String[] args){

        // Membuat kalkulator sederhana menggunakan IF ELSE IF dan Switch
        // a (operator) b

        Scanner inputUser;
        float a, b, hasil;
        // char operator;

        // Memakai cara Switch Case
        String operator;

        inputUser = new Scanner(System.in);

        System.out.print("Nilai A = ");
        a = inputUser.nextFloat();
        System.out.print("Operator = ");
        // operator = inputUser.next().charAt(0);
        operator = inputUser.next();
        System.out.print("Nilai B = ");
        b = inputUser.nextFloat();

        System.out.println("Input User = " + a + " " + operator + " " + b);

        // cek perkondisian dari operator yang diinputkan
        // Menggunakan kondisi IF ELSE IF

        /*
        if(operator == '+'){
            // Pertambahan
            hasil = a + b;
            System.out.println("Hasilnya adalah = " + hasil);
        }else if(operator == '-'){
            // Pengurangan
            hasil = a - b;
            System.out.println("Hasilnya adalah = " + hasil);
        }else if(operator == '*'){
            // Perkalian
            hasil = a * b;
            System.out.println("Hasilnya adalah = " + hasil);
        }else if(operator == '/'){
            // Pembagian
            if(b == 0){
                System.out.println("Pembagian 0 menghasilakan nilai tak terhingga");
            }else{
                hasil = a / b;
                System.out.println("Hasilnya adalah = " + hasil);
            }
        }else{
            // Jika operator tidak ada
            System.out.println("Operator tidak ada!");
        }

         */

        // Menggunakan Switch Case


        switch(operator){
            case "+":
                hasil = a + b;
                System.out.println("Hasilnya adalah : " + hasil);
                break;
            case "-":
                hasil = a - b;
                System.out.println("Hasilnya adalah : " + hasil);
                break;
            case "*":
                hasil = a * b;
                System.out.println("Hasilnya adalah : " + hasil);
                break;
            case "/":
                hasil = a / b;
                System.out.println("Hasilnya adalah : " + hasil);
                break;
            default:
                System.out.println("Operator yang anda masukkan salah!");
        }



    }
}
