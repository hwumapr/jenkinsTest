import static java.lang.System.exit;

public class helloworld {

    public static void main(String[] args){
        System.out.println("hello world!");

        if (args.length >= 1) {
            System.out.println("hello " + args[0]);
        }

        exit(0);
    }
}
