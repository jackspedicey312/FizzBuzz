class Multiples {

    public static void main(String[] args) {

        int i = 1;
        int total = 0;
        while (i < 1000) {

            boolean multipleOf3 = i % 3 == 0;
            boolean multipleOf5 = i % 5 == 0;

            if (multipleOf3 || multipleOf5) {

                total++;
            }

            i++;

        }

        System.out.println(total);
    }
}
