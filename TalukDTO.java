public class TalukDTO{

private int  talukId;
private StreetDTO street;

public TalukDTO(){
System.out.println(this.getClass().getSimpleName()   +   "object is creared");
}

public int getTalukId(){
return talukId;
}
public void setTalukId(int  talukId){
this.talukId=talukId;
}

public StreetDTO  getStreet(){
return street;
}
public void setStreet(StreetDTO street){
this.street=street;
}
@Override
public String toString(){
return "taluk details are __ {talukId="+this.talukId+"  , street="+this.street+" }";
}
}