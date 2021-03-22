package pl.zzpj2021.solid.isp.contactbook.solution;

interface Dialler {
	
    default void makeCall(Contact dialable) {
    	
    	String telephone = dialable.getTelephone();
    	
    	// call using telephone
    }
}