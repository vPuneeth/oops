class PropertyDtoUtil{

public static void main(String a[]){

PropertyDto dto = new PropertyDto();
dto.setPropertyHolder( "Madappa");
dto.setPropertyType( "Agri type");
dto.setPropertyCost( 2000000l);
dto.setPropertyLocation( "koramangala");
System.out.println(dto.getPropertyHolder()+"\n"+dto.getPropertyType()+"\n"+dto.getPropertyCost()+"\n"+dto.getPropertyLocation()+"\n");
}
}