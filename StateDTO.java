public class StateDTO{

private int  stateId ;
private DistrictDTO district;

public StateDTO(){
System.out.println(this.getClass().getSimpleName()   +   "object is creared");
}

public int getStateId(){
return stateId;
}
public void setStateId(int  stateId){
this.stateId=stateId;
}

public DistrictDTO getDistrict(){
return district;
}
public void setDistrict(DistrictDTO district){
this.district=district;
}
@Override
public String toString(){
return "state details are __ {stateId="+this.stateId+"  , district="+this.district+" }";
}
}