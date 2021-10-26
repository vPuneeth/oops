class Metro{

String name;
String government;
String greenLightStarting;
String greenLightEnding;
String greenLineStations[]={"rajainagar","kuvempu road"," sri rampura"," mantri square"};

public Metro(){
this("Namma Metro" , "karnataka" , "nagasandra" , "puttenhali");
System.out.println("object is created");
}

public Metro(String name , String government , String greenLightStarting , String greenLightEnding){
this.name=name;
this.government=government;
this.greenLightStarting =greenLightStarting ;
this.greenLightEnding=greenLightEnding;
System.out.println(this.name+"\n"+this.government+"\n"+this.greenLightStarting+"\n"+this.greenLightEnding+"\n");
}

public void detailsOfGreenLineStations(){
for(int i=0;i<greenLineStations.length;i++){
System.out.println(greenLineStations[i]);
}
}
}




