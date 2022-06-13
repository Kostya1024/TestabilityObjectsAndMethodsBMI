public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weightOfTheSubject = 110.7;
        double growthOfTheSubject = 1.87;
        int BmiOfTheSubject = service.calculate(weightOfTheSubject,growthOfTheSubject);
        System.out.println(BmiOfTheSubject);
    }
}
