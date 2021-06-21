package algorithms;

import java.util.ArrayList;
import java.util.List;

public class Institute
{
    private List<Course> courseList = new ArrayList<Course>();

    public Institute() {
        this.courseList.add(new Course("A",10));
        this.courseList.add(new Course("B",20));
        this.courseList.add(new Course("C",30));
    }

    public List<Course> applyForCourseWithMinFee(){
        return new ArrayList<Course>();
    }

}
