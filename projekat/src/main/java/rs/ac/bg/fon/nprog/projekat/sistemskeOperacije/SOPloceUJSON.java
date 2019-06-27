package rs.ac.bg.fon.nprog.projekat.sistemskeOperacije;

import rs.ac.bg.fon.nprog.projekat.baza.RadSaBazom;

public class SOPloceUJSON {

	public SOPloceUJSON() {
		

	}
	
	public boolean prebaciPloceUJSON(){
		
		RadSaBazom rsb=new RadSaBazom();
        rsb.otvoriKonekciju();
        boolean rez=rsb.prebaciUJSON();
        rsb.zatvoriKonekciju();
		return rez;
		
		
	}

}
