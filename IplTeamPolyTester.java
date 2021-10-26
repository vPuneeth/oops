class IplTeamPolyTester{

public static void main(String a[]){

IplTeamPoly details = new Rcb1();
details.location = "INDIA";
details.teamName="RCB";
details.ownerName="Vijay ";
details.associatePartners="MYNTRA";
details.captainName="VIRAT";
details.noOfTitles=0;
details.bestTeamInIpl();
details.iplForEntertainment();



IplTeamPoly detail = new Csk1();
detail.location = "INDIA";
detail.teamName="CSK";
detail.ownerName="Srinivasan";
detail.associatePartners="Myntra";
detail.captainName="DHONI";
detail.noOfTitles=3;
detail.bestTeamInIpl();
detail.iplForEntertainment();  
}

}