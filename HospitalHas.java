class HospitalHas{
public AddressHas[] patients;    
private int index;

public HospitalHas(int size){         
patients =new AddressHas[size];     
System.out.println("default object is created"); 
}

public boolean createPatient(AddressHas patients){      
boolean patientAdded = false;                                                     
System.out.println("inside createPatient method");                  
if(patients != null){                                                                         
this.patients[index++]=patients;          
patientAdded = true;
}
else{
System.out.println("no patient is added");
return patientAdded = false;
}
return patientAdded;
}

public void getAllPatients(){
for(int i=0 ;i<patients.length;i++){
System.out.println(patients[i]);
}
}

public AddressHas getPatientByName(String name){          
AddressHas patientHas= null;
if(name != null){
   for(int i=0 ;i<patients.length;i++){
           if(patients[i].getName().equals(name)){

               patientHas= patients[i];
System.out.println("patient found by name " + name );
}
}
}
else{
System.out.println("No records found" );
}

return patientHas ;

}


public AddressHas getPatientById(int patientId){
AddressHas patientHas=null;
System.out.println("Inside the getPatientById()");

 if(patientId != 0){

  for(int i=0;i<patients.length;i++){

    if(patients[i].getPatientId() == patientId){
     
      patientHas=patients[i];
 System.out.println("Patient found by Id: "+patientId);
     }
}
}
   
 else{
      System.out.println("No records found");
     }
 return patientHas;
}


public AddressHas getPatientByGender(String gender){
AddressHas patientHas=null;
System.out.println("Inside the getPatientByGender()");

 if(gender!=null){

  for(int i=0;i<patients.length;i++){

    if(patients[i].getGender().equals(gender)){
      System.out.println("Patient found by Gender: "+gender);
      patientHas=patients[i];
     }
}
}
    else{
      System.out.println("No records found");
     }
 return patientHas;
}

//**//

public AddressHas getPatientByAddressId(int  addressId){
AddressHas pat=null;
System.out.println("Inside the getPatientByAddressId()");

 if(addressId != 0){

  for(int i=0;i<patients.length;i++){

    if(patients[i].getAddress().getAddressId() == addressId){
      System.out.println("Patient found by AddressId: "+ addressId);
      pat=patients[i];
     }
}
}
    else{
      System.out.println("No records found");
     }
 return pat;
}

public AddressHas getPatientByCountry(CountryDTO country){
AddressHas pati=null;
System.out.println("Inside the getPatientBycountry()");

 if(country != null){

  for(int i=0;i<patients.length;i++){

    if(patients[i].getAddress().getCountry().equals(country)){
      System.out.println("Patient found by country: "+ country);
      pati=patients[i];
     }
}
}
    else{
      System.out.println("No records found");
     }
 return pati;
}

public AddressHas getPatientByCountryId(int countryId){
AddressHas patie=null;
System.out.println("Inside the getPatientByCountryId()");

 if(countryId != 0){

  for(int i=0;i<patients.length;i++){

    if(patients[i].getAddress().getCountry().getCountryId()  ==  countryId){
      System.out.println("Patient found by countryId: "+ countryId);
      patie=patients[i];
     }
}
}
    else{
      System.out.println("No records found");
     }
 return patie;
}

public AddressHas getPatientByState(StateDTO state){
AddressHas patien=null;
System.out.println("Inside the getPatientByState()");

 if(state != null){

  for(int i=0;i<patients.length;i++){

    if(patients[i].getAddress().getCountry().getState().equals(state)){
      System.out.println("Patient found by state: "+ state);
      patien=patients[i];
     }
}
}
    else{
      System.out.println("No records found");
     }
 return patien;
}

public AddressHas getPatientByStateId(int stateId){
AddressHas patienth=null;
System.out.println("Inside the getPatientByStateId()");

 if(stateId != 0){

  for(int i=0;i<patients.length;i++){

    if(patients[i].getAddress().getCountry().getState().getStateId() == stateId){
      System.out.println("Patient found by stateId: "+ stateId);
      patienth=patients[i];
     }
}
}
    else{
      System.out.println("No records found");
     }
 return patienth;
}

public AddressHas getPatientByDistrict(DistrictDTO district){
AddressHas patientha=null;
System.out.println("Inside the getPatientBydistrict()");

 if(district != null){

  for(int i=0;i<patients.length;i++){

    if(patients[i].getAddress().getCountry().getState().getDistrict().equals(district)){
      System.out.println("Patient found by district: "+ district);
      patientha=patients[i];
     }
}
}
    else{
      System.out.println("No records found");
     }
 return patientha;
}


public AddressHas getPatientByDistrictId(int districtId){
AddressHas patienthas=null;
System.out.println("Inside the getPatientByDistrictId()");

 if(districtId != 0){

  for(int i=0;i<patients.length;i++){

    if(patients[i].getAddress().getCountry().getState().getDistrict().getDistrictId() == districtId){
      System.out.println("Patient found by districtId: "+districtId);
      patienthas=patients[i];
     }
}
}
    else{
      System.out.println("No records found");
     }
 return patienthas;
}

public AddressHas getPatientByTaluk(TalukDTO taluk){
AddressHas patienthas1=null;
System.out.println("Inside the getPatientByTaluk()");

 if(taluk != null){

  for(int i=0;i<patients.length;i++){

    if(patients[i].getAddress().getCountry().getState().getDistrict().getTaluk().equals(taluk)){
      System.out.println("Patient found by taluk: "+ taluk);
      patienthas1=patients[i];
     }
}
}
    else{
      System.out.println("No records found");
     }
 return patienthas1;
}


public AddressHas getPatientByTalukId(int  talukId){
AddressHas patienthas2=null;
System.out.println("Inside the getPatientByTalukId()");

 if(talukId != 0){

  for(int i=0;i<patients.length;i++){

    if(patients[i].getAddress().getCountry().getState().getDistrict().getTaluk().getTalukId() == talukId){
      System.out.println("Patient found by talukId: "+talukId);
      patienthas2=patients[i];
     }
}
}
    else{
      System.out.println("No records found");
     }
 return patienthas2;
}

public AddressHas getPatientByStreet(StreetDTO street){
AddressHas patienthas3=null;
System.out.println("Inside the getPatientBystreet()");

 if(street != null){

  for(int i=0;i<patients.length;i++){

    if(patients[i].getAddress().getCountry().getState().getDistrict().getTaluk().getStreet().equals(street)){
      System.out.println("Patient found by street: "+ street);
      patienthas3=patients[i];
     }
}
}
    else{
      System.out.println("No records found");
     }
 return patienthas3;
}

public AddressHas getPatientByStreetId(int streetId){
AddressHas patienthas4=null;
System.out.println("Inside the getPatientByStreetId()");

 if(streetId != 0){

  for(int i=0;i<patients.length;i++){

    if(patients[i].getAddress().getCountry().getState().getDistrict().getTaluk().getStreet().getStreetId() == streetId){
      System.out.println("Patient found by streetId: "+ streetId);
      patienthas4=patients[i];
     }
}
}
    else{
      System.out.println("No records found");
     }
 return patienthas4;
}

public AddressHas getPatientByStreetNo(int streetNo){
AddressHas patienthas5 =null;
System.out.println("Inside the getPatientByStreetNo()");

 if(streetNo != 0){

  for(int i=0;i<patients.length;i++){

    if(patients[i].getAddress().getCountry().getState().getDistrict().getTaluk().getStreet().getStreetNo() == streetNo){
      System.out.println("Patient found by streetNo: "+ streetNo);
      patienthas5=patients[i];
     }
}
}
    else{
      System.out.println("No records found");
     }
 return patienthas5;
}




public boolean updatePatientContactNoById(int patientId , long contactNo){
 boolean isItUpdated = false;
AddressHas patientHas=null;
if((patientId > 0) && (contactNo >0)){

  for(int i=0;i<patients.length;i++){

    if(patients[i].getPatientId() == patientId){
      System.out.println("Patient foud by id : "+ patientId);
      patients[i].setContactNo(contactNo);
isItUpdated= true;
}
}
}
else{
System.out.println("not found");
}
return isItUpdated;
}
}