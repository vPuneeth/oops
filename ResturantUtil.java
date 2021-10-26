class ResturantUtil{

public static void main(String a[]){

Resturant asd = new Resturant();
asd.resturantId = 672;
asd.resturantName ="mahaal";
asd.resturantType ="veg";
asd.location = "rajajinagar";
asd.ownerName= "punit";

asd.serve();
asd.displayResturantDetails();

Resturant asdf = new Resturant();
asdf.resturantId = 6072;
asdf.resturantName ="hawaas";
asdf.resturantType ="non veg";
asdf.location = "kormangal";
asdf.ownerName= "ravi";

asd.serve();
asdf.displayResturantDetails();

}
}