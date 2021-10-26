class FancyStore{

String storeName;
String location;
long contactNo;
boolean isOpen;

public FancyStore(String storeName , String location , long contactNo , boolean isOpen){
this.storeName=storeName;
this.location=location;
this.contactNo=contactNo;
this.isOpen=isOpen;
System.out.println(this.storeName+ "\n" +this.location+"\n"+this.contactNo+"\n"+this.isOpen+"\n");
}

public FancyStore(){
this("rahul store" , "hennur road" , 990078635l ,true);
System.out.println("fancy store object is created");
}

public static void main(String a[]){
FancyStore  details = new FancyStore();
}
}



