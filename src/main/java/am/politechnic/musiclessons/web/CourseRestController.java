package am.politechnic.musiclessons.web;

import am.politechnic.musiclessons.repository.dto.CourseDto;
import am.politechnic.musiclessons.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class CourseRestController {

    @Autowired
    private CourseService courseService;

    @GetMapping("/courses")
    public List<CourseDto> findAllCourses() {
        return CourseDto.mapEntitiesToDto(courseService.findAllCourses());
    }
}
