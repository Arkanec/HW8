import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int[] i = new int[3];
        i[0] = 1;
        int price = i[0];
        System.out.println(i[0]);
        i[1] = 2;
        price = i[1];
        System.out.println(i[1]);
        i[2] = 3;
        price = i[2];
        System.out.println(i[2]);

        System.out.println();

        double[] time = {1.57, 7.654, 9.986};
        for (int a = 0; a < time.length; a++) {
            System.out.println(time[a]);
        }
        System.out.println();

        int[] priceAdrenalin = {120, 130, 115, 106, 95, 90, 96, 103, 110};
        for (int b = 0; b < priceAdrenalin.length; b++) {
            System.out.println(priceAdrenalin[b]);
        }

        System.out.println();

        System.out.println("Задача 2");
        int[] c = new int[3];
        c[0] = 1;
        price = c[0];
        System.out.print(c[0]);
        System.out.print(",");
        c[1] = 2;
        price = c[1];
        System.out.print(c[1]);
        System.out.print(",");
        c[2] = 3;
        price = c[2];
        System.out.print(c[2]);

        System.out.println();

        double[] time2 = {1.57, 7.654, 9.986};
        System.out.print(Arrays.toString(time2));

        System.out.println();

        int[] priceAdrenalin2 = {120, 130, 115, 106, 95, 90, 96, 103, 110};
        System.out.print(Arrays.toString(priceAdrenalin2));

        System.out.println();

        System.out.println("Задача 3");
        int[] x = new int[3];
        x[0] = 3;
        x[1] = 2;
        x[2] = 1;
        for (int q = 0; q < x.length; q++) {
            System.out.print(x[q]);
        }

        System.out.println();

        double[] time3 = {9.986, 7.654, 1.57};
        System.out.print(Arrays.toString(time3));


        System.out.println();

        int[] priceAdrenalin3 = {110, 103, 96, 90, 95, 106, 115, 130, 120};
        System.out.print(Arrays.toString(priceAdrenalin3));

        System.out.println();

        int[] arr = {1, 2, 3};

        for (int w = 0; w < arr.length; w++) {
            if (arr[w] % 2 == 1) {
                arr[w] += 1;
            }
            System.out.print(arr[w] + " ");
        }
    }
}