public class CameraUtil {

	public static void main(String[] args) {

		Camera details = new Camera();
		details.brand = "CANON";
		details.model = "EOS R5";
		details.price = 339995;
		details.pixles = 45;
		System.out.println(details.brand+"\n"+details.model+"\n"+details.price+"\n"+details.pixles);
		details.specifications();
		
		Camera details1 = new Camera();
		details1.brand = "NIKON";
		details1.model = "Z7 || KIT";
		details1.price = 273599;
		details1.pixles = 45;
		System.out.println(details1.brand+"\n"+details1.model+"\n"+details1.price+"\n"+details1.pixles);
		details1.specifications();
		
		Camera details2 = new Camera();
		details2.brand = "SONY";
		details2.model = "ILCE-7RM4";
		details2.price = 310990;
		details2.pixles = 62;
		System.out.println(details2.brand+"\n"+details2.model+"\n"+details2.price+"\n"+details2.pixles);
		details2.specifications();

	}

}