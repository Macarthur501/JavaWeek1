
public class PaintComparator {
	public PaintComparator() {
	}
	

	public int totalAreaCovered(int capacity, int areaCoverPM2) {
		int totalCover = capacity * areaCoverPM2;
		return totalCover;
		}
	public String wasteComparison(int product1TotalArea, int product2TotalArea, int product3TotalArea, String brandName1, String brandName2, String brandName3) {
		if (product1TotalArea > product2TotalArea && product1TotalArea > product3TotalArea) {
			return brandName1;
		}
		if (product2TotalArea > product1TotalArea && product2TotalArea > product3TotalArea) {
			return brandName2;
		}
		if (product3TotalArea > product2TotalArea && product3TotalArea > product1TotalArea) {
			return brandName3;
		}
		if (product1TotalArea == product2TotalArea) {
			return brandName1 + " and " + brandName2;
		}
		if (product1TotalArea == product3TotalArea) {
			return brandName1 + " and " + brandName3;
		}
		else {
			return brandName2 + " and " + brandName3;
	}
	}
	public String finalWasteComparison(Paint paint1, Paint paint2, Paint paint3) {
		return wasteComparison((totalAreaCovered(paint1.getCapacity(), paint1.getAreaCoverPM2())),
				(totalAreaCovered(paint2.getCapacity(), paint2.getAreaCoverPM2())), 
				(totalAreaCovered(paint3.getCapacity(), paint3.getAreaCoverPM2())), 
				paint1.getBrandName(), paint2.getBrandName(), paint3.getBrandName());
	}
	public double pricePerM2(int capacity,int areaCoverPM2, double price) {
			
		double pricePerM2 = price / totalAreaCovered(capacity, areaCoverPM2);
		return pricePerM2;
		}
	
	public String averagePriceComparison(double product1PricePerM2, double product2PricePerM2, double product3PricePerM2, String brandName1, String brandName2, String brandName3) {
		if (product1PricePerM2 < product2PricePerM2 && product1PricePerM2 < product3PricePerM2) {
			return brandName1;
		}
		if (product2PricePerM2 < product1PricePerM2 && product2PricePerM2 < product3PricePerM2) {
			return brandName2;
		}
		if (product3PricePerM2 > product1PricePerM2 && product3PricePerM2 > product2PricePerM2) {
			return brandName3;
		}
		return null;
}}
