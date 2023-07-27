import Business.CourseManager;
import Core.Logging.DatabaseLogger;
import Core.Logging.Logger;
import DataAccess.CourseDAO.HibernateCourseDao;
import DataAccess.CourseDAO.JdbcCourseDao;
import Entities.Course;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

        Logger[] loggers= {new DatabaseLogger()};

        Course course1=new Course(1," Python ",200);
        Course course2=new Course(1," Python ",200);

        List<Course> courses = new ArrayList<>();
        CourseManager courseManager=new CourseManager(new HibernateCourseDao(), courses, loggers);
        courseManager.add(course1);
        courseManager.add(course2);
    }
}