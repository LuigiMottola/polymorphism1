public class Rectangle extends Form {

    private double base = 5;
    private double height = 3;
    private double areaRectangle = base * height;

    @Override
    public void areaCalculator() {
        super.areaCalculator();
        System.out.println(areaRectangle);
    }
}
