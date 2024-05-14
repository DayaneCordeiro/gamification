package com.example.gamification.entrypoint.mapper;

import com.example.gamification.core.domain.UserDomain;
import com.example.gamification.entrypoint.dto.UserDTO;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UsersMapper {

    UserDomain toDomain(UserDTO userDTO);

    UserDTO toDTO(UserDomain userDomain);
}
