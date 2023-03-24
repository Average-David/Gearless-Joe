package ClassExtends;

public class Animal {

    public Animal(String name, int age) {
        Name = name;
        Age = age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    private String Name;

    public int getAge() {
        return Age;
    }

    private int Age;
    public void shotOut(){
        System.out.println("Animal is saying...");
    }

    public String info(){
      //  System.out.println("名称：" + " "  Name + "年龄：" + Age);
        return "名称："  + Name + " " + "年龄：" + Age;
    }
}
