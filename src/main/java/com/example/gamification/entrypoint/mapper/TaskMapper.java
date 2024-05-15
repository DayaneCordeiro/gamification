package com.example.gamification.entrypoint.mapper;

import com.example.gamification.entrypoint.dto.TaskInputDto;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface TaskMapper {

    TaskDomain toDomain(TaskInputDto inputDto);
}
