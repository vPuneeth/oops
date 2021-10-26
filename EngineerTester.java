class EngineerTester{

public static void main(String a[]){

ElectricalEngineer details = new ElectricalEngineer();
details.engineerName="ramesh";
details.collegeName="AIT";
details.branchName="ElectricalEngineer";
details.functionArranged();
details.functionDetails();

MechanicalEngineer details1 = new MechanicalEngineer();
details1.engineerName="suresh";
details1.collegeName="AIT";
details1.branchName="Mechanical engineer";
details1.functionArranged();
details1.functionDetails();

CivilEngineer details2 = new CivilEngineer();
details2.engineerName="kamlesh";
details2.collegeName="AIT";
details2.branchName="CivilEngineer";
details2.functionArranged();
details2.functionDetails();

ComputerEngineer details3 = new ComputerEngineer ();
details3.engineerName="avesh";
details3.collegeName="AIT";
details3.branchName="Computer Engineer";
details3.functionArranged();
details3.functionDetails();

InformationScienceEngineer details4 = new InformationScienceEngineer ();
details4.engineerName="mahesh";
details4.collegeName="AIT";
details4.branchName="InformationScience Engineerr";
details4.functionArranged();
details4.functionDetails();

}
}