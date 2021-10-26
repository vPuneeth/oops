public class MobilePhones{

public String name;
public int cost;
public int internalMemoryInGb;
public SimCards simCards;
public boolean isFingerPrintAvailable;

public MobilePhones(boolean isFingerPrintAvailable){
System.out.println(this.getClass().getSimpleName()  +  "object is created");
this.isFingerPrintAvailable=isFingerPrintAvailable;
System.out.println("is finger print sensor available "  +  isFingerPrintAvailable);
}

public void setName(String name){
this.name=name;
}
public void setCost(int cost){
this.cost=cost;
}
public void setInternalMemoryInGb(int internalMemoryInGb){
this.internalMemoryInGb=internalMemoryInGb;
}
public void setSimCards(SimCards simCards){
this.simCards=simCards;
}

@Override
public String toString(){
return "mobile phone characterstics are -- {name="+this.name+" , cost="+this.cost+"  ,internalMemoryInGb="+this.internalMemoryInGb+" , simCards="+this.simCards+"}";
}
}