package shiffer.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import shiffer.controller.protocol.BadgeRequest;
import shiffer.controller.protocol.BadgeResponse;
import shiffer.domain.Badge;

@Mapper
public interface BadgeMapper {
    BadgeMapper INSTANCE = Mappers.getMapper(BadgeMapper.class);

    @Mapping(target = "id", ignore = true)
    Badge map(BadgeRequest badgeRequest);

    BadgeResponse mapToResponse(Badge badge);
}
