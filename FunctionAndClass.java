    class FunctionAndClass{
       public static void main(String [] args){
       Person Ajay = new Person("Ajay","Male",23);
       Person Friend =  new Person( "Sachin", "Male", 22);
	System.out.println(Ajay);
        System.out.println(Friend);
   }


    }
class Person{
    String name ;
    String gender ;
    int age ;
	
    Person(String name, String gender, int age){
  this.name= name;
  this.gender = gender;
  this.age = age;
}

@Override
public String toString(){
return "Person{name='"+ name + "', age " + age + ", gender = '" + gender + "'}";
}

 void Swiming(){
    System.out.println("is Summing");
   }
void Writting(){
 System.out.println("is writting");
}
void Thinking(){
 System.out.println("is thinking");
}
void Dancing(){
 System.out.println("is dancing");
}
void Sleeping(){
 System.out.println("id sleeping");
}
void Riding(){
 System.out.println("is riding");
}



}
