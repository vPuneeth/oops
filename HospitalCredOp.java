class HospitalCredOp{
public PatientHasADto[] patients;    //declaring arrays
private int index;

public HospitalCredOp(int size){          //constructor
patients =new PatientHasADto[size];      //initaizing size of arrays in constructor for dynamically giving its size 
System.out.println("default object is created"); 
}

public boolean createPatient(PatientHasADto patients){       //returntype is given as boolean since if the patient is not added then there itself it give false
boolean patientAdded = false;                                                     //(PatientHasADto patients) is given inside() since details of patient is in patienthasadto class 
System.out.println("inside createPatient method");                  //boolean patientadded is declared as false by user since it is not used inside main() they must be intialized.
if(patients != null){                                                                          //null becz default vale of all non primitive DT is null
this.patients[index++]=patients;          //this keyword is used bcz instance variable of type PatientHasADto[] array is created .instance variable int index is declared intailly ,   index++ is used to increase the index value
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

public PatientHasADto getPatientByName(String name){          //to find a patiet by name
PatientHasADto patientHasADto = null;
if(name != null){
   for(int i=0 ;i<patients.length;i++){
           if(patients[i].getName().equals(name)){

               patientHasADto = patients[i];
System.out.println("patient found by name " + name );
}
}
}
else{
System.out.println("No records found" );
}

return patientHasADto ;

}


public PatientHasADto getPatientById(int patientId){
PatientHasADto patientHasADto=null;
System.out.println("Inside the getPatientById()");

 if(patientId != 0){

  for(int i=0;i<patients.length;i++){

    if(patients[i].getPatientId() == patientId){
     
      patientHasADto=patients[i];
 System.out.println("Patient found by Id: "+patientId);
     }
}
}
   
 else{
      System.out.println("No records found");
     }
 return patientHasADto;
}


public PatientHasADto getPatientByGender(String gender){
PatientHasADto patientHasADto=null;
System.out.println("Inside the getPatientByGender()");

 if(gender!=null){

  for(int i=0;i<patients.length;i++){

    if(patients[i].getGender().equals(gender)){
      System.out.println("Patient found by Gender: "+gender);
      patientHasADto=patients[i];
     }
}
}
    else{
      System.out.println("No records found");
     }
 return patientHasADto;
}


public boolean updatePatientContactNoById(int patientId , long contactNo){
 boolean isItUpdated = false;
PatientHasADto patientHasADto=null;
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