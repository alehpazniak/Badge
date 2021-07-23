package shiffer.service;

import lombok.RequiredArgsConstructor;
import shiffer.controller.protocol.StoreRequest;
import shiffer.controller.protocol.StoreResponse;
import shiffer.domain.Store;
import shiffer.domain.StoreRepository;
import shiffer.mapper.StoreMapper;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class StoreService {
    private final StoreRepository storeRepository;

    public StoreResponse saveStore(StoreRequest storeRequest) {
        Store store = storeRepository.save(StoreMapper.INSTANCE.map(storeRequest));
        return StoreMapper.INSTANCE.mapToResponse(store);
    }
}
