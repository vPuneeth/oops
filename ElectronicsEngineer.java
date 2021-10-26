class ElectronicsEngineer extends Engineer{

	public ElectronicsEngineer(){
		System.out.println(this.getClass().getSimpleName()+" object is created");
		
	}
	@Override
	public void problemSolving(){
			System.out.println("problem solving in Electronics");
	System.out.println(name);
System.out.println(engName+"\n");
}

}