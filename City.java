class City{

public String cityName;
public String language;
public String state;

public City(String cityName , String language , String state ){
System.out.println("city details are -- - ");

this.cityName =cityName;
this.language = language;
this.state = state;
System.out.println(cityName +" \n "+language+" \n "+state+" \n");
}


public static void main(String a[]){
City prop = new City("Bangalore" , "kannada" , "karnataka");



City proper = new City("new delhi", "hindi" , "delhi");


}

}