package Gun01;

public class soru3 {
        public static int sum(int a, int b) {
                System.out.print(a + "" + b);
                return a + b;
        }

        static void main(String[] args) {
                System.out.println(sum(sum(1, 2), 3));
        }
}


