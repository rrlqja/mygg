package song.spring1.domain.loa.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import song.spring1.domain.loa.entity.Adventurer;
import song.spring1.domain.loa.service.AdventurerService;

@Slf4j
@Controller
@RequestMapping("/loa")
@RequiredArgsConstructor
public class LoaHomeController {
    private final AdventurerService adventurerService;

    @ResponseBody
    @GetMapping("/adventurer/{name}")
    public Adventurer getAdventurer(@PathVariable("name") String name) {

        return adventurerService.getAdventurer(name);
    }
}
