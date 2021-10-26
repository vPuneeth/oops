class Stadiums{

public String stadiumName;
public int stadiumCapacity;
public String stadiumSituated;

public Stadiums(){
System.out.println("constructor ove rloading");
}

public Stadiums(String stadiumName ,  int stadiumCapacity , String stadiumSituated){
System.out.println("Stadium object is invoked" );
this.stadiumName = stadiumName;
this.stadiumCapacity = stadiumCapacity;
this.stadiumSituated = stadiumSituated;
System.out.println(stadiumName+" \n "+ stadiumCapacity+" \n "+stadiumSituated+" \n ");
}

public static void main(String a[]){
Stadiums characterstics = new Stadiums();
Stadiums characterstics0 = new Stadiums("wankede" , 30000 , "mumbai");
Stadiums characterstics1 = new Stadiums("chinnaswamy" , 25000 , "bangalore");
Stadiums characterstics2 = new Stadiums("eden gardens" , 90000 , "kolkata");
}
}




