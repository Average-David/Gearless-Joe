package ClassExtends;

public class main {

    public static void main(String[] args) {
      BorderCollie dog = new BorderCollie("边牧",18,"黑色");
      dog.shotOut();
     String info =  dog.info();
        System.out.println(info);
    }
}
