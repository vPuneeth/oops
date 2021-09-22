public class ApplicationsUtil {

	public static void main(String[] args) {

		Applications details = new Applications();
		details.applicationName = "What'sApp";
		details.category = "Communication";
		details.fileSizeInMB = 16;
		details.rating = 4.1;
		System.out.println(details.applicationName+"\n"+details.category+"\n"+details.fileSizeInMB+"\n"+details.rating);
		details.specifications();
		
		Applications details1 = new Applications();
		details1.applicationName = "BGMI";
		details1.category = "Gaming";
		details1.fileSizeInMB = 1536;
		details1.rating = 4.5;
		System.out.println(details1.applicationName+"\n"+details1.category+"\n"+details1.fileSizeInMB+"\n"+details1.rating);
		details1.specifications();
		
		Applications details2 = new Applications();
		details2.applicationName = "SonyLIV";
		details2.category = "Entertainment";
		details2.fileSizeInMB = 28;
		details2.rating = 4.1;
		System.out.println(details2.applicationName+"\n"+details2.category+"\n"+details2.fileSizeInMB+"\n"+details2.rating);
		details2.specifications();

	}

}