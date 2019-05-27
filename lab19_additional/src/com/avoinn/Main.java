package com.avoinn;

public class Main {


        public static void main(String[] args) {
            int amount = (int) (1 + Math.random() * 20);
            String[] tickets = new String[amount];

            for (int i = 0; i < amount; i++)
                tickets[i] = Integer.toString((int) (100000 + Math.random() * 900000));

            System.out.print("Уся множина квитків > ");
            for (int i = 0; i < amount; i++)
                System.out.print(tickets[i] + " ");

            int sum1 = 0, sum2 = 0;
            int count = 0;

            System.out.print("\n\"Щасливі\" квитки > ");
            for (int i = 0; i < amount; i++) {
                for (int j = 0; j < 3; j++)
                    sum1 += tickets[i].charAt(j);
                for (int j = 3; j < 6; j++)
                    sum2 += tickets[i].charAt(j);
                if (sum1 == sum2) {
                    count++;
                    System.out.print("\n" + tickets[i]);
                }
                sum1 = 0;
                sum2 = 0;
            }

            System.out.print("\nКількість \"щасливих\" квитків > " + count);
        }
}
