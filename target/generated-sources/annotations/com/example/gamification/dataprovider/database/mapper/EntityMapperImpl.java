package com.example.gamification.dataprovider.database.mapper;

import com.example.gamification.core.domain.RewardDomain;
import com.example.gamification.core.domain.TaskDomain;
import com.example.gamification.core.domain.UserDomain;
import com.example.gamification.dataprovider.database.entity.RewardEntity;
import com.example.gamification.dataprovider.database.entity.TaskEntity;
import com.example.gamification.dataprovider.database.entity.UserEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-05-15T14:13:04-0300",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 21.0.2 (Oracle Corporation)"
)
@Component
public class EntityMapperImpl implements EntityMapper {

    @Override
    public UserEntity toEntity(UserDomain userDomain) {
        if ( userDomain == null ) {
            return null;
        }

        UserEntity.UserEntityBuilder userEntity = UserEntity.builder();

        userEntity.id( userDomain.id() );
        userEntity.name( userDomain.name() );
        userEntity.points( userDomain.points() );

        return userEntity.build();
    }

    @Override
    public TaskEntity toEntity(TaskDomain taskDomain) {
        if ( taskDomain == null ) {
            return null;
        }

        TaskEntity.TaskEntityBuilder taskEntity = TaskEntity.builder();

        taskEntity.id( taskDomain.id() );
        taskEntity.name( taskDomain.name() );
        taskEntity.initialDate( taskDomain.initialDate() );
        taskEntity.finalDate( taskDomain.finalDate() );
        taskEntity.recurrence( taskDomain.recurrence() );
        taskEntity.weight( taskDomain.weight() );
        taskEntity.userId( taskDomain.userId() );
        taskEntity.status( taskDomain.status() );

        return taskEntity.build();
    }

    @Override
    public RewardEntity toEntity(RewardDomain rewardDomain) {
        if ( rewardDomain == null ) {
            return null;
        }

        RewardEntity.RewardEntityBuilder rewardEntity = RewardEntity.builder();

        rewardEntity.id( rewardDomain.id() );
        rewardEntity.name( rewardDomain.name() );
        rewardEntity.value( rewardDomain.value() );

        return rewardEntity.build();
    }
}
