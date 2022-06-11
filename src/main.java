public class main {
    public static void main(String[] args) {
        int startAccount = 500;
        int base = 100;
        int bonus;
        int currentAccount;

        int add = 3000;
        if (add > 1100) {
            bonus = add / base;
        } else {
            bonus = 0;
        }
        currentAccount = startAccount + add + bonus;

        System.out.println("Текущий счет: " + currentAccount);

    }
}
