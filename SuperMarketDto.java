 public class SuperMarketDto{

public SuperMarketDto(){
System.out.println(this.getClass().getSimpleName() +  "object is created");
}

private String name;
private String location;
private int noOfBranches;

public String getName(){
return name;
}
public void setName(String name){
this.name=name;
}

public String getLocation(){
return location;
}
public void setLocation(String location){
this.location=location;
}

public int getNoOfBranches(){
return noOfBranches;
}
public void setNoOfBranches(int noOfBranches){
this.noOfBranches=noOfBranches;
}

@Override
public String toString(){
return "SuperMarketDto  -  {name="+this.name+" , location="+this.location+" , noOfBranches="+this.noOfBranches+"}"; 
}
}