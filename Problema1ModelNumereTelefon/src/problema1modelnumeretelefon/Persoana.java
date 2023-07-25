
package problema1modelnumeretelefon;

/**
 *
 * @author Sanda
 */
public class Persoana {
    private String nume,prenume;
    Persoana(String nume, String prenume){
        this.nume=nume;this.prenume=prenume;
    }
    String getNumeComplet(){
        return nume+""+prenume;
           
    }
    
}
