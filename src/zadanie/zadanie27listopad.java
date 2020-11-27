package zadanie;

public class zadanie27listopad {
    public static void main (String[] args){

        int liczby[] = {10,7,3,6,171,444,5,15,13,11};
        int suma = 0;

        for(int i = 0; i < liczby.length; i++){
            suma+=liczby[i];
        }

        System.out.println("suma tych liczb wynosi" + suma);
    }
}
