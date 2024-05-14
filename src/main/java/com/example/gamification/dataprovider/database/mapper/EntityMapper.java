package com.example.gamification.dataprovider.database.mapper;

import com.example.gamification.core.domain.UserDomain;
import com.example.gamification.dataprovider.database.entity.UserEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface EntityMapper {

    UserEntity toEntity(UserDomain userDomain);
}
