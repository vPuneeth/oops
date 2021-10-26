public class LibraryDto{

public LibraryDto(){
System.out.println(this.getClass().getSimpleName()  +  "object is created");
}

private String name;
private int noOfWards;
private String location;

public String getName(){
return name;
}
public void setName(String name){
this.name=name;
}

public int getNoOfWards(){
return noOfWards;
}
public void setNoOfWards(int noOfWards){
this.noOfWards=noOfWards;
}

public String getLocation(){
return location;
}
public void setLocation(String location){
this.location=location;
}

@Override
public String toString(){
return "LibraryDto  - [name = "+this.name+" , noOfWards="+this.noOfWards+" , location="+this.location+"]" ;
}
}