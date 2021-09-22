public class FilmIndustryUtil {

	public static void main(String[] args) {

		FilmIndustry details = new FilmIndustry();
		details.industryName = "KANNADA INDUSTRY";
		details.otherName = "SANDALWOOS";
		details.singleScreens = 650;
		details.multiplexScreens = 260;
		System.out.println(details.industryName+"\n"+details.otherName+"\n"+details.singleScreens+"\n"+details.multiplexScreens);
		details.chandanavanaDetails();
		
		FilmIndustry details1 = new FilmIndustry();
		details1.industryName = "TELAGU INDUSTRY";
		details1.otherName = "TOLLYWOOD";
		details1.singleScreens = 2809;
		details1.multiplexScreens = 800;
		System.out.println(details1.industryName+"\n"+details1.otherName+"\n"+details1.singleScreens+"\n"+details1.multiplexScreens);
		details1.chandanavanaDetails();
		
		FilmIndustry details2 = new FilmIndustry();
		details2.industryName = "HINDI INDUSTRY";
		details2.otherName = "BOLLYWOOD";
		details2.singleScreens = 6327;
		details2.multiplexScreens = 3200;
		System.out.println(details2.industryName+"\n"+details2.otherName+"\n"+details2.singleScreens+"\n"+details2.multiplexScreens);
		details2.chandanavanaDetails();
	}

}