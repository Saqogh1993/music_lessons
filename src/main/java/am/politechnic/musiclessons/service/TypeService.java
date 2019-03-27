package am.politechnic.musiclessons.service;

import am.politechnic.musiclessons.repository.entity.Type;
import am.politechnic.musiclessons.repository.rep.TypeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class TypeService {

    @Autowired
    private TypeRepo typeRepo;

    public List<Type> findAllTypes() {
        return typeRepo.findAll();
    }
}
