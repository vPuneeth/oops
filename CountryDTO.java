public class CountryDTO{

private int  countryId ;
private StateDTO state ;

public CountryDTO(){
System.out.println(this.getClass().getSimpleName()   +   "object is creared");
}

public int getCountryId(){
return countryId;
}
public void setCountryId(int  countryId){
this.countryId=countryId;
}

public StateDTO getState(){
return state;
}
public void setState(StateDTO state){
this.state=state;
}
@Override
public String toString(){
return "country details are __ {countryId="+this.countryId+"  , state="+this.state+" }";
}
}