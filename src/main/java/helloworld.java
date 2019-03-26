import static java.lang.System.exit;

public class helloworld {

    public static void main(String[] args){
        System.out.println("hello world!");

        if (args.length >= 1) {
            System.out.println("hello " + args[0]);

            if (args[0].equals("Poop")){
                System.out.println("the secret was Poop");
                System.out.println("Partially censored secret: P*op or poop (if case sensitive)");
            }
        }

        //exit(0);
    }
}
