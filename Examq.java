class Examq{

public String uniName;
public int fees;

public Examq(String uniName , int fees){
this.uniName = uniName;
this.fees = fees;
System.out.println(uniName+ " \n " +fees);

}

public static void main(String a[]){

Examq exam = new Examq("VTU" , 1234);
}
}