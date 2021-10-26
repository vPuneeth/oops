public class GoldDto{

public GoldDto(){
System.out.println("default constructor is created");
}

private String chemicalName;
private int atomicNo;
private float purityOf24k;
private int costOf24K;

public String getChemicalName(){
return chemicalName;
}
public void setChemicalName(String chemicalName){
this.chemicalName=chemicalName;
}

public int getAtomicNo(){
return atomicNo;
}
public void setAtomicNo(int atomicNo){
this.atomicNo=atomicNo;
}

public float getPurityOf24k(){
return purityOf24k;
}
public void setPurityOf24k(float purityOf24k){
this.purityOf24k=purityOf24k;
}

public  int getCostOf24K(){
return costOf24K;
}
public void setCostOf24K(int costOf24K){
this.costOf24K=costOf24K;
}
}













