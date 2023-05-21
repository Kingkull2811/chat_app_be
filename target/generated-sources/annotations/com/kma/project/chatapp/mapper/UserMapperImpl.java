package com.kma.project.chatapp.mapper;

import com.kma.project.chatapp.dto.request.auth.UserUpdateDto;
import com.kma.project.chatapp.dto.response.auth.RoleOutputDto;
import com.kma.project.chatapp.dto.response.auth.UserOutputDto;
import com.kma.project.chatapp.entity.RoleEntity;
import com.kma.project.chatapp.entity.UserEntity;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-05-22T03:26:14+0700",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 18.0.2 (Oracle Corporation)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public UserOutputDto convertToDto(UserEntity userEntity) {
        if ( userEntity == null ) {
            return null;
        }

        UserOutputDto userOutputDto = new UserOutputDto();

        userOutputDto.setId( userEntity.getId() );
        userOutputDto.setUsername( userEntity.getUsername() );
        userOutputDto.setEmail( userEntity.getEmail() );
        userOutputDto.setRoles( roleEntitySetToRoleOutputDtoSet( userEntity.getRoles() ) );
        userOutputDto.setFullName( userEntity.getFullName() );
        userOutputDto.setPhone( userEntity.getPhone() );
        userOutputDto.setIsFillProfileKey( userEntity.getIsFillProfileKey() );
        userOutputDto.setFileUrl( userEntity.getFileUrl() );

        return userOutputDto;
    }

    @Override
    public UserEntity update(UserUpdateDto dto, UserEntity entity) {
        if ( dto == null ) {
            return entity;
        }

        if ( dto.getUsername() != null ) {
            entity.setUsername( dto.getUsername() );
        }
        if ( dto.getEmail() != null ) {
            entity.setEmail( dto.getEmail() );
        }
        if ( dto.getPassword() != null ) {
            entity.setPassword( dto.getPassword() );
        }
        if ( dto.getFullName() != null ) {
            entity.setFullName( dto.getFullName() );
        }
        if ( dto.getPhone() != null ) {
            entity.setPhone( dto.getPhone() );
        }
        if ( dto.getIsFillProfileKey() != null ) {
            entity.setIsFillProfileKey( dto.getIsFillProfileKey() );
        }
        if ( dto.getFileUrl() != null ) {
            entity.setFileUrl( dto.getFileUrl() );
        }
        if ( dto.getStudentIds() != null ) {
            entity.setStudentIds( longListToStringArray( dto.getStudentIds() ) );
        }

        return entity;
    }

    protected RoleOutputDto roleEntityToRoleOutputDto(RoleEntity roleEntity) {
        if ( roleEntity == null ) {
            return null;
        }

        RoleOutputDto roleOutputDto = new RoleOutputDto();

        roleOutputDto.setId( roleEntity.getId() );
        if ( roleEntity.getName() != null ) {
            roleOutputDto.setName( roleEntity.getName().name() );
        }

        return roleOutputDto;
    }

    protected Set<RoleOutputDto> roleEntitySetToRoleOutputDtoSet(Set<RoleEntity> set) {
        if ( set == null ) {
            return null;
        }

        Set<RoleOutputDto> set1 = new LinkedHashSet<RoleOutputDto>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( RoleEntity roleEntity : set ) {
            set1.add( roleEntityToRoleOutputDto( roleEntity ) );
        }

        return set1;
    }

    protected String[] longListToStringArray(List<Long> list) {
        if ( list == null ) {
            return null;
        }

        String[] stringTmp = new String[list.size()];
        int i = 0;
        for ( Long long1 : list ) {
            stringTmp[i] = String.valueOf( long1 );
            i++;
        }

        return stringTmp;
    }
}
