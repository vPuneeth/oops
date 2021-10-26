class Appliances{

public String storename;   //croma
public String location;        //Hennur gardens
public boolean isOpen;      //true
public long contactNo;
public String storeType;  //electric

public  Appliances(){
System.out.println("Appliances object is created");
}

public Appliances(String storename , String location ,  boolean isOpen , long contactNo , String storeType){
this.storename=storename;
this.location=location;
this.isOpen=isOpen;
this.contactNo=contactNo;
this.storeType=storeType;
System.out.println(storename + " \n "+location +" \n "+isOpen+"  \n "+contactNo+" \n "+storeType+"  \n ");

}

}
