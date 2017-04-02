package ustc.gr.InterController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class UserController {
	@RequestMapping(value="/{formName}")
	public String loginForm(
			@PathVariable String formName){

//			Model model,

//		User user = new User();
//		model.addAttribute("user", user);
		return formName;
	}
	
	@RequestMapping(value="/register",method=RequestMethod.POST)
	public String register(
			@ModelAttribute User user,
			Model model){
		System.out.println("222222w2");
		model.addAttribute("user",user);
		return "success";
	}
}
