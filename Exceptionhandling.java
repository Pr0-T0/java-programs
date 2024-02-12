class InvalidAgeException extends Exception{
    public InvalidAgeException(String msg){
        super(msg);
    }
}
public class Exceptionhandling {
    static void check(int age) throws InvalidAgeException{
        if(age < 18){
            throw new InvalidAgeException("Age below 18");
        }
    }
    public static void main(String[] args) {
        try{
            check(15);
        }catch(InvalidAgeException e){
            System.out.println(e);
        }
    }
}
