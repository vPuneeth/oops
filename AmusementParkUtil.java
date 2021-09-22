public class AmusementParkUtil {

	public static void main(String[] args) {
		
		AmusementPark details = new AmusementPark();
		details.parkName = "Wonderla";
		details.placeName = "Bengaluru";
		details.age = 22;
		details.price = 845;
		System.out.println(details.parkName+"\n"+details.placeName+"\n"+details.age+"\n"+details.price);
		details.information();
		
		AmusementPark details1 = new AmusementPark();
		details1.parkName = "Fun world";
		details1.placeName = "Bengaluru";
		details1.age = 22;
		details1.price = 800;
		System.out.println(details1.parkName+"\n"+details1.placeName+"\n"+details1.age+"\n"+details1.price);
		details1.information();

		AmusementPark details2 = new AmusementPark();
		details2.parkName = "Snow city";
		details2.placeName = "Bengaluru";
		details2.age = 22;
		details2.price = 600;
		System.out.println(details2.parkName+"\n"+details2.placeName+"\n"+details2.age+"\n"+details2.price);
		details2.information();
	}

}