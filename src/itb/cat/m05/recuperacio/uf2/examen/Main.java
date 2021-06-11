package itb.cat.m05.recuperacio.uf2.examen;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        List<Integer> r = new ArrayList<>();
        int j = 0;
        int aa = 0;

        System.out.println("Benvingut/da al prototipus de gestió de generació de números aleatoris, versió 0.1!");

        Scanner m = new Scanner(System.in);
        System.out.println("Menú:");
        System.out.println("--------------");
        System.out.println("1. <TAG_1>");
        System.out.println("2. <TAG_2>");
        System.out.println("3. <TAG_3>");
        System.out.println("4. <TAG_4>");
        System.out.println("5. <TAG_5>");
        System.out.println("--------------");
        System.out.println("Entra l'opció:");
        j = m.nextInt();

        while (j != 5) {
            switch (j) {
                case 1:
                    Scanner t = new Scanner(System.in);
                    System.out.println("Entra un valor entre 1 i 200:");
                    aa = t.nextInt();
                    break;
                case 2:
                    System.out.println(">>>>> Inici de TAG_1 ...");
                    if (aa > 0 && aa < 201) {
                        long x = System.currentTimeMillis();
                        Random z = new Random(x);

                        for (int i = 0; i < 10; i++) {
                            int p = z.nextInt(aa+1);
                            r.add(p);
                        }
                    } else {
                        System.out.println("El valor d'elements no està ben definit. Si us plau faci servir l'opció 1 i entri un valor entre 1 i 200!");
                    }

                    System.out.println(">>>>> Final de TAG_1!");
                    break;
                case 3:
                    if (r != null && ! r.isEmpty()) {
                        System.out.println(">>>>> Inici de TAG_2 ...");
                        Util y = new Util();
                        r = y.metodeSenseNomClarEncara(r);
                    } else {
                        System.out.println("No n'hi ha res que fer!");
                    }
                    System.out.println(">>>>> Final de TAG_2 ...");
                    break;
                case 4:
                    if (r != null && ! r.isEmpty()) {
                        System.out.println("============= INICI DE TAG_3  ==================");
                        for (int k = 0; k < r.size(); k++) {
                            System.out.printf("r[%d]=%d%n", k, r.get(k));
                        }
                        System.out.println("============= FINAL DE LLISTAT ==================");
                    }else {
                        System.out.println("No n'hi ha res que mostrar!");
                    }
                    break;
                default:
                    System.out.println("Opció no comtemplada, si us plau entreu una opció entre [1-5]");
            }

            Scanner n = new Scanner(System.in);
            System.out.println("Menú:");
            System.out.println("--------------");
            System.out.println("1. <TAG_1>");
            System.out.println("2. <TAG_2>");
            System.out.println("3. <TAG_3>");
            System.out.println("4. <TAG_4>");
            System.out.println("5. <TAG_5>");
            System.out.println("--------------");
            System.out.println("Entra l'opció:");
            j = n.nextInt();
        }
        System.out.println("Sortint del programa ...");
    }

}
