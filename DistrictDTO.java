public class DistrictDTO{

private int  districtId;
private TalukDTO taluk;

public DistrictDTO(){
System.out.println(this.getClass().getSimpleName()   +   "object is creared");
}

public int getDistrictId(){
return districtId;
}
public void setDistrictId(int  districtId){
this.districtId=districtId;
}

public TalukDTO getTaluk(){
return taluk;
}
public void setTaluk(TalukDTO taluk){
this.taluk=taluk;
}
@Override
public String toString(){
return "district details are -- {districtId="+this.districtId+"  , taluk="+this.taluk+" }";
}
}