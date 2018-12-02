package edu.ucsb.cs56.pconrad.springboot.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }

	@RequestMapping("/seasonalplants")
    public String page1() {
        return "seasonalplants";
    }

	@RequestMapping("/user_bookmarks")
	public String page2() {
        return "user_bookmarks";
    }
	@RequestMapping("/search")
	public String page3() {
        return "search";
    }
	@RequestMapping("/photos")
    public String page4() {
        return "photos";
    }
	@RequestMapping("/weather")
	public String page5() {
        return "weather";
    }
	@RequestMapping("/cucumber")
	public String page6() {
        return "cucumber";
    }	
	@RequestMapping("/cucumberrecipe")
	public String page7() {
        return "cucumberrecipe";
    }
	@RequestMapping("/beet")
	public String page8() {
        return "beet";
    }	
	@RequestMapping("/beetrecipe")
	public String page9() {
        return "beetrecipe";
    }
	@RequestMapping("/broccoli")
	public String page10() {
        return "broccoli";
    }	
	@RequestMapping("/broccolirecipe")
	public String page11() {
        return "broccolirecipe";
    }
}
