package DataBase;
import java.util.*;
import myClass.DB_Element;
/**
 * LIbDB 책DB와 이용자DB에 공통으로 사용되는 Generic 클래스
 *
 * @author (2025320018 진시원)
 * @version (2026.10.05)
 */
public class LibDB<T extends DB_Element>
{
    private ArrayList<T> db;

    /**
     * LIbDB 클래스의 객체 생성자
     */
    public LibDB()
    {
        this.db = new ArrayList<T>();
    }

    /**
     *  db에 객체를 추가하는 메소드
     *
     * @param  db에 추가할 객체
     */
    public void addElement(T element)
    {
        this.db.add(element);
    }

    /**
     * ID를 입력 받아서 입력받은 ID를 가진 객체가 있는지 확인하는 메소드 
     *
     * @param  검색하려는 객체의 식별번호(예: 학번 --> 이용자, 책의 등록번호 --> 책)
     * @return 식별번호를 가진 객체 
     */
    public T findElement(String ID)
    {
        Iterator<T> it = db.iterator();

        while(it.hasNext()){
            T element = it.next();  

            if(element.getID().equals(ID)){
                return element;
            }
        }

        return null;
    }

    /**
     * db에 저장된 모든 객체를 출력하는 메소드
     *
     */
    public void printAllElement()
    {
        Iterator<T> it = db.iterator();

        while(it.hasNext()){
            T element = it.next();
            System.out.println(element);
        }
    }
}