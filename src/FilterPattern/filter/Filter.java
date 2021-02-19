package FilterPattern.filter;

import FilterPattern.Person;

import java.util.List;

/**
 * @Author Jalen
 * @Date 2021/2/7 22:59
 * @Description
 **/
public interface Filter {

    List<Person> meetFilter(List<Person> persons);
}
