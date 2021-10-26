public class DrivingLicenseDto{
private String name;
private int id;
private String state;

public DrivingLicenseDto(){
System.out.println(this.getClass().getSimpleName() +  "object is created");
}

public String getName(){
return name;
}
public void setName(String name){
this.name=name;
}

public int getId(){
return id;
}
public void setId(int id){
this.id=id;
}

public String getState(){
return state;
} 
public void setState(String state){
this.state=state;
}

@Override
public String toString(){
return "DrivingLicenseDto - {name="+this.name+" , id="+this.id+" , state="+this.state+"}";
}
}