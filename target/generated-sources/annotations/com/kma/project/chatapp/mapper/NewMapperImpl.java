package com.kma.project.chatapp.mapper;

import com.kma.project.chatapp.dto.request.cms.NewRequestDto;
import com.kma.project.chatapp.dto.response.cms.NewResponseDto;
import com.kma.project.chatapp.entity.NewEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-05-22T03:26:13+0700",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 18.0.2 (Oracle Corporation)"
)
@Component
public class NewMapperImpl implements NewMapper {

    @Override
    public NewEntity convertToEntity(NewRequestDto dto) {
        if ( dto == null ) {
            return null;
        }

        NewEntity newEntity = new NewEntity();

        newEntity.setTitle( dto.getTitle() );
        newEntity.setContent( dto.getContent() );
        newEntity.setMediaUrl( dto.getMediaUrl() );
        newEntity.setTypeMedia( dto.getTypeMedia() );

        return newEntity;
    }

    @Override
    public NewResponseDto convertToDto(NewEntity entity) {
        if ( entity == null ) {
            return null;
        }

        NewResponseDto newResponseDto = new NewResponseDto();

        newResponseDto.setId( entity.getId() );
        newResponseDto.setTitle( entity.getTitle() );
        newResponseDto.setContent( entity.getContent() );
        newResponseDto.setMediaUrl( entity.getMediaUrl() );
        newResponseDto.setTypeMedia( entity.getTypeMedia() );
        newResponseDto.setCreatedAt( entity.getCreatedAt() );

        return newResponseDto;
    }

    @Override
    public NewEntity update(NewRequestDto dto, NewEntity entity) {
        if ( dto == null ) {
            return entity;
        }

        if ( dto.getTitle() != null ) {
            entity.setTitle( dto.getTitle() );
        }
        if ( dto.getContent() != null ) {
            entity.setContent( dto.getContent() );
        }
        if ( dto.getMediaUrl() != null ) {
            entity.setMediaUrl( dto.getMediaUrl() );
        }
        if ( dto.getTypeMedia() != null ) {
            entity.setTypeMedia( dto.getTypeMedia() );
        }

        return entity;
    }
}
