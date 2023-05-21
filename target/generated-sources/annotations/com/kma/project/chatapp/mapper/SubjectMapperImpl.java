package com.kma.project.chatapp.mapper;

import com.kma.project.chatapp.dto.request.cms.SubjectRequestDto;
import com.kma.project.chatapp.dto.response.cms.SubjectResponseDto;
import com.kma.project.chatapp.entity.SubjectEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-05-22T03:26:14+0700",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 18.0.2 (Oracle Corporation)"
)
@Component
public class SubjectMapperImpl implements SubjectMapper {

    @Override
    public SubjectEntity convertToEntity(SubjectRequestDto dto) {
        if ( dto == null ) {
            return null;
        }

        SubjectEntity subjectEntity = new SubjectEntity();

        subjectEntity.setName( dto.getName() );

        return subjectEntity;
    }

    @Override
    public SubjectResponseDto convertToDto(SubjectEntity entity) {
        if ( entity == null ) {
            return null;
        }

        SubjectResponseDto subjectResponseDto = new SubjectResponseDto();

        subjectResponseDto.setId( entity.getId() );
        subjectResponseDto.setCode( entity.getCode() );
        subjectResponseDto.setName( entity.getName() );

        return subjectResponseDto;
    }

    @Override
    public SubjectEntity update(SubjectRequestDto dto, SubjectEntity entity) {
        if ( dto == null ) {
            return entity;
        }

        if ( dto.getName() != null ) {
            entity.setName( dto.getName() );
        }

        return entity;
    }
}
