package searchEngine.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class EngineController {
	@RequestMapping("/home")
	public String home() {
		return "home";
	}
	@RequestMapping(path = "search", method = RequestMethod.POST)
	public RedirectView search(@RequestParam String query) {
		RedirectView rv=new RedirectView();
		rv.setUrl("https://www.google.com/search?q="+query);
		return rv;
	}

}
