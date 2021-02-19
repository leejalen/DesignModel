package FilterPattern.filter.impl;

import FilterPattern.Person;
import FilterPattern.filter.Filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Jalen
 * @Date 2021/2/7 23:09
 * @Description TODO
 **/
public class FilterSingle implements Filter {
    @Override
    public List<Person> meetFilter(List<Person> persons) {
        List<Person> singlePersons = new ArrayList<>();
        for (Person person : persons){
            if (person.getGender().equals("single")){
                singlePersons.add(person);
            }
        }
        return singlePersons;
    }
}
