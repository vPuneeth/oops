
class PatientHasADto{

public PatientHasADto(){
System.out.println(this.getClass().getSimpleName()  +"object is created");
}

private int patientId;
private String name;
private String gender;
private boolean isAlive;
private long contactNo;

public int getPatientId(){
return patientId;
}
public void setPatientId(int patientId){
this.patientId=patientId;
}

public String getName(){
return name;
}
public void setName(String name){
this.name=name;
}

public String getGender(){
return gender;
}
public void setGender(String gender){
this.gender=gender;
}

public boolean getIsAlive(){
return isAlive;
}
public void setIsAlive(boolean isAlive){
this.isAlive=isAlive;
}

public long getContactNo(){
return contactNo;
}
public void setContactNo(long contactNo){
this.contactNo=contactNo;
}
@Override
public String toString(){
return "Patient details are --- {patientId="+this.patientId+" , name="+this.name+" , gender="+this.gender+" , isAlive="+this.isAlive+" , contactNo="+contactNo+" }";
}
}