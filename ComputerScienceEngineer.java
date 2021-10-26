class ComputerScienceEngineer extends Engineer{

	public ComputerScienceEngineer(){
		System.out.println(this.getClass().getSimpleName()+" object is created");
		
	}
	@Override
	public void problemSolving(){
			System.out.println("problem solving in ComputerScience");
	System.out.println(name);
System.out.println(engName+"\n");
}

}