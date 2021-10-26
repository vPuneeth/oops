class MobilePhonesTester{

public static void main(String a[]){
MobilePhones features = new MobilePhones(true);
features.setName("Asus rog ");
features.setCost(55000);
features.setInternalMemoryInGb(128);

SimCards detail = new SimCards();
detail.setIsDualSimPortAvailable(true);
detail.setTotalNoOfPorts(3);

features.setSimCards(detail);
System.out.println(features);

}
}