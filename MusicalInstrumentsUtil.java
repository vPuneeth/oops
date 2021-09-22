class MusicalInstrumentsUtil{

 

public static void main(String a[]){


MusicalInstruments music = new MusicalInstruments();    
 
 music.name="piano";
music.price=4366457;
music.frequency="50hz";
music.type= "indian";

System.out.println("instrument name is  " + music.name);
System.out.println(music.price+" \n "+music.frequency+" \n "+music.type);

music.play(music.name);

}
}