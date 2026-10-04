package myClass;

/**
 * User 객체를 생성하고 학번과 객체에 대한 정보를 간단히 반환하는 클래스
 *
 * @author (2025320018진시원)
 * @version (2026.10.04)
 */
public class User extends DB_Element
{
    private String name;
    private Integer stID;

    /**
     * User 클래스의 객체 생성자
     */
    public User(int stID, String name)
    {
        this.stID = Integer.valueOf(stID);
        this.name = name;
    }

    /**
     * 학번을 문자열로 반환해주는 메소드
     *
     * @return    학번(문자열) 
     */
    public String getID()
    {
        return String.valueOf(this.stID);
    }

    /**
     * 출력예시에 알맞게 출력할 수 맀도록 toString 메소드를 오버라이딩함
     *
     * @return    출력요구에 알맞은 반환 값 : [학번] 이름
     */
    public String toString()
    {
        return "["+stID+"] "+name;
    }
}