public class Main {
    static int counter;
    public static void main(String[] args) {

        for (Secret candidate:Secret.values()
             ) {
            if (candidate.name().startsWith("STAR")) {
                counter++;
            }

        }
        System.out.println(counter);
    }
}

/*
   enum Secret {
    STAR, CRASH, START// ...
}
*/