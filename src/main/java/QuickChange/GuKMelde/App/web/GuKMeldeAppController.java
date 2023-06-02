package QuickChange.GuKMelde.App.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GuKMeldeAppController {

    @GetMapping(path = "/")
    public ModelAndView showGuKMeldeAppPage() {
        return new ModelAndView("GuKMeldeApp");
    }
}
