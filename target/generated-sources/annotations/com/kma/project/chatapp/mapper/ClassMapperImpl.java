package com.kma.project.chatapp.mapper;

import com.kma.project.chatapp.dto.request.cms.ClassRequestDto;
import com.kma.project.chatapp.dto.response.cms.ClassResponseDto;
import com.kma.project.chatapp.entity.ClassEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-05-22T03:26:14+0700",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 18.0.2 (Oracle Corporation)"
)
@Component
public class ClassMapperImpl implements ClassMapper {

    @Override
    public ClassEntity convertToEntity(ClassRequestDto dto) {
        if ( dto == null ) {
            return null;
        }

        ClassEntity classEntity = new ClassEntity();

        classEntity.setName( dto.getName() );
        classEntity.setYear( dto.getYear() );

        return classEntity;
    }

    @Override
    public ClassResponseDto convertToDto(ClassEntity entity) {
        if ( entity == null ) {
            return null;
        }

        ClassResponseDto classResponseDto = new ClassResponseDto();

        classResponseDto.setId( entity.getId() );
        classResponseDto.setCode( entity.getCode() );
        classResponseDto.setName( entity.getName() );
        classResponseDto.setYear( entity.getYear() );

        return classResponseDto;
    }

    @Override
    public ClassEntity update(ClassRequestDto dto, ClassEntity entity) {
        if ( dto == null ) {
            return entity;
        }

        if ( dto.getName() != null ) {
            entity.setName( dto.getName() );
        }
        if ( dto.getYear() != null ) {
            entity.setYear( dto.getYear() );
        }

        return entity;
    }
}
