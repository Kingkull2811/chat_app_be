package com.kma.project.chatapp.mapper;

import com.kma.project.chatapp.dto.request.cms.LearningResultDetailRequestDto;
import com.kma.project.chatapp.dto.response.cms.LearningResultDetailResponseDto;
import com.kma.project.chatapp.entity.LearningResultDetailEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-05-22T03:26:14+0700",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 18.0.2 (Oracle Corporation)"
)
@Component
public class LearningResultDetailMapperImpl implements LearningResultDetailMapper {

    @Override
    public LearningResultDetailResponseDto convertToDto(LearningResultDetailEntity entity) {
        if ( entity == null ) {
            return null;
        }

        LearningResultDetailResponseDto learningResultDetailResponseDto = new LearningResultDetailResponseDto();

        learningResultDetailResponseDto.setId( entity.getId() );
        learningResultDetailResponseDto.setSubjectId( entity.getSubjectId() );
        learningResultDetailResponseDto.setLearningResultId( entity.getLearningResultId() );
        learningResultDetailResponseDto.setOralTestScore( entity.getOralTestScore() );
        learningResultDetailResponseDto.setM15TestScore( entity.getM15TestScore() );
        learningResultDetailResponseDto.setM45TestScore( entity.getM45TestScore() );
        learningResultDetailResponseDto.setSemesterTestScore( entity.getSemesterTestScore() );
        learningResultDetailResponseDto.setSemesterSummaryScore( entity.getSemesterSummaryScore() );

        return learningResultDetailResponseDto;
    }

    @Override
    public LearningResultDetailEntity update(LearningResultDetailRequestDto dto, LearningResultDetailEntity entity) {
        if ( dto == null ) {
            return entity;
        }

        if ( dto.getOralTestScore() != null ) {
            entity.setOralTestScore( dto.getOralTestScore() );
        }
        if ( dto.getM15TestScore() != null ) {
            entity.setM15TestScore( dto.getM15TestScore() );
        }
        if ( dto.getM45TestScore() != null ) {
            entity.setM45TestScore( dto.getM45TestScore() );
        }
        if ( dto.getSemesterTestScore() != null ) {
            entity.setSemesterTestScore( dto.getSemesterTestScore() );
        }

        return entity;
    }
}
