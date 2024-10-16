    class ClassAndObjectAnimal{
       public static void main(String [] args){
       Animal Dog = new Animal("Dog","Black","Mammals");
       Animal Snake =  new Animal( "Snake", "White", "Reptgile");
	System.out.println(Dog);
        System.out.println(Snake);
   }


    }
class Animal{
    String name ;
    String colour ;
    String catagory;
	
    Animal(String name, String colour, String catagory){
  this.name= name;
  this.colour = colour;
  this.catagory = catagory;
}

@Override
public String toString(){
return "Animal{name='"+ name + "', catagory =  " + catagory + ", colour = '" + colour + "'}";
}





}
