package ClassExtends;

public class Dog extends Animal {
    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        this.Color = color;
    }

    private String Color;
    public Dog(String name, int age,String color) {
        super(name, age);
        Color = color;
    }
    public void shotOut(){
        super.shotOut();
        System.out.println("汪汪汪·····");
    }
    @Override
    public String info() {
        return super.info()+ " " + "颜色：" + Color;
    }
}
