package ProjectDetails;

public class ProjectDetail {


	//Attributes
	int projectNumber;
	String projectName;
	String buildingType;
	String physicalAddress;
	int erfNumber;
	int totalFee;
	int totalPaid;
	String projectDeadline;

	//Constructor
	public ProjectDetail(int projectNumber, String projectName, String buildingType, String physicalAddress,
			int erfNumber, int totalFee, int totalPaid, String projectDeadline) {
		this.projectNumber = projectNumber;
		this.projectName = projectName;
		this.buildingType = buildingType;
		this.physicalAddress = physicalAddress;
		this.erfNumber = erfNumber;
		this.totalFee = totalFee;
		this.totalPaid = totalPaid;
		this.projectDeadline = projectDeadline;
	}

	//Displays contents of each object
	public String toString() {
		try {
			String output = "Project number: " + projectNumber;
			output += "\nProject name: " + projectName;
			output += "\nType of buliding: " + buildingType;
			output += "\nPhyiscal address: " + physicalAddress;
			output += "\nErf number: " + erfNumber;
			output += "\nTotal fee: " + totalFee;
			output += "\nTotal paid: " + totalPaid;
			output += "\nProject Deadline: " + projectDeadline;

			return output;
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}


}
