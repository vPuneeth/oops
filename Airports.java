class Airports{
public int airportId;
public String name;
public String location;
public Terminal terminal;  

public Airports(){
System.out.println("object is created");
}

public void setAirportId(int airportId){
this.airportId=airportId;
}
public void setName(String name){
this.name=name;
}
public void setLocation(String location){
this.location=location;
}
public void setTerminal(Terminal terminal){
this.terminal=terminal;
}

@Override
public String toString(){
return "details are -- {airportId="+this.airportId+" , name="+this.name+" , location ="+this.location+", terminal="+this.terminal+"}";
}
}
