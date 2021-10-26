class ChatCentre{

String centreName;
int centreId;
String location;
String ownerName;
boolean isOpen;
String items[] = new String[5];


public ChatCentre(){
System.out.println("chatcentre object is created");

}

public ChatCentre(String centreName , String location , String items[] , int centreId ,String ownerName ,  boolean isOpen){
this.centreName = centreName;               //rhs=local variable ; lhs = instance var declared above//
this.location = location;
this.items =items;

this.centreId = centreId;
this.ownerName= ownerName;
this.isOpen=isOpen;

}

public void displayChatCentre(){
System.out.println(centreName+"  \n "+centreId+" \n  "  +location+"       \n "+ownerName+"  \n  "+isOpen+"   \n   ");
}

public void getItems(){
for(int i=0;i<items.length;i++){
System.out.println(items[i]);
}
}
}