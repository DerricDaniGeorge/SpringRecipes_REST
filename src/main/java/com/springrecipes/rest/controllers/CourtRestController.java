package com.springrecipes.rest.controllers;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.BeanNameViewResolver;
import org.springframework.web.servlet.view.xml.MarshallingView;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import com.springrecipes.rest.beans.Members;
import com.springrecipes.rest.beans.Member;
import org.springframework.oxm.Marshaller;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages="com.springrecipes.rest.controllers")
public class CourtRestController {
	@Bean
	public Marshaller jaxb2Marshaller() {
		Jaxb2Marshaller marshaller=new Jaxb2Marshaller();
		marshaller.setClassesToBeBound(Members.class,Member.class);
		return marshaller;
	}
	@Bean
	public View memberTemplate() {
		return new MarshallingView(jaxb2Marshaller());
	}
	@Bean
	public ViewResolver viewResolver() {
		return new BeanNameViewResolver();
	}
}
