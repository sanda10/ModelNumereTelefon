package problema1modelnumeretelefon;

/**
 *
 * @author Sanda
 */
public class Abonat {
    private int cod;
    private static int index=1;
    private Persoana pers;
    private ModelNumereTelefon mnt;
                Abonat(String nume,String prenume) {
                    pers=new Persoana(nume,prenume);
                    cod=index;
                    index++;
mnt=new ModelNumereTelefon();
  }
  Abonat(String nume, String prenume, String codTara, String codJudet, String codTelefon){
      pers=new Persoana(nume,prenume);
      cod=index;
      index++;
      mnt=new ModelNumereTelefon(codTara,codJudet,codTelefon);
  }
int getCod(){
    return cod;
    }  
String getInformatii(){
    StringBuffer sb=new StringBuffer(getCod()) ;
    sb.append("");sb.append(pers.getNumeComplet());
    sb.append("");sb.append(mnt.convertesteNumarTelefon());
    return sb. toString();
      
    
}
public String getNumarTelefon(){
    return mnt.convertesteNumarTelefon();
    }
public void setNumar(String cod){
mnt.setNumarTelefon(cod);
}
}

