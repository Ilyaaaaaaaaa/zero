

import java.util.Arrays;
import java.util.Scanner;


        public class zero {
            public static void main(String[] args) {
                int [] mas = new int[8];
                int length = mas.length;
                for (int i = 0; i < mas.length; i++) {
                    mas[i] = ((int)(Math.random()*10) -10);

                }
                System.out.println(Arrays.toString(mas));
                for (int i = 0; i < mas.length; i++) {
                    if(mas[i]%2 != 0){
                        mas[i] = 0;
                    }
                }


                System.out.println(Arrays.toString(mas));
            }
        }



















