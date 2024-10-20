package song.spring1.domain.loa.repository;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.*;

@Slf4j
@SpringBootTest
class AdventurerJpaRepositoryTest {

    @Autowired
    AdventurerJpaRepository adventurerRepository;

    @ParameterizedTest
    @ValueSource(strings = {"testName"})
    void successFindByName(String name) {
        assertThat(adventurerRepository.findByName(name).isEmpty())
                .isTrue();
    }

}