class Laptop{

public String laptopName;
public int laptopCost;
public String laptopGraphics;
public String laptopInternalMemory;
public boolean isHdmiPortAvailable;

public Laptop(String laptopName , int laptopCost , String laptopGraphics , String laptopInternalMemory , boolean isHdmiPortAvailable){
System.out.println("object is evoked");
this.laptopName = laptopName;
this.laptopCost = laptopCost;
this.laptopGraphics = laptopGraphics;
this.laptopInternalMemory = laptopInternalMemory;
this.isHdmiPortAvailable = isHdmiPortAvailable;
System.out.println("object is ended");

}

public void laptopDetails(){
System.out.println("  laptop properties are ---");
System.out.println(laptopName+ "\n "+laptopCost+" \n "+laptopGraphics+" \n "+laptopInternalMemory+" \n "+isHdmiPortAvailable+" \n");
}

public static void main(String a[]){

Laptop properties = new Laptop("Acer" , 45000 , "Radeon" , "4GB" , true);
properties.laptopDetails();
Laptop properties1 = new Laptop("Dell" , 65000 , "Rad" , "8GB" , true);
properties1.laptopDetails();

}

}
 


