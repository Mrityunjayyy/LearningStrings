public class Main {
    public static void main(String[] args) {
        String name = "Mrityunjay" ;
        name.concat(" The king");
        System.out.println(name);

        StringBuilder myName = new StringBuilder("Mrityunjay");
        myName.append("The king");
        System.out.println(myName);

    }
}