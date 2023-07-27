package Business;

import Core.Logging.Logger;
import DataAccess.CourseDAO.CourseDao;
import Entities.Course;

import java.util.ArrayList;
import java.util.List;

public class CourseManager {

    private CourseDao courseDao;
    public List<Course> courseList = new ArrayList<>();
    private Logger[] loggers;

    public CourseManager() {
    }

    public CourseManager(CourseDao courseDao, List<Course> courseList, Logger[] loggers) {
        this.courseDao = courseDao;
        this.courseList = courseList;
        this.loggers = loggers;
    }

    public void add(Course course) throws Exception {
        if (course.getUnitPrice() < 0) {
            throw new Exception("Kurs fiyatı 0 'dan küçük olamaz !!!!!");
        }
        for(Course c:courseList) {
            if(c.getCourseName()==course.getCourseName()) {
                throw new Exception("Bu isim mevcuttur");
            }
        }
        courseList.add(course);
        this.courseDao.add(course);

        for(Logger logger:loggers) {
            logger.log(course.getCourseName());
        }



    }
}
