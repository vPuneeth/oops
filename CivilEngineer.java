class CivilEngineer extends Engineer{

	public CivilEngineer(){
		System.out.println(this.getClass().getSimpleName()+" object is created");
		
	}
	@Override
	public void problemSolving(){
			System.out.println("problem solving in civil");
System.out.println(name);
System.out.println(engName+"\n");
	}
	 
}