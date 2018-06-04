package Addition;

public class Multiplication {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        int sum = a * b;
        System.out.println(makeChocolate(4, 2, 7));

    }

    public static int makeChocolate(int small, int big, int goal) {
        int large = big * 5;
        int rem = 0;

        if(goal % 5!=0){
            int a=goal%5;
            return a;

        }

        if (large < goal) {
            for (int i = 1; i <= small; i++) {

                if (large + i == goal) {
                    rem = rem + i;
                    return rem;
                }
            }
        }
        if (large == goal) {
            return 0;
        }
        return -1;
    }

}

