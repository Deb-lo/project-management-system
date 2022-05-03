package PersonDetails;

public class PersonDetails {

	//Attributes
	String name;
	String surname;
	int telephoneNumber;
	String emailAddress;
	String physicalAddress;

	// Constructor
	public PersonDetails(String name, String surname, int telephoneNumber, String emailAddress, String physicalAddress) {
		this.name = name;
		this.surname = surname;
		this.telephoneNumber = telephoneNumber;
		this.emailAddress = emailAddress;
		this.physicalAddress = physicalAddress;
	}

	//Displays contents of each object
	public String toString() {
		String output = "Name: " + name;
		output += "\nSurname: " + surname;
		output += "\nTelephone number: " + telephoneNumber;
		output += "\nEmail address: " + emailAddress;
		output += "\nPhysical address: " + physicalAddress;

		return output;
	}


}
