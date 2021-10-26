class AirportTester{
public static void main(String a[]){
Airports platform = new Airports();
platform.setAirportId(575);
platform.setName("kempegowda");
platform.setLocation("bangalore");

Terminal terminal = new Terminal();
terminal.terminalId=231;
terminal.terminalName="2a1";

platform.setTerminal(terminal);
System.out.println(platform);


}

}