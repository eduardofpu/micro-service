package academy.devdojo.course.endpoint.service;

import academy.devdojo.core.model.Course;
import academy.devdojo.core.repository.CourseRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
* @author Eduardo
*/
@Service
@Slf4j
public class CourseService {
    private final CourseRepository courseRepository;

    @Autowired
    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public Iterable<Course> list(Pageable pageable){
        return courseRepository.findAll(pageable);
    }
}
