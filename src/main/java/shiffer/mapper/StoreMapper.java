package shiffer.mapper;

import shiffer.controller.protocol.StoreRequest;
import shiffer.controller.protocol.StoreResponse;
import shiffer.domain.Store;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface StoreMapper {
    StoreMapper INSTANCE = Mappers.getMapper(StoreMapper.class);

    @Mapping(target = "id", ignore = true)
    Store map(StoreRequest storeRequest);

    StoreResponse mapToResponse(Store store);
}
