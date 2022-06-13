public class BmiService {
    public int calculate(double weight, double growth) {
        double BmiExactly = weight / (growth * growth);
        int Bmi = (int) BmiExactly;
        return Bmi;
    }
}