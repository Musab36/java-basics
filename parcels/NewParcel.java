import java.io.Console;

public class NewParcel {
public static void main(String[] args) {
    Console console = System.console();
	
	System.out.println("Welcome to parcel company! Each 1kg parcel costs 5 Dollars to be shipped by air");
	Parcel parcels = new Parcel();
    parcels.mWeight = 1;
    parcels.mDimensions = 50;
    parcels.mCost = 5;
	
	Parcel[] parcelDetails = {parcels};
	for(Parcel myParcel : parcelDetails) {
		System.out.println(".....................");
		System.out.println("Weight per KG: " + myParcel.mWeight);
		System.out.println("Dimension: " + myParcel.mDimensions);
		System.out.println("Cost in $: " + myParcel.mCost);
	}
	
    System.out.println("Enter your parcel weight:");
    String stringWeight = console.readLine();
    int weight = Integer.parseInt(stringWeight);
    
    System.out.println("Enter your parcel dimension:");
    String stringDimension = console.readLine();
    int dimension = Integer.parseInt(stringDimension);
}
}