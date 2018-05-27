package web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import models.owner;

@Controller
@EnableAutoConfiguration
public class OrnekController {

	@RequestMapping("/musterigetir")
	public ModelAndView ownerpage() {
		ModelAndView model = new ModelAndView();
		
		owner own = new owner();
		own.setAd("Muhammet Ali");
		own.setId(1l);
		own.setSoyad("HOCA");
		
		model.addObject("ali",own); // ali isminde  own nesnesini  model nesnesi içine ekler.
		model.setViewName("owner"); // gösterilecek jsp sayafasının adıdır.
		return model;
	}
	
	
	@RequestMapping("/hello")
	@ResponseBody
	public String wellcome() {
		return "<h1>İlk MVC Sayfasına Hoşgeldiniz.</h1>";
	}
	
	public static void main(String[] args) throws Exception {
        SpringApplication.run(OrnekController.class, args);
    }
	
}
