public class FirstWork {

    public static void main(String[] args) {
        byte b = -125;
        short sh = 364;
        int in = 618;
        long lg = 6659488L;
        float ft = 14.54f;
        double dl = 18.485;
        char ch = 101;
        boolean bl = true;
        System.out.println("byte = " + b + "\nshort = " + sh + "\nint = " + in + "\nlong = " + lg +
                "\nflout = " + ft + "\ndouble = " + dl + "\nchar = " + ch + "\nboolean = " + bl);
    }

    public static float taskThree(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }

    public static boolean taskFour(int a, int b) {
        int c = a + b;

        // boolean bool = sum >= 10 && sum <= 20;
        // return bool; Краткая запись

        boolean b1;
        if ((c >= 10) && (c <= 20)) b1 = true;
        else b1 = false;
        return b1;
    }

    public static void taskFive(int a) {
        if (a >= 0) {
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }

    }

    public static boolean taskSix(int a) {
        if (a < 0) { return true;
        } else {
            return false;
        }

    }

    public static void taskSeven(String name) {
        System.out.println("Привет " + name + "!");
    }

    public static void taskEight(int year){
        if (year % 400 == 0) {
            System.out.println("Високосный");
        } else {
            if (year % 100 == 0){
                System.out.println("Не високосный");
            }else {
                if (year % 4 == 0){
                    System.out.println("Високосный");
                } else {
                    System.out.println("Не високосный");
                }
            }
        }
    } // с подсказкой

}
