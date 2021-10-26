class Exam{

public String  universityName;
public int fees;

public Exam(String  universityName , int fees ){
System.out.println("Exam object is invoked");
this.universityName = universityName;
this.fees = fees;
}

public void ExamRule(){
System.out.println(universityName+" \n "+fees);
}

}