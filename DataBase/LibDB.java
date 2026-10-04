package DataBase;
import java.util.*;

/**
 * LIbDB 클래스의 설명을 작성하세요.
 *
 * @author (작성자 이름)
 * @version (버전 번호 또는 작성한 날짜)
 */
public class LibDB<T>
{
    private ArrayList<T> db;

    /**
     * LIbDB 클래스의 객체 생성자
     */
    public LibDB()
    {
        this.db = new ArrayList<>();
    }

    /**
     * 예제 메소드 - 이 주석을 사용자에 맞게 바꾸십시오
     *
     * @param  y  메소드의 샘플 파라미터
     */
    public void addElement(T element)
    {

    }

    /**
     * 메소드 예제 - 사용자에 맞게 주석을 바꾸십시오.
     *
     * @param  검색하려는 객체의 식별번호(예: 학번 --> 이용자, 책의 등록번호 --> 책)
     * @return 식별번호를 가진 객체 
     *         없을 경우에는 없음을 표시
     */
    public T findElement(String ID)
    {
        return null;
    }
    /**
     * 메소드 예제 - 사용자에 맞게 주석을 바꾸십시오.
     *
     */
    public void printAllElement()
    {

    }
}