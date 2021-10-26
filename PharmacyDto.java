public class PharmacyDto{
public PharmacyDto(){
System.out.println(this.getClass().getSimpleName()  +  "object is created");
}

private String name;
private String location;
private long contactNo;

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

public long getContactNo(){
return contactNo;
}
public void setContactNo(long contactNo){
this.contactNo=contactNo;
}

@Override
public String toString(){
return "PharmacyDto - {name="+this.name+"  ,  location ="+this.location+" , contactNo = "+this.contactNo+"}";
}

}