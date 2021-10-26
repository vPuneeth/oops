class Planets{

      public String planetName;
      public int noOfMoons;
      public float equatorialDiameter ;
      public boolean isRingsPresent;

public Planets( String planetName , int noOfMoons , float equatorialDiameter , boolean isRingsPre){   //short form of instancevariables  is used. if same name is used then it becoms local variables which their life ends within method..otherwise we can use same name as of Insatncevar and has to use this keyword.//
System.out.println("Planets object invoked");
this.planetName = planetName;
this.noOfMoons = noOfMoons;
this.equatorialDiameter = equatorialDiameter ;  //to avoid ambuigity bet local v and instace var we use 'this' keyword//
isRingsPresent = isRingsPre ;
System.out.println(planetName+" \n "+noOfMoons+" \n "+equatorialDiameter+" \n "+isRingsPresent +"\n");
}

public void planetsChar(){
System.out.println("characterstics of planets are --");
}


}
