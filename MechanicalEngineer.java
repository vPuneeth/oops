class MechanicalEngineer extends Engineer{

	public MechanicalEngineer(){
		System.out.println(this.getClass().getSimpleName()+" object is created");
		
	}
	@Override
	public void problemSolving(){
			System.out.println("problem solving in Mechanical");
	System.out.println(name);
System.out.println(engName+"\n");
}

}