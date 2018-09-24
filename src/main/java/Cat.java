public class Cat {

    private int age;
//can hardcode information, but that would mean all instances created would be 5
//instead declare the variable - and then can give it a value later on.

    private String name;

//    CONSTRUCTOR
    public Cat(String name, int age){
        this.name = name; //similar to @name = name
        this.age = age;
    }

    public String meow(){
        return "Meoooww";
    }

//    GETTER - start with get
    public int getAge(){
        return this.age;
//        can get away without the 'this' too
    }

//    SETTERS
    public void setAge(int age){
        this.age = age;
    }

}
