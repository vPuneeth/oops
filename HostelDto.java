public class HostelDto{

private String name;
private int id;
private int hostelRent;

public HostelDto(){
System.out.println(this.getClass().getSimpleName() + " default constructor is created");
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

public int getHostelRent(){
return hostelRent;
}
public void setHostelRent(int hostelRent){
this.hostelRent=hostelRent;
}

@Override
public String toString(){          //toString() always returns state of an object//
return "HostelDto - {name="+this.name+" , id="+this.id+" , hostelRent="+this.hostelRent+"}";
}

@Override
public int hashCode(){
return "HostelDto - {hostelRent = "+this.hostelRent+"}";

}
}