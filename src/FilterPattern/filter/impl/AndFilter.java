package FilterPattern.filter.impl;

import FilterPattern.Person;
import FilterPattern.filter.Filter;

import java.util.List;

/**
 * @Author Jalen
 * @Date 2021/2/7 23:11
 * @Description TODO
 **/
public class AndFilter implements Filter{

    private Filter filter;
    private Filter otherFilter;

    public AndFilter(Filter filter, Filter otherFilter) {
        this.filter = filter;
        this.otherFilter = otherFilter;
    }

    @Override
    public List<Person> meetFilter(List<Person> persons) {
        List<Person> firstFilterPersons = filter.meetFilter(persons);
        return otherFilter.meetFilter(firstFilterPersons);
    }
}
