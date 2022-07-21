
public class Chromebook extends Item{
	private String os;

	public Chromebook(String assetTag, String description, String os) {
		super(assetTag, description);
		this.os = os;
	}

	public String getOs() {
		return os;
	}
	
	public String toString(){
		// Write your codes here
		String info = super.toString();
		String output = String.format("%-65s %-20s", info, getOs());
		return output;
	}
}


