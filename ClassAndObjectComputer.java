    class ClassAndObjectComputer{
       public static void main(String [] args){
       Computer hp = new Computer("hp","laptop",20);
       Computer Apple =  new Computer( "Apple", "pc", 19);
	System.out.println(hp);
        System.out.println(Apple);
   }


    }
class Computer{
    String name ;
    String model ;
    int version ;
	
    Computer(String name, String model, int version){
  this.name= name;
  this.model = model;
  this.version = version;
}

@Override
public String toString(){
return "Computer{name='"+ name + "', version = " + version + ", model = '" + model + "'}";
}

 



}
