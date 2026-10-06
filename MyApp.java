import java.util.*;
import myClass.*;
import DataBase.LibDB;

/**
 * MyApp 클래스의 설명을 작성하세요.
 *
 * @author (2025320018 진시원, 2025320037 윤승환)
 * @version (2026.10.06)
 */
public class MyApp
{
    /**
     * 도서관 대출 처리 프로그램을 실행하는 main 메소드
     * 
     * 
     */
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
        
        System.out.println("----- 이용자 목록 출력 -----");
        printDB(userDB);
        
        Book book1 = new Book("B01", "Java Programming", "홍길동", "ABC", 2000);
        Book book2 = new Book("B02", "Software Analysis and Design", "profsHwang", "SMU", 2023);
        Book book3 = new Book("B03", "명품 자바프로그래밍", "황기태", "생능출판", 2025);
        Book book4 = new Book("B04", "소프트웨어테스트", "profsHwang", "SMU", 2024);
        
        bookDB.addElement(book1);
        bookDB.addElement(book2);
        bookDB.addElement(book3);
        bookDB.addElement(book4);
        
        System.out.println("----- 책 목록 출력 -----");
        printDB(bookDB);
        
        loanDB.put(userDB.findElement("2025320001"), bookDB.findElement("B02"));
        loanDB.put(userDB.findElement("2024320002"), bookDB.findElement("B03"));
        loanDB.put(userDB.findElement("2023320003"), bookDB.findElement("B04"));
        
        printLoanList(loanDB);
    }

    /**
     * 책DB 또는 이용자DB에 저장된 모든 요소를 출력하는 Generic 메소드
     *
     * @param  db 출력할 데이터베이스(bookDB나 userDB)
     */
    public static <T extends DB_Element> void printDB(LibDB<T> db)
    {
        db.printAllElement();
        System.out.println();
    }
    
    /**
     * loanDB에 저장된 이용자와 대출한 책을 대출 현황 형식으로 출력하는 메소드
     *
     * @param  loanDB 이용자를 key, 대출한 책을 value 값으로 저장한 대출 DB
     */
    public static void printLoanList(HashMap<User, Book> loanDB)
    {
        System.out.println("----- 대출 현황 -----");
        Iterator<User> it = loanDB. keySet().iterator();
        
        while(it.hasNext()) {
            User user = it.next();
            Book book = loanDB.get(user);
            System.out.println(user + " ===> " + book);
        }
        
        System.out.println("--------------------");
    }
}