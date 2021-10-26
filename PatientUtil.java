class PatientUtil{

public static void main(String a[]){

PatientDTO dto = new PatientDTO();
dto.setPatientId(4534636l);
dto.setPatientName("rahul");
dto.setAge(56);
dto.setGender("male");
dto.setAddress("rajajinagar");
dto.setBloodGroup("o+");
System.out.println(dto.getPatientId()+ "\n"+dto.getPatientName()+" \n"+dto.getAge()+" \n "+dto.getGender()+" \n "+dto.getAddress()+" \n "+dto.getBloodGroup()+" \n ");
}
}