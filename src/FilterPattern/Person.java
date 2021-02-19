package FilterPattern;

/**
 * @Author Jalen
 * @Date 2021/2/7 22:58
 * @Description
 **/
public class Person {

    private String name;
    private String gender;
    private String status;

    public Person(String name, String gender, String status) {
        this.name = name;
        this.gender = gender;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getStatus() {
        return status;
    }
}
