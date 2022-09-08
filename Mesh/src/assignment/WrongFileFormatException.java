package assignment;

public class WrongFileFormatException extends Exception{
	String message;
    public WrongFileFormatException(String text) {
        message = text;
    }
    @Override
    public String toString(){
        return message;
    }
}
