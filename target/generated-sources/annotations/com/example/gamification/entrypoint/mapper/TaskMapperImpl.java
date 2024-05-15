package com.example.gamification.entrypoint.mapper;

import com.example.gamification.core.domain.TaskDomain;
import com.example.gamification.entrypoint.dto.TaskInputDto;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-05-15T14:13:04-0300",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 21.0.2 (Oracle Corporation)"
)
@Component
public class TaskMapperImpl implements TaskMapper {

    @Override
    public TaskDomain toDomain(TaskInputDto inputDto) {
        if ( inputDto == null ) {
            return null;
        }

        TaskDomain.TaskDomainBuilder taskDomain = TaskDomain.builder();

        taskDomain.name( inputDto.name() );
        taskDomain.initialDate( inputDto.initialDate() );
        taskDomain.finalDate( inputDto.finalDate() );
        taskDomain.recurrence( inputDto.recurrence() );
        taskDomain.weight( inputDto.weight() );
        taskDomain.userId( inputDto.userId() );
        taskDomain.status( inputDto.status() );

        return taskDomain.build();
    }
}
