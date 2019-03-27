package am.politechnic.musiclessons.service;

import am.politechnic.musiclessons.repository.entity.Materials;
import am.politechnic.musiclessons.repository.rep.MaterialsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class MaterialsService {

    @Autowired
    MaterialsRepo materialsRepo;

    public List<Materials> findAllMaterials() {
        return materialsRepo.findAll();
    }


}
