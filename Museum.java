class Museum{

String name;
String location;
int entryFees;

public Museum(){
this("Nimhans Brain museum" , "Hosur road" , 100);
System.out.println("constructor is created");
}

public Museum(String name , String location , int entryFees){
this.name=name;
this.location=location;
this.entryFees=entryFees;
System.out.println(name +"\n"+location+"\n"+entryFees+"\n");
}

public static void main(String a[]){
Museum details = new Museum();
}
}

