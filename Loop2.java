public class Loop2 {
    public static void main(String[] args) {
        for (int i = 1; i < 8
        ; i++) {
            System.out.println("Days in a week : " + i);

            for (int j = 0; i < 2; i++) {
                System.out.println("Weekends : " + j);
            }
        }

    }
}
