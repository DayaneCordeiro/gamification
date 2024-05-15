package com.example.gamification.entrypoint.mapper;

import com.example.gamification.core.domain.RewardDomain;
import com.example.gamification.entrypoint.dto.RewardInputDto;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-05-15T14:13:04-0300",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 21.0.2 (Oracle Corporation)"
)
@Component
public class RewardMapperImpl implements RewardMapper {

    @Override
    public RewardDomain toDomain(RewardInputDto inputDto) {
        if ( inputDto == null ) {
            return null;
        }

        RewardDomain.RewardDomainBuilder rewardDomain = RewardDomain.builder();

        rewardDomain.name( inputDto.name() );
        rewardDomain.value( inputDto.value() );

        return rewardDomain.build();
    }
}
