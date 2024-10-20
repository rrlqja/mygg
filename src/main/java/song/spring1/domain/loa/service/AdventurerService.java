package song.spring1.domain.loa.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import song.spring1.domain.loa.entity.Adventurer;
import song.spring1.domain.loa.repository.AdventurerJpaRepository;

@Slf4j
@Service
@RequiredArgsConstructor
public class AdventurerService {
    private final AdventurerJpaRepository adventurerRepository;

    public Adventurer getAdventurer(String name) {
        return adventurerRepository.findByName(name)
                .orElseThrow(() -> new IllegalArgumentException("데이터 없음"));
    }
}
