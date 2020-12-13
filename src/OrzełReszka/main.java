package OrzełReszka;

public class main {

    public static void main(String[] args){

        //math.random opiera się na wyborze od 0 do 1. dlatego jak damy 0.5 to będzie 50% szansy na jedno albo drugie.
        //potem dajemy po IF, ELSE, czyli jeżeli nie orzeł, to reszka. i chyba tylko tyle mogę tu wyjaśnić.
        //Po prostu math.random() < 0.5 oznacza ze będzie randomowe po 50 % wybory pomiędzy orłem a reszką.
        if (Math.random() < 0.5) System.out.println("Orzel");
        else System.out.println("Reszka");
    }
    
}

