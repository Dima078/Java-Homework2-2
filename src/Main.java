public class Main {
    public static void main(String[] args) {
        int Sum = 150;
        int Pay = 1300;
        int Bonus = Pay/100;
        if (Pay > 1000){
            System.out.println("У вас на счету "+(Sum+Pay+Bonus)+ "рублей");
        } else {
            System.out.println("У вас на счету "+ (Sum+Pay));
        }
    }
}