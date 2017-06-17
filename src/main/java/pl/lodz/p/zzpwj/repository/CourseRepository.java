package pl.lodz.p.zzpwj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.lodz.p.zzpwj.bus.Course;

/**
 * Created by Marcin Wróbel on 17.06.17.
 */
public interface CourseRepository extends JpaRepository<Course, Long> {

    Course findCourseByName(String name);
}
