
package problema1modelnumeretelefon;

/**
 *
 * @author Sanda
 */
public class ModelNumereTelefon {
    private String codTara,codJudet,codTelefon;
    ModelNumereTelefon(){
        codTara="+40";codJudet="41";codTelefon="123456";
            }
    ModelNumereTelefon(String codTara,String codJudet, String codTelefon)
    {
        this.codTara=codTara;this.codJudet=codJudet;
        this.codTelefon=codTelefon;
               
    }
    String convertesteNumarTelefon(){
        StringBuffer sb=new StringBuffer(codTara);
        sb.append("-");
        sb.append(codJudet);
        sb.append("-");
        sb.append(codTelefon);
        return sb.toString();
    }


    public void setNumarTelefon(String cod){
    codTelefon=cod;
    
}
    
}

        
        
        
    
    

