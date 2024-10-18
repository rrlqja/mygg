package song.spring1.domain.common;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
@RequiredArgsConstructor
public class CommonController {

    @GetMapping("/")
    public String getHome(Model model) {
        model.addAttribute("name", null);

        return "home";
    }
}
