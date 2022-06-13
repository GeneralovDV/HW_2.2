public class Main {
    public static void main(String[] args) {
        int startAccount = 500;
        int base = 100;
        int bonus;
        int currentAccount;

        int add = 1050;
        if (add > 1000) {
            bonus = add / base;
        } else {
            bonus = 0;
        }
        currentAccount = startAccount + add + bonus;

        System.out.println("Текущий счет: " + currentAccount + " руб.");
        System.out.println("Количество бонусов: " + bonus + " руб.");

    }
}
