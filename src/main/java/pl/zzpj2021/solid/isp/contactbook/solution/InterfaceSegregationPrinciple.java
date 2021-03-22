package pl.zzpj2021.solid.isp.contactbook.solution;

class InterfaceSegregationPrinciple implements Emailer, Dialler{

	public static void main(String[] args) {
		InterfaceSegregationPrinciple interfaceSegregationPrinciple = new InterfaceSegregationPrinciple();
		interfaceSegregationPrinciple.contactPeople();
	}
	
	public void contactPeople() {
		Contact contact = new Contact("Jan Kowalski", "Kielce", "jan.kowalski@gmail.com", "83744-23434");
		sendMessage(contact, "promocja", "tanio dzisiaj!");
		makeCall(contact);
	}
}
