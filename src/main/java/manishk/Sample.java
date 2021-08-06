package manishk;

class Sample {
    public static void main(String[] args)
    {
        if (args.length > 0) {
            for (String val : args)
                System.out.println("Welcome " + val);
        }
        else
            System.out.println("Hello World!");
    }
}