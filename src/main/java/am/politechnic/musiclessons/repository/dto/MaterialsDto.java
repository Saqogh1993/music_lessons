package am.politechnic.musiclessons.repository.dto;

import am.politechnic.musiclessons.repository.entity.Materials;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MaterialsDto implements Serializable {

    private int id;
    private SubjectDto subjectDTO;
    private String title;
    private TypeDto typeDTO;
    private String text;

    public MaterialsDto() {
    }

    public MaterialsDto(int id, SubjectDto subjectDTO, String title, TypeDto typeDTO, String tex) {
        this.id = id;
        this.subjectDTO = subjectDTO;
        this.title = title;
        this.typeDTO = typeDTO;
        this.text = tex;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public SubjectDto getSubjectDTO() {
        return subjectDTO;
    }

    public void setSubjectDTO(SubjectDto subjectDTO) {
        this.subjectDTO = subjectDTO;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public TypeDto getTypeDTO() {
        return typeDTO;
    }

    public void setTypeDTO(TypeDto typeDTO) {
        this.typeDTO = typeDTO;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public static List<MaterialsDto> mapEntitiesToDto(List<Materials> entities) {
        List<MaterialsDto> dtos = new ArrayList<>();
        if(entities == null)
            return dtos;

        for(Materials materials: entities) {
            dtos.add(mapEntityToDto(materials));
        }
        return dtos;
    }
    public static MaterialsDto mapEntityToDto(Materials materials) {
        if (materials == null)
            return null;

        MaterialsDto materialsDto = new MaterialsDto();

        materialsDto.setId(materials.getId());
        materialsDto.setTitle(materials.getTitle());
        materialsDto.setSubjectDTO(SubjectDto.mapEntityToDto(materials.getSubject()));
        materialsDto.setText(materials.getText());
        materialsDto.setTypeDTO(TypeDto.mapEntityToDto(materials.getType()));

        return materialsDto;
    }

    public static Materials mapDtoToEntity(MaterialsDto materialsDto) {
        if (materialsDto == null)
            return null;

        Materials materials = new Materials();
        materials.setId(materialsDto.getId());
        materials.setTitle(materialsDto.getTitle());
        materials.setSubject(SubjectDto.mapDtoToEntity(materialsDto.getSubjectDTO()));
        materials.setText(materialsDto.getText());
        materials.setType(TypeDto.mapDtoToEntity(materialsDto.getTypeDTO()));

        return materials;
    }

}
