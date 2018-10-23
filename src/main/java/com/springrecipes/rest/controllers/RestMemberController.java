package com.springrecipes.rest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springrecipes.rest.beans.Members;
import com.springrecipes.rest.services.MemberService;

@Controller
public class RestMemberController {
	@Autowired
	private  MemberService memberService;
	
	@RequestMapping("/members")
	public String getRestMembers(Model model) {
		Members members=new Members();
		members.addMembers(memberService.findAll());
		model.addAttribute("members",members);
		return "memberTemplate";
	}
}
