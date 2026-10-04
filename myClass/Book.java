package myClass;

/**
 * Book는 작가, 책의 등록번호, 출판사, 제목, 출시년도를 입력받아 책 객체를 생성하고 
 * 책의 고유한 등록번호 반환책에 대한  간단한 출력을 실행하는 메소드를 가진 클래스 
 *
 * @author (2025320018진시원)
 * @version (2026.10.03)
 */
public class Book extends DB_Element
{
    // 인스턴스 변수 - 다음의 예제를 사용자에 맞게 변경하세요.
    private String author;
    private String bookID;
    private String publisher;
    private String title;
    private int year;
    /**
     * Book 클래스의 객체 생성자
     * 
     * @param 작가(문자열), 책의 등록번호(문자열), 출판사(문자열), 제목(문자열), 출시년도(정수)
     */
    public Book(String author,String bookID, String publisher, String title, 
    int year)
    {
        this.author = author;
        this.bookID = bookID;
        this.publisher = publisher;
        this.title = title;
        this.year = year;
    }

    /**
     * 책을 식별할 수 있는 등록번호를 반환하는 메소드이다. 
     *
     * @return 책의 고유한 등록번호(문자열로 반환되는 것을 주의)
     */
    public String getID()
    {
        return bookID;
    }

    /**
     * 출력예시에 알맞게 출력할 수 맀도록 toString 메소드를 오버라이딩함
     *
     * @return    출력요구에 알맞은 반환 값 : (둥록번호) 제목, 저자, 출판사, 년도출판
     */
    public String toString()
    {
        return "("+bookID+") "+ title+", "+author+", "+publisher+
        ", "+year;
    }
}