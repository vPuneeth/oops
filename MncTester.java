class MncTester{

public static void main(String a[]){

Infosys details = new Infosys();
details.companyName="Infosys";
details.companyLocation="Mysore";
details.companyID = 543;
details.companyProblem();
details.problemDetails();

Wipro details1 = new Wipro();
details1.companyName="Wipro";
details1.companyLocation="Bangalore";
details1.companyID = 234;
details1.companyProblem();
details1.problemDetails();

CapeGemini details2 = new CapeGemini();
details2.companyName="Capegemini";
details2.companyLocation="pune";
details2.companyID = 1234;
details2.companyProblem();
details2.problemDetails();

Cognizant details3 = new Cognizant();
details3.companyName="Cognizant";
details3.companyLocation="kolkata";
details3.companyID = 134;
details3.companyProblem();
details3.problemDetails();
}
}