package FilterPattern.filter.impl;

import FilterPattern.Person;
import FilterPattern.filter.Filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Jalen
 * @Date 2021/2/7 23:01
 * @Description TODO
 **/
public class FilterFemale implements Filter {
    @Override
    public List<Person> meetFilter(List<Person> persons) {
        List<Person> femalePersons = new ArrayList<>();
        for (Person person : persons){
            if (person.getGender().equals("female")){
                femalePersons.add(person);
            }
        }
        return femalePersons;
    }
}
