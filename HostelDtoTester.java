class HostelDtoTester{
public static void main(String a[]){
HostelDto info = new HostelDto();
info.setName("Nehru's pg ");
info.setId(273);
info.setHostelRent(55000);
System.out.println(info.getName()+" , "+info.getId()+" , "+info.getHostelRent());
System.out.println(info);
System.out.println(info.hashCode());
}
}