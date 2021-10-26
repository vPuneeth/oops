public class AddressDTO{

private int  addressId ;
private CountryDTO country ;

public AddressDTO(){
System.out.println(this.getClass().getSimpleName()   +   "object is creared");
}

public int getAddressId(){
return addressId;
}
public void setAddressId(int  addressId){
this.addressId=addressId;
}

public CountryDTO getCountry(){
return country;
}
public void setCountry(CountryDTO country){
this.country=country;
}

@Override
public String toString(){
return "address details are __ {addressId="+this.addressId+"  , country="+this.country+" }";
}
}