public class CreditPaymentService {
    public double calculate(double summ, double period) {
        double creditRateYear = 0.0999;
        double creditRateMounth = creditRateYear / 12;
        double coef = (creditRateMounth * (Math.pow((1 + creditRateMounth), period))) / (Math.pow((1 + creditRateMounth), period) - 1);
        double payment = coef * summ;
        return payment;
    }
}

