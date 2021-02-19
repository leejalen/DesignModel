package FilterPattern.filter.impl;

import FilterPattern.Person;
import FilterPattern.filter.Filter;

import java.util.List;

/**
 * @Author Jalen
 * @Date 2021/2/7 23:11
 * @Description TODO
 **/
public class OrFilter implements Filter {

    private Filter filter;
    private Filter otherFilter;

    public OrFilter(Filter filter, Filter otherFilter) {
        this.filter = filter;
        this.otherFilter = otherFilter;
    }

    @Override
    public List<Person> meetFilter(List<Person> persons) {
        List<Person> filterPersons = filter.meetFilter(persons);
        List<Person> otherFilterPersons = otherFilter.meetFilter(persons);
        for (Person person : otherFilterPersons){
            if (!filterPersons.contains(person)){
                filterPersons.add(person);
            }
        }
        return filterPersons;
    }
}
