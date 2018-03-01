
public class Paint {
	private double price;
	private int litreCapacity;
	private int coverAreaM2PerLitre;
	private String brandName;
	
	public Paint(double price, int litreCapacity, int coverAreaM2PerLitre, String brandName) {
		this.price = price;
		this.litreCapacity = litreCapacity;
		this.coverAreaM2PerLitre = coverAreaM2PerLitre;
		this.brandName = brandName;
	}
	
	public double getPrice() {
		return price;
	}
	public int getCapacity() {
		return litreCapacity;
	}
	public int getAreaCoverPM2() {
		return coverAreaM2PerLitre;
	}
	public String getBrandName() {
		return brandName;
	}
}