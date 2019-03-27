package am.politechnic.musiclessons.web;

import am.politechnic.musiclessons.repository.dto.TypeDto;
import am.politechnic.musiclessons.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TypeRestController {

    @Autowired
    private TypeService typeService;

    @GetMapping("/types")
    public List<TypeDto> findAllTypes() {
        return TypeDto.mapEntitiesToDto(typeService.findAllTypes());
    }
}
