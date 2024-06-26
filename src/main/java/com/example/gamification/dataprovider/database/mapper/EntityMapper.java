package com.example.gamification.dataprovider.database.mapper;

import com.example.gamification.core.domain.RewardDomain;
import com.example.gamification.core.domain.TaskDomain;
import com.example.gamification.core.domain.UserDomain;
import com.example.gamification.dataprovider.database.entity.RewardEntity;
import com.example.gamification.dataprovider.database.entity.TaskEntity;
import com.example.gamification.dataprovider.database.entity.UserEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface EntityMapper {

    UserEntity toEntity(UserDomain userDomain);

    TaskEntity toEntity(TaskDomain taskDomain);

    RewardEntity toEntity(RewardDomain rewardDomain);

    UserDomain toDomain(UserEntity userEntity);
}
