public class Main {
    public static void main(String[] args) {
        int balance = 250; // начальный баланс
        int bonusScale = 100; // шкала начисления бонусов
        int replenishment = 1550; // сумма пополнения
        int bonus;

        if (replenishment >= 1000){
            bonus = replenishment / bonusScale;
        } else {
            bonus = 0;
        }

        int totalBalance = balance + replenishment + bonus;

        System.out.println("Вы пополнили счёт на " + replenishment + " руб.");
        System.out.println("Ваш бонус составил " + bonus + " руб.");
        System.out.println("Ваш баланс " + totalBalance + " руб.");
    }
}