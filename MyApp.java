import java.util.*;
import myClass.*;
import DataBase.LibDB;

/**
 * MyApp 클래스의 설명을 작성하세요.
 *
 * @author (2025320018진시원)
 * @version (2026.10.06)
 */
public class MyApp
{
    public static void main(String[] args){
        LibDB<User> userDB = new LibDB<User>();
        LibDB<Book> bookDB = new LibDB<Book>();
        HashMap<User, Book> loanDB =new HashMap<User, Book>();
        
        User user1 = new User(2025320001, "Kim");
        User user2 = new User(2024320002, "Lee");
        User user3 = new User(2023320003, "Park");
    
        userDB.addElement(user1);
        userDB.addElement(user2);
        userDB.addElement(user3);
    }

    /**
     * 메소드 예제 - 사용자에 맞게 주석을 바꾸십시오.
     *
     * @param  y  메소드의 샘플 파라미터
     * @return    x 와 y의 합
     */
    public static <T extends DB_Element> void printDB(LibDB<T> db)
    {
        
    }
    
    /**
     * 메소드 예제 - 사용자에 맞게 주석을 바꾸십시오.
     *
     * @param  y  메소드의 샘플 파라미터
     * @return    x 와 y의 합
     */
    public static void printLoanList(HashMap<User, Book> loanDB)
    {
        
    }

}