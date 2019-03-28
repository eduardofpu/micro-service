package academy.devdojo.course.endpoint.repository;

import academy.devdojo.course.endpoint.model.Course;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CourseRepository extends PagingAndSortingRepository<Course, Long> {
}
