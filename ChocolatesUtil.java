public class ChocolatesUtil {

	public static void main(String[] args) {
		
		Chocolates features = new Chocolates();
		
		features.brand = "Cadbury";
		features.modelName = "Dairy Milk Silk Bubbly";
		features.price = 165;
		features.quantityInGram = 360;
		System.out.println(features.brand+"\n"+features.modelName+"\n"+features.price+"\n"+features.quantityInGram);
		features.eatForRelaxation();
		
		Chocolates features1 = new Chocolates();
		features1.brand = "Cadbury";
		features1.modelName = "Bournville Raisin & Nuts Dark Chocolate";
		features1.price = 61;
		features1.quantityInGram = 80;
		System.out.println(features1.brand+"\n"+features1.modelName+"\n"+features1.price+"\n"+features1.quantityInGram);
		features1.eatForRelaxation();
		
		Chocolates features2 = new Chocolates();
		features2.brand = "Nestle";
		features2.modelName = "Munch bars";
		features2.price = 81;
		features2.quantityInGram = 208;
		System.out.println(features2.brand+"\n"+features2.modelName+"\n"+features2.price+"\n"+features2.quantityInGram);
		features2.eatForRelaxation();
	}

}