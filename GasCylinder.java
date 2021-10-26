class GasCylinder{

public String name;
public String colour;
public int price;

public GasCylinder(String name , String colour , int price ){
System.out.println("GasCylinder object is invoked");
this.name=name;
this.colour=colour;
this.price=price;
System.out.println(name+" \n "+colour+" \n "+price);
}

public static void main(String a[]){

GasCylinder property = new GasCylinder("kjh" , "blue" , 2354);
GasCylinder property1 = new GasCylinder("kjhwevwe" , "green" , 354);

}
}

