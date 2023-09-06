
public class expense {
    static int b = 10;

    public static void main(String[] args) {
        new abc().fun();

    }
}

class abc {
    int f = 89;

    void fun() {
        example ex = new example();

        ex.display(this.f);
    }
}

class example {
    int r = 90;

    public static int a = 0;

    static {
        System.out.println("anonymous");
    }

    example() {
        System.out.println("in const");
       this(18);
    }

    void display(int b) {

        System.out.println("in method,b=" + b);

    }

}