class HospitalCredOpUtil{

public static void main(String a[]){

HospitalCredOp hospital = new HospitalCredOp(2);  //delcaring size of array as 2

PatientHasADto dto1 = new PatientHasADto();
dto1.setPatientId(273);
dto1.setName("mukesh");
dto1.setGender("male");
dto1.setIsAlive(true);

PatientHasADto dto2 = new PatientHasADto();
dto2.setPatientId(243);
dto2.setName("rakesh");
dto2.setGender("male");
dto2.setIsAlive(false);

boolean isAdded =hospital.createPatient(dto1);
System.out.println(isAdded);
boolean isAdded1 =hospital.createPatient(dto2);
System.out.println(isAdded1);

hospital.getAllPatients();
}
}