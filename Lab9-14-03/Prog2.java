public class Prog2 {
    public static void main(String[] args) {
        for (int i = 0; i < args.length - 1; i++) {
            for (int j = 0; j < args.length - i - 1; j++) {
                if (args[j].compareTo(args[j + 1]) > 0) {
                    String temp = args[j];
                    args[j] = args[j + 1];
                    args[j + 1] = temp;
                }
            }
        }
        for (String s: args) {
            System.out.println(s);
        }
    }
}