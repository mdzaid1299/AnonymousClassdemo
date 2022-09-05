

public class Main {
    public static void main(String[] args) {
        String s1 = "Zaid";

        Name n1 = new Name() {
            @Override
            public boolean isStartingWithA(String name) {
                return name.charAt(0) == 'A';
            }

        };
        System.out.println(n1.isStartingWithA(s1)+ "n1.isStartingWithA(s1)");

    }
}
