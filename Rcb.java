class Rcb extends IplTeamPoly{

public Rcb(){
System.out.println(this.getClass().getSimpleName()+" object is created");
}

public void franchiseOfRcb(){
System.out.println("Craziest fanbase team is --" +teamName);
System.out.println("Owner name is --" +ownerName);
System.out.println(" main associate partner os --" +associatePartners);
System.out.println("current captain name is -- " +captainName);
System.out.println("number of titles won is --" +noOfTitles);
}
@Override
public void iplForEntertainment(){
System.out.println("best two months of the year");
}
}