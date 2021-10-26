public class LICDto{

public LICDto(){
System.out.println(this.getClass().getSimpleName() + "object is created");
}
private String planName;
private int planNo;
private String productName;

public String getPlanName(){
return planName;
}
public void setPlanName(String planName){
this.planName=planName;
}

public int getPlanNo(){
return planNo;
}
public void setPlanNo(int planNo){
this.planNo=planNo;
}

public String getProductName(){
return productName;
}
public void setProductName(String productName){
this.productName=productName;
}

@Override
public String toString(){
return "LICDto - {planName="+this.planName+" , planNo="+this.planNo+" , productName="+this.productName+"}";
}
}
