package com.kma.project.chatapp.mapper;

import com.kma.project.chatapp.dto.request.cms.StudentRequestDto;
import com.kma.project.chatapp.dto.response.cms.StudentResponseDto;
import com.kma.project.chatapp.entity.StudentEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-05-22T03:26:14+0700",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 18.0.2 (Oracle Corporation)"
)
@Component
public class StudentMapperImpl implements StudentMapper {

    @Override
    public StudentEntity convertToEntity(StudentRequestDto dto) {
        if ( dto == null ) {
            return null;
        }

        StudentEntity studentEntity = new StudentEntity();

        studentEntity.setName( dto.getName() );
        studentEntity.setCode( dto.getCode() );
        studentEntity.setDateOfBirth( dto.getDateOfBirth() );
        studentEntity.setImageUrl( dto.getImageUrl() );

        return studentEntity;
    }

    @Override
    public StudentResponseDto convertToDto(StudentEntity entity) {
        if ( entity == null ) {
            return null;
        }

        StudentResponseDto studentResponseDto = new StudentResponseDto();

        studentResponseDto.setId( entity.getId() );
        studentResponseDto.setName( entity.getName() );
        studentResponseDto.setCode( entity.getCode() );
        studentResponseDto.setDateOfBirth( entity.getDateOfBirth() );
        studentResponseDto.setImageUrl( entity.getImageUrl() );

        return studentResponseDto;
    }

    @Override
    public StudentEntity update(StudentRequestDto dto, StudentEntity entity) {
        if ( dto == null ) {
            return entity;
        }

        if ( dto.getName() != null ) {
            entity.setName( dto.getName() );
        }
        if ( dto.getCode() != null ) {
            entity.setCode( dto.getCode() );
        }
        if ( dto.getDateOfBirth() != null ) {
            entity.setDateOfBirth( dto.getDateOfBirth() );
        }
        if ( dto.getImageUrl() != null ) {
            entity.setImageUrl( dto.getImageUrl() );
        }

        return entity;
    }
}
