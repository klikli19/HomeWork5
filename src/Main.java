public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1.");
        int[] box = new int[3];
        box[0] = 1;
        box[1] = 2;
        box[2] = 3;
        System.out.print(box[0]);
        System.out.println();

        double[] weight = {1.57, 7.654, 9.986};
        System.out.print(weight[2]);
        System.out.println();

        int[] daysOfWeek = new int[7];
        daysOfWeek[0] = 1;
        daysOfWeek[1] = 2;
        daysOfWeek[2] = 3;
        daysOfWeek[3] = 4;
        daysOfWeek[4] = 5;
        daysOfWeek[5] = 6;
        daysOfWeek[6] = 7;

        System.out.print(daysOfWeek[4]);
        System.out.println();
        System.out.println();

        System.out.println("Задание 2");

        for (int i = 0; i < box.length; i++) {
            if (i != box.length - 1) {
                System.out.print(box[i] + ", ");
            } else {
                System.out.println(box[i]);
            }
        }
        for (int i = 0; i < weight.length; i++) {
            if (i != weight.length - 1) {
                System.out.print(weight[i] + ", ");
            } else {
                System.out.println(weight[i]);
            }
        }
        for (int i = 0; i < daysOfWeek.length; i++) {
            if (i != daysOfWeek.length - 1) {
                System.out.print(daysOfWeek[i] + ", ");
            } else {
                System.out.println(daysOfWeek[i]);
            }
        }

        System.out.println();

        System.out.println("Задание 3");
        for (int i = box.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(box[i] + ",");
            } else {
                System.out.println(box[i]);
            }
        }
        for (int i = weight.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(weight[i] + ", ");
            } else {
                System.out.println(weight[i]);
            }
        }

        for (int i = daysOfWeek.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(daysOfWeek[i] + ", ");
            } else {
                System.out.println(daysOfWeek[i]);
            }
        }
        System.out.println();
        System.out.println("Задание 4");
        for (int i = 0; i < box.length; i++) {
            if (box[i] % 2 != 0) {
                System.out.print(box[i] + 1 + ", ");
            } else {
                System.out.print(box[i] + ", ");
            }
        }
    }
}