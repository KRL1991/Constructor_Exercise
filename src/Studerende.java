public class Studerende {

    String navn;
    int alder;
    String by;
    String studieretning;
    String campus;


Studerende (){


    studieretning = "Datamatikker";
    campus = "Næstved";

    System.out.println(" Ny Studerende indlæst");
}

     Studerende(String navn, int alder, String by) {
        this.navn = navn;
        this.alder = alder;
        this.by = by;
    }

     Studerende(String navn, int alder) {
        this.navn = navn;
        this.alder = alder;
    }
}