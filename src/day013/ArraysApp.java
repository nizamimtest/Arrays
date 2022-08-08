package day013;

import java.util.Scanner;

public class ArraysApp {
    public static void main(String[] args) {
        int x;
        //Ilkel olmayan bir tip initialize edildidigi zama
        //icerisinde bulunan ilkel tiplerin varsayilan degerleri atanir
        //int>0, double>0.0, boolean>false
        int [] numbers={3,5,7,9,11};
        String isim=new String("Ahmet");// - heap
        //Scanner i=new Scanner(System.in); // - heap

        /*int[] notlar;
        notlar={4,5,6} ;  bunun gibi yazilamaz */
        //String isim="Ahmet"; -heap
        //int a=4; -stack
        /*
        * int[] numders=new int [5];
        * numbers[0]=3;
        * numbers[1]=5;     Burdakilar yukari olanla aynidir
        * numbers[2]=7;
        * numbers[3]=9;
        * numbers[4]=11;
        */
        for (int i=0;i<numbers.length;i++){
            System.out.println(numbers[i]);
        }
    }
}
