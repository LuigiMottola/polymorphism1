public class Triangle extends Form{
    private double base = 5;
    private double height = 8;
    private double areaTriangle = (base * height) / 2;

    @Override
    public void areaCalculator() {
        super.areaCalculator();
        System.out.println(areaTriangle);
    }
}
