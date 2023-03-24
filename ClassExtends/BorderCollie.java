package ClassExtends;

public class BorderCollie extends Dog {
    public BorderCollie(String name, int age, String color) {
        super(name, age, color);
    }

    private String varieties = "边牧";

    @Override
    public String info() {
        return "品种：" + varieties + " " + super.info();
    }
}