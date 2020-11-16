package au.usyd.courseadvisor;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import au.usyd.courseadvisor.Model.User;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	private static final String menuBg = "background-color: #5C6879";
	private static final String noDisplay = "display: none";
	private static final String displayModal = "display: block";
	private String username;
	private String userImgUrl;
	
	@RequestMapping(value = "login.htm", method = RequestMethod.GET)
 	public String login(Locale locale, Model model) {
		model.addAttribute("loginInfo", new User(userImgUrl, userImgUrl, userImgUrl, userImgUrl, userImgUrl, userImgUrl, userImgUrl, userImgUrl, userImgUrl, userImgUrl, userImgUrl, userImgUrl));
 		return "login";
 	}
	
	@RequestMapping(value = "/initiallogin", method = RequestMethod.POST)
    public String loginformsubmit(@ModelAttribute("loginInfo")User user, 
      BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return "error";
        }
        model.addAttribute("homeStyle", menuBg);
		model.addAttribute("pageTitle", "Dashboard");
		model.addAttribute("userName", user.getUsername());
		
		return "home";
    }
	
	
	
	@RequestMapping(value = "initialsetting.htm", method = RequestMethod.GET)
 	public String initialSetting(Locale locale, Model model) {
 		return "initialSetting";
 	}
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		model.addAttribute("homeStyle", menuBg);
		model.addAttribute("pageTitle", "Dashboard");
		
		username = "Fai Vesvijak";
		model.addAttribute("userName", username);
		
		return "home";
	}
	
	@RequestMapping(value = "course.htm", method = RequestMethod.GET)
	public String course(Locale locale, Model model) {
		model.addAttribute("courseStyle", menuBg);
		model.addAttribute("pageTitle", "Course & Rating");
		
		username = "Fai Vesvijak";
		model.addAttribute("userName", username);
		
		return "course";
	}
	
	@RequestMapping(value = "feedback.htm", method = RequestMethod.GET)
	public String feedback(Locale locale, Model model) {
		model.addAttribute("feedbackStyle", menuBg);
		model.addAttribute("pageTitle", "Feedback Survey");
		
		username = "Fai Vesvijak";
		model.addAttribute("userName", username);
		
		return "feedback";
	}
	
	@RequestMapping(value = "setting.htm", method = RequestMethod.GET)
	public String setting(Locale locale, Model model) {
		model.addAttribute("homeStyle", menuBg);
		model.addAttribute("pageTitle", "User Setting");
		
		username = "Fai Vesvijak";
		model.addAttribute("userName", username);
		
		return "setting";
	}
	
	@RequestMapping(value = "faculty/dashboard.htm", method = RequestMethod.GET)
	public String facultyDashboard(Locale locale, Model model) {
		model.addAttribute("homeMenu", noDisplay);
		model.addAttribute("courseStyle", menuBg);
		model.addAttribute("feedbackMenu", noDisplay);
		model.addAttribute("pageTitle", "Find Courses");
		
		username = "Dr. Prof blah";
		model.addAttribute("userName", username);
		
		return "facultyDashboard";
	}
	
	
	@RequestMapping(value = "coursedetails.htm", method = RequestMethod.GET)
	public String courseDetail(Locale locale, Model model) {
		model.addAttribute("courseStyle", menuBg);
		model.addAttribute("pageTitle", "Course Details");
		
		model.addAttribute("courseCode", "COMP5347");
		model.addAttribute("courseName","Web Application Development");
		model.addAttribute("courseDescription","It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).");
		model.addAttribute("specialisation","#web, #HTML");
		
		model.addAttribute("courseRating","3.5");
		model.addAttribute("surveyMessage","wrrryyyyyy");
		
		username = "Dr. Prof blah";
		model.addAttribute("userName", username);
		
		return "courseDetail";
	}
	
	@RequestMapping(value = "feedbackmodal.htm", method = RequestMethod.GET)
 	public String feedbackModal(Locale locale, Model model) {
 		model.addAttribute("courseStyle", menuBg);
 		model.addAttribute("pageTitle", "Course Details");
 		model.addAttribute("modalStyle", displayModal);
 
 		username = "Dr. Prof blah";
 		model.addAttribute("userName", username);
 
 		return "courseDetail";
 	}
	
	@RequestMapping(value = "feedback/modal-part1.htm", method = RequestMethod.GET)
	public String openModal(Locale locale, Model model) {
		model.addAttribute("feedbackMenu", menuBg);
		model.addAttribute("pageTitle", "Feedback Survey");
		model.addAttribute("modalOneStyle", displayModal);
		
		username = "Dr. Prof blah";
		model.addAttribute("userName", username);
		
		return "feedback";
	}
	
	@RequestMapping(value = "feedback/modal-part2.htm", method = RequestMethod.GET)
	public String nextModal(Locale locale, Model model) {
		model.addAttribute("feedbackMenu", menuBg);
		model.addAttribute("pageTitle", "Feedback Survey");
		model.addAttribute("modalTwoStyle", displayModal);
		
		username = "Dr. Prof blah";
		model.addAttribute("userName", username);
		
		return "feedback";
	}
}
