public class PropertyDto{

public PropertyDto(){
System.out.println("default object is created");
}

private String propertyHolder;
private String propertyType;
private long propertyCost;
private String propertyLocation;

public String getPropertyHolder(){
return propertyHolder;
}
public void setPropertyHolder( String propertyHolder){
this.propertyHolder=propertyHolder;
}

public String getPropertyType(){
return propertyType;
}
public void setPropertyType( String propertyType){
this.propertyType=propertyType;
}

public long getPropertyCost(){
return propertyCost;
}
public void setPropertyCost( long propertyCost){
this.propertyCost=propertyCost;
}

public String getPropertyLocation(){
return propertyLocation;
}
public void setPropertyLocation( String propertyLocation){
this.propertyLocation=propertyLocation;
}
}






