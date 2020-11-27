package com.company;
public class Main {
    public static void main(String[] args) {
        int zmiennai= 30;
        long zmiennal= 20;
        float zmiennaf = 1.0f;
        double zmiennad= 30.123123123123;
        boolean zmiennab = true;

        char zmiennac = 'K';
        String zmiennas = "Hello";
        String komunikat = new String ("Hello World");

        char[] tablicaChar = new char[5];
        tablicaChar[0] = 'H';
        tablicaChar[1] = 'e';
        tablicaChar[2] = 'l';
        tablicaChar[3] = 'l';
        tablicaChar[4] = 'o';

        int[] tablicaInt = {6, 344, 123, 73, 234, 876};

        for(int i = 0; i < 30; i++) {
            if(0 < zmiennai) {
                zmiennai = -1;
            } else {
                zmiennai = 30;
            }
            System.out.println(zmiennai);
        }
        for (int i = 0; i < tablicaChar.length; i++){
            System.out.print(tablicaChar[i]);
        }

        int iteration = 0;
        while (iteration < 15){
            System.out.println(komunikat);
            iteration += 1;
        }

        boolean stopLoop= true;
        do{
            stopLoop = false;
            System.out.println("Wykonanie pętli");

        }while (stopLoop);

        //Operator modulo - reszta z dzielenia
        int x = 40;
        x= x % 3;

        //tu wpisuje jaki jest znak ascii dla litery F
        System.out.println((int)'f');
    }
}
