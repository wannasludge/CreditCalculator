public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double payment = service.calculate(1_000_000, 12);
        System.out.printf("%.0f",payment);
        System.out.println(" ");
        payment = service.calculate(1_000_000, 24);
        System.out.printf("%.0f",payment);
        System.out.println(" ");
        payment = service.calculate(1_000_000, 36);
        System.out.printf("%.0f",payment);
        System.out.println(" ");
    }
}
