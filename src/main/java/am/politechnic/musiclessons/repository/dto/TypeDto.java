package am.politechnic.musiclessons.repository.dto;

import am.politechnic.musiclessons.repository.entity.Subject;
import am.politechnic.musiclessons.repository.entity.Type;
import sun.reflect.annotation.TypeNotPresentExceptionProxy;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class TypeDto implements Serializable {

    private int id;
    private String title;

    public TypeDto() {
    }

    public TypeDto(int id, String title) {
        this.id = id;
        this.title = title;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public static TypeDto mapEntityToDto(Type type) {
        TypeDto typeDto = new TypeDto();
        typeDto.setId(type.getId());
        typeDto.setTitle(type.getTitle());
        return typeDto;
    }

    public static List<TypeDto> mapEntitiesToDto(List<Type> types) {
        List<TypeDto> dtos = new ArrayList<>();
        if (types == null) {
            return null;
        }

        for (Type type : types) {
            dtos.add(mapEntityToDto(type));
        }

        return dtos;
    }

    public static Type mapDtoToEntity(TypeDto typeDTO) {

        Type type = new Type();

        type.setId(typeDTO.getId());
        type.setTitle(typeDTO.getTitle());

        return type;
    }
}
