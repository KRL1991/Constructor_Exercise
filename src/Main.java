import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
// Studerende i studiegruppen
        Studerende st1 = new Studerende();
        st1.navn = "Mikkel";
        st1.alder = 24;
        st1.by = "Haslev";


        Studerende st2 = new Studerende("Anders", 28,"Køge");


        Studerende st3 = new Studerende("Mathias",20);
        st3.navn = "Mathias";
        st3.alder = 20;
        st3.by = "Næstved";


        Studerende st4 = new Studerende();
        st4.navn = "Mike";
        st4.alder = 26;
        st4.by = "København";


        Studerende st5 = new Studerende();
        st5.navn = "Kim";
        st5.alder = 28;
        st5.by = "Næstved";

        System.out.println("Alle studerende i gruppen er oprettet");


        // Scanner som finder alderen på de studerende i studiegruppe

// dette er en uendelig lykke
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Hvis alder i studiegruppen, vil du slå op? ");
            String nameToFind = scanner.next();

            switch (nameToFind) {
                case "Mikkel":
                    System.out.println(st1.alder);

                    break;

                case "Anders":
                    System.out.println(st2.alder);

                    break;

                case "Mathias":
                    System.out.println(st3.alder);

                    break;

                case "Mike":
                    System.out.println(st4.alder);

                    break;

                case "Kim":
                    System.out.println(st5.alder);

                    break;


                default:
                    System.out.println(nameToFind + " Personens navn findes ikke i databasen.");
            }


        }


    }
}