public class BouncyBall {
    public static void main(String[] args) throws InterruptedException {

        //will run constantly
        while(true){

            System.out.println("  O  ");
            System.out.println("     ");
            System.out.println(" ___ ");

            //slows down the output
            Thread.sleep(100);
            addSpace();

            System.out.println("  |  ");
            System.out.println("  O  ");
            System.out.println(" ___ ");

            Thread.sleep(100);

            addSpace();

            System.out.println("     ");
            System.out.println("     ");
            System.out.println(" _O_ ");

            Thread.sleep(100);
            addSpace();


            System.out.println("      ");
            System.out.println("      ");
            System.out.println(" _<>_ ");

            Thread.sleep(100);
            addSpace();


            System.out.println("     ");
            System.out.println("     ");
            System.out.println(" _O_ ");

            Thread.sleep(100);

            addSpace();

            System.out.println("     ");
            System.out.println("  O  ");
            System.out.println(" _|_ ");

            Thread.sleep(100);
            addSpace();

        }


    }

    //Spaces The frames
    public static void addSpace() {
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }
}


