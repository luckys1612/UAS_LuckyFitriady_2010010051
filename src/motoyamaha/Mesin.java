package motoyamaha;

public class Mesin extends MotoYamaha  {
    protected int mesin;

    Mesin(int i, String biru) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Mesin() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    int getMesin() {
        return mesin;
    }

    void setMesinNaik(int pertambahMesin) {

    }
    
    void setMesinTurun(int penguranganMesin) {
        this.mesin = mesin - penguranganMesin;
    }
    
    public void tampilHasilMesin(){
        System.out.println("mesin : " + mesin);
    }
}

    
