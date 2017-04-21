package com.bonzai.controller;

import com.bonzai.mail.EmailHtmlSender;
import com.bonzai.pojo.Persons;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.thymeleaf.context.Context;

@Component
@RestController
public class EmailController {

	@Autowired
	EmailHtmlSender emailHtmlSender;

	@Value("${email.to}")
	String to;

	@Value("${email.cc}")
	String cc;
	
	@RequestMapping("/mail")
	public void send(@RequestBody Persons persons){
		Context context = new Context();
		context.setVariable("title", "this is title");
		context.setVariable("description", "description");
		context.setVariable("publish", persons);
		emailHtmlSender.send(to,cc, "Title of email", "email", context);
	}
}
