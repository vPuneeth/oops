public class Tank{

String tankName;
int tankSizeInLts;
int noOfTanks;
String tankBrand;
Water water;

public Tank(){
System.out.println(this.getClass().getSimpleName()  +  " object is created");
}
@Override
public String toString(){
return " Specifications are -- {tankName="+this.tankName+" ,tankSizeInLts="+this.tankSizeInLts+" , noOfTanks="+this.noOfTanks+"  ,tankBrand="+this.tankBrand+" , water="+this.water+"}";
}

}