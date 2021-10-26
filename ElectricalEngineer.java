class ElectricalEngineer extends Engineer{

	public ElectricalEngineer(){
		System.out.println(this.getClass().getSimpleName()+" object is created");
		
	}
	@Override
	public void problemSolving(){

			System.out.println("problem solving in Electrical");
                                                      
	System.out.println(name);
System.out.println(engName+"\n");
}

}