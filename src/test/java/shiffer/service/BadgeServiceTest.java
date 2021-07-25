package shiffer.service;

import org.junit.jupiter.api.Test;
import shiffer.controller.protocol.BadgeRequest;
import shiffer.domain.Badge;
import shiffer.mapper.BadgeMapper;

import static org.junit.jupiter.api.Assertions.assertEquals;


class BadgeServiceTest {
    private BadgeService badgeService;

    @Test
    void shouldSaveBadge() {
        //given
        BadgeRequest badgeRequest = createBadgeRequest(Fields.NAME, Fields.CATEGORY, Fields.PHOTO);
        //when]
        Badge badge = BadgeMapper.INSTANCE.map(badgeRequest);
        //then
        assertEquals(Fields.NAME, badge.getName());
        assertEquals(Fields.CATEGORY, badge.getCategory());
        assertEquals(Fields.PHOTO, badge.getPhoto());

    }

    private BadgeRequest createBadgeRequest(String name, String category, String photo) {
        return BadgeRequest.builder()
                .name(name)
                .category(category)
                .photo(photo)
                .build();
    }

    static class Fields {
        private static final String NAME = "name";
        private static final String CATEGORY = "category";
        private static final String PHOTO = "photo";
    }
}