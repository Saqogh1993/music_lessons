package am.politechnic.musiclessons.service;

import am.politechnic.musiclessons.repository.entity.Subject;
import am.politechnic.musiclessons.repository.rep.SubjectRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class SubjectService {

    @Autowired
    private SubjectRepo subjectRepo;

    public List<Subject> findAllSubjects() {
        return subjectRepo.findAll();
    }
}
