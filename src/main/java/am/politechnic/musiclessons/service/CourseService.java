package am.politechnic.musiclessons.service;

import am.politechnic.musiclessons.repository.entity.Course;
import am.politechnic.musiclessons.repository.rep.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CourseService {

    @Autowired
    private CourseRepo courseRepo;

    public List<Course> findAllCourses() {
        return courseRepo.findAll();
    }
}
