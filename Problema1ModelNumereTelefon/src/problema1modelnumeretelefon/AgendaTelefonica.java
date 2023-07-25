
package problema1modelnumeretelefon;
import javax.swing.JOptionPane;
/**
 *
 * @author Sanda
 */
public class AgendaTelefonica {
    private Abonat[] abonati;
private int index=0;
AgendaTelefonica(int capacitate){
    abonati=new Abonat[capacitate];
      
    
}
public void adaugaAbonat(){
    String s=JOptionPane.showInputDialog("Introduceti date separate prin spatiu(Nume Prenume (optional)codTara codJudet codTelefon");
    String[]sp=s.split(" ");
    if(sp.length==2)
        abonati[index]=new Abonat(sp[0],sp[1]);
    else if(sp.length==5) abonati[index]=new Abonat(sp[0],sp[1],sp[2],sp[3],sp[4]);
        else{
                JOptionPane.showMessageDialog(null,"Eroare");
                }
        index++;
        JOptionPane.showMessageDialog(null,"Abonatul a fost adaugat");
        return;
}
    
public void stergeAbonat(){
    String s=JOptionPane.showInputDialog("Introduceti codul abonatului");
    int cod=Integer.parseInt(s);
    Abonat[]aux=new Abonat[index-1];
    for(int i=0;i<index;i++){
        if(abonati[i].getCod()==cod){
        System.arraycopy(abonati,0,aux,0,i);
       System.arraycopy(abonati,i+1,aux,i,index-i-1) ;
       abonati=aux;
       index--;
       JOptionPane.showMessageDialog(null,"Abonatul a fost sters");
       return;
       
       
    }
            
        }
    JOptionPane.showMessageDialog(null,"Abonatul nu exista");
}
    public void cautareNumarTelefon(int cod){
        for(int i=0;i<index;i++){
            if(abonati[i].getCod()==cod){
            JOptionPane.showMessageDialog(null,"Numarul cautat este"+abonati[i].getNumarTelefon());
            return;
        }
            
        }
        JOptionPane.showMessageDialog(null,"Abonastul nu exista");
            
        }
    
            
    
    
public void modificaAbonat(int cod){
for(int i=0;i<index;i++){
if(abonati[i].getCod()==cod){
String s=JOptionPane.showInputDialog("Introduceti numarul de telefon");
abonati[i].setNumar(s);
return;
}
}
JOptionPane.showMessageDialog(null,"Abonatul nu exista");
}
}





    
    


    

