public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weightOfTheSubject = 70.2;
        double growthOfTheSubject = 0.92;
        int BmiOfTheSubject = service.calculate(weightOfTheSubject, growthOfTheSubject);
        System.out.println(BmiOfTheSubject);
    }
}
