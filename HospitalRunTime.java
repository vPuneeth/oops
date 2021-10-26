import java.util.Scanner;
class HospitalRunTime{

public static void main(String a[]){
Scanner sc = new Scanner(System.in);
System.out.println("enter the no. of patients ");
int size = sc.nextInt();

HospitalHas hospital = new HospitalHas(size);  

for(int i=0;i<size;i++){

AddressHas dto1 = new AddressHas();
System.out.println("enter  id");
int patientId=sc.nextInt();
dto1.setPatientId(patientId);
System.out.println("enter  name");
String name=sc.next();
dto1.setName(name);
System.out.println("enter  gender");
String gender=sc.next();
dto1.setGender(gender);
System.out.println("enter  is alive");
boolean isAlive=sc.nextBoolean();
dto1.setIsAlive(isAlive);
System.out.println("enter the contact no");
long contactNo=sc.nextLong();
dto1.setContactNo(contactNo);

//address
System.out.println("enterd the  address method ");
AddressDTO addr= new AddressDTO();
dto1.setAddress(addr);
System.out.println("enter the address id");
addr.setAddressId(sc.nextInt());

//country
System.out.println("enterd the  country method");
CountryDTO countr = new CountryDTO();
addr.setCountry(countr);
System.out.println("enter the countryId");
countr.setCountryId(sc.nextInt());

//state
System.out.println("enter the patient state");
StateDTO stat= new StateDTO();
countr.setState(stat);
System.out.println("enter the stateId");
stat.setStateId(sc.nextInt());

//district
System.out.println("enter the patient district");
DistrictDTO distri= new DistrictDTO();
stat.setDistrict(distri);
System.out.println("enter the district");
distri.setDistrictId(sc.nextInt());

//taluk
System.out.println("enter the patient taluk");
TalukDTO tal= new TalukDTO();
distri.setTaluk(tal);
System.out.println("enter the talukId");
tal.setTalukId(sc.nextInt());

//street
System.out.println("enter the patient street");
StreetDTO stre= new StreetDTO();
tal.setStreet(stre);
System.out.println("enter the street id ");
stre.setStreetId(sc.nextInt());
System.out.println("enter the street no ");
stre.setStreetNo(sc.nextInt());


boolean isAdded =hospital.createPatient(dto1);
System.out.println("patient added" + isAdded);

}
hospital.getAllPatients();

System.out.println("enter patient name to be found");
String patientName =sc.next();
System.out.println(hospital.getPatientByName(patientName));

System.out.println("enter the patient Gender to fetch details:");
String gen=sc.next();
System.out.println(hospital.getPatientByGender(gen));

System.out.println("enter the patient Id and  contact no to update");
int id=sc.nextInt();
long con = sc.nextLong();
System.out.println( hospital.updatePatientContactNoById(id,con));


hospital.getAllPatients();




}
}