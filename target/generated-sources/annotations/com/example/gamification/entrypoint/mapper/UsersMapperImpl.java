package com.example.gamification.entrypoint.mapper;

import com.example.gamification.core.domain.UserDomain;
import com.example.gamification.entrypoint.dto.UserDTO;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-05-14T18:54:25-0300",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 21.0.2 (Oracle Corporation)"
)
@Component
public class UsersMapperImpl implements UsersMapper {

    @Override
    public UserDomain toDomain(UserDTO userDTO) {
        if ( userDTO == null ) {
            return null;
        }

        UserDomain.UserDomainBuilder userDomain = UserDomain.builder();

        userDomain.name( userDTO.name() );
        userDomain.points( userDTO.points() );

        return userDomain.build();
    }

    @Override
    public UserDTO toDTO(UserDomain userDomain) {
        if ( userDomain == null ) {
            return null;
        }

        UserDTO.UserDTOBuilder userDTO = UserDTO.builder();

        userDTO.name( userDomain.name() );
        if ( userDomain.points() != null ) {
            userDTO.points( userDomain.points() );
        }

        return userDTO.build();
    }
}
