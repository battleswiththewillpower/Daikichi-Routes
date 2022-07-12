package com.ashleybattles.daikichiroutes;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/daikichi")
public class HomeController {
	@RequestMapping("")
	public String index() {
		return ("Welcome!");
	}
	
	@RequestMapping("/today")
	public String spring() {
		return "Today you will find luck in all your endeavors!";
	}
	
	@RequestMapping("/tomorrow")
	public String tomorrow() {
		return "'Tomorrow, an opportunity will arise, so be sure to be open to new ideas!'";
	}
	
	//Daikichi Path Variables
	 @RequestMapping("/travel/{location}")
	    public String showLesson(@PathVariable("location") String location){
	    	return "Congratulations! You will soon travel to " + location + "!";
	    }
	 
	 @RequestMapping("/{lotto}/{number}")
	    public String showLessonTwo(@PathVariable("lotto") String lotto, @PathVariable("number") Integer number){
//		 If the number is even, display text that says 
//		 'You will take a grand journey in the near future, 
//		 but be weary of tempting offers'
		 if(number % 2 == 0) {
			 return "You will take a grand journey in the near future, but be weary of tempting offers";
		 } else {
			return "You have enjoyed the fruits of your labor but now" + " " + "is a great time to spend time with family and friends."; 
		 }
//		 If it is odd, display text that says 
//		 "You have enjoyed the fruits of your labor but now "
//		 + "is a great time to spend time with family and friends."
		 
	    }
	 

}