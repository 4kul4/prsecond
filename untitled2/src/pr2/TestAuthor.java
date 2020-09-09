package pr2;
import java.lang.*;
public class TestAuthor {
    public static void main(String[] args){
    Author a=new Author("Gorbachev", "gorbach@mail.ru", 'm');
    a.setEmail("g@mail.ru");
    System.out.println(a.toString());
    }
}

