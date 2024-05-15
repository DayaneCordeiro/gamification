package com.example.gamification.entrypoint.mapper;

import com.example.gamification.entrypoint.dto.RewardInputDto;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface RewardMapper {

    RewardDomain toDomain(RewardInputDto inputDto);
}
