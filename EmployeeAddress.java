package classWorkThree;

public class EmployeeAddress {
	
	private int presAid;
	private String presStreetName;
	private String presCity;
	private String presState;
	private int presZip;
	
	private int permAid;
	private String permStreetName;
	private String permCity;
	private String permState;
	private int permZip;
	
	public EmployeeAddress(int presAid, String presStreetName, String presCity, String presState, int presZip, int permAid, String permStreetName, String permCity, String permState, int permZip) {
		this.presAid = presAid;
		this.presStreetName = presStreetName;
		this.presCity = presCity;
		this.presState = presState;
		this.presZip = presZip;
		this.permAid = permAid;
		this.permStreetName = permStreetName;
		this.permCity = permCity;
		this.permState = permState;
		this.permZip = permZip;
		
	}

	@Override
	public String toString() {
		return "EmployeeAddress [presAid=" + presAid + ", presStreetName=" + presStreetName + ", presCity=" + presCity
				+ ", presState=" + presState + ", presZip=" + presZip + ", permAid=" + permAid + ", permStreetName="
				+ permStreetName + ", permCity=" + permCity + ", permState=" + permState + ", permZip=" + permZip + "]";
	}

}
