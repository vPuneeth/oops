import java.util.Scanner;
class HospitalCredOpUtilRunTime{

public static void main(String a[]){
Scanner sc = new Scanner(System.in);
System.out.println("enter the no. of patients ");
int size = sc.nextInt();

HospitalCredOp hospital = new HospitalCredOp(size);  //delcaring size of array 

for(int i=0;i<size;i++){

PatientHasADto dto1 = new PatientHasADto();
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