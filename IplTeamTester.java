class IplTeamTester{

public static void main(String a[]){

Rcb details = new Rcb();
details.location = "INDIA";
details.teamName="RCB";
details.ownerName="Vijay ";
details.associatePartners="MYNTRA";
details.captainName="VIRAT";
details.noOfTitles=0;
details.franchiseOfRcb();
details.bestTeamInIpl();

Csk detail = new Csk();
detail.location = "INDIA";
detail.teamName="CSK";
detail.ownerName="Srinivasan";
detail.associatePartners="Myntra";
detail.captainName="DHONI";
detail.noOfTitles=3;
detail.franchiseOfCsk();
detail.bestTeamInIpl();
}
}