package rs.ac.bg.fon.nprog.projekat.sistemskeOperacije;

import rs.ac.bg.fon.nprog.projekat.baza.RadSaBazom;

public class SOJSONUPloce {

	public SOJSONUPloce(){}
	
public boolean prebaciJSONUPloce(){
		
		RadSaBazom rsb=new RadSaBazom();
        rsb.otvoriKonekciju();
        boolean rez=rsb.prebaciUPloce();
        rsb.zatvoriKonekciju();
		return rez;
		
		
	}
}
