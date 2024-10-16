    class ClassAndObjectBird{
       public static void main(String [] args){
       Bird Sparrow = new Bird("Sparrow","Black","small");
       Bird Penguin =  new Bird( "Penguin", "White", "large");
	System.out.println(Sparrow);
        System.out.println(Penguin);
   }


    }
class Bird{
    String name ;
    String colour ;
    String type;
	
    Bird(String name, String colour, String type){
  this.name= name;
  this.colour = colour;
  this.type = type;
}

@Override
public String toString(){
return "Bird{name='"+ name + "', type =  " + type + ", colour = '" + colour + "'}";
}





}
