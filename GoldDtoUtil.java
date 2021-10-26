class GoldDtoUtil{

public static void main(String a[]){

GoldDto dto = new GoldDto();
dto.setChemicalName("Au");
dto.setAtomicNo(79);
dto.setPurityOf24k(99.9f);
dto.setCostOf24K(47000);
System.out.println(dto.getChemicalName()+"\n"+dto.getAtomicNo()+"\n"+dto.getPurityOf24k()+"\n"+dto.getCostOf24K()+"\n");
}
}