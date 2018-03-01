
public class RunnerClass {

	public static void main(String[] args) {
		PaintComparator comparison = new PaintComparator();
		Paint paint1 = new Paint(19.99, 20, 10, "Cheapo Max");
		Paint paint2 = new Paint(17.99, 15, 11, "Average Joes");
		Paint paint3 = new Paint(25.00, 10, 20, "Duluxourous Paints");
		
		// Which one wastes the least
		
		System.out.println("Product(s) that waste the least: " + comparison.finalWasteComparison(paint1, paint2, paint3));
		
		System.out.println("The cheapest product on average is: " + comparison.averagePriceComparison(
				(comparison.pricePerM2(paint1.getCapacity(), paint1.getAreaCoverPM2(), paint1.getPrice())),
				
				(comparison.pricePerM2(paint2.getCapacity(), paint2.getAreaCoverPM2(), paint2.getPrice())),
																  
				(comparison.pricePerM2(paint3.getCapacity(), paint3.getAreaCoverPM2(), paint3.getPrice())),
				
				 paint1.getBrandName(), paint2.getBrandName(), paint3.getBrandName()));
		
		
		
		
	

	}

}
