class Resturant{

public int resturantId;
public String resturantName;
public String resturantType;
public String location;
public String ownerName;

public Resturant(){
System.out.println("resturant object is created");
}

public void serve(){

System.out.println("uta kodro");

}

public void displayResturantDetails(){

System.out.println(resturantId+ " \n " +resturantName+" \n "+resturantType+" \n "+location+" \n "+ownerName+ "\n");
}
}