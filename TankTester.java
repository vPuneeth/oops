class TankTester{

public static void main(String a[]){

Tank fill = new Tank();
fill.tankName="mahaal";
fill.tankSizeInLts=500;
fill.noOfTanks=3;
fill.tankBrand="MRF";

Water pour = new Water();
pour.typeOfWater="mudWater";
pour.noOfInlets=3;

fill.water = pour;
System.out.println(fill);


}
}