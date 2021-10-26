class ChatCentreUtils{

public static void main(String a[]){

ChatCentre centre = new ChatCentre();

centre.items[0] ="pani puri";
centre.items[1] ="bajji";
centre.items[2] ="vadapav";
centre.items[3] ="gobi";
centre.items[4] ="masalapuri";

ChatCentre centre1 = new ChatCentre("sai chats" , "near KLE ground" , centre.items , 2 , "punit" , true);



centre1.displayChatCentre();
centre1.getItems();
}
}