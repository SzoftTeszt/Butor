
package butorgyar;

public class Butorlap {
        private double hossz; //meter
        private double szeles; //meter
        private boolean tartolapE;
        private final int tartolapAr=5000;
        private final int hatlapAr=500;

    public Butorlap(double hossz, double szeles, boolean tartolapE) {
        this.hossz = hossz/100;
        this.szeles = szeles/100;
        this.tartolapE = tartolapE;
    }
     
    public double arSzamol()
    {
        return hossz*szeles*(this.tartolapE ? tartolapAr : hatlapAr);
    
    }
    
        
        
}
