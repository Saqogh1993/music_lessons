package am.politechnic.musiclessons.web;

import am.politechnic.musiclessons.repository.dto.MaterialsDto;
import am.politechnic.musiclessons.repository.entity.Materials;
import am.politechnic.musiclessons.repository.rep.MaterialsRepo;
import am.politechnic.musiclessons.service.MaterialsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class MaterialsRestController {

    @Autowired
    private MaterialsService materialsService;

    @GetMapping("/materials")
    public ModelAndView findAllMaterials(){
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("materials", MaterialsDto.mapEntitiesToDto(materialsService.findAllMaterials()));
        return modelAndView;
    }
}
