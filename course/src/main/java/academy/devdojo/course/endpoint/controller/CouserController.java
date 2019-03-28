package academy.devdojo.course.endpoint.controller;

import academy.devdojo.course.endpoint.model.Course;
import academy.devdojo.course.endpoint.service.CourseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/admin/course")
@Slf4j
public class CouserController {

    private final CourseService corseService;

    @Autowired
    public CouserController(CourseService corseService) {
        this.corseService = corseService;
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Iterable<Course>> list(Pageable pageable){
        return new ResponseEntity<>(corseService.list(pageable), HttpStatus.OK);

    }
}
