package com.springrecipes.rest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.PathVariable;
import com.springrecipes.rest.beans.Member;
import com.springrecipes.rest.beans.Members;
import com.springrecipes.rest.services.MemberService;

@Controller
public class RestMemberController {
	@Autowired
	private  MemberService memberService;
	
	@RequestMapping(value="/members")
	@ResponseBody
	public Members getRestMembers() {
		Members members=new Members();
		members.addMembers(memberService.findAll());
		return members;
	}  
/*	@RequestMapping(value="/members",produces=MediaType.APPLICATION_JSON_VALUE)
	public String getRestMembersJson(Model model) {
		Members members=new Members();
		members.addMembers(memberService.findAll());
		model.addAttribute("members",members);
		return "jsonMemberTemplate";
	}  */   
	@RequestMapping(value="/member/{name}")
	@ResponseBody
	public Members getMember(@PathVariable ("name") String name,Model model) {
		Member m= memberService.findMemberByName(name);
		System.out.println(m.getEmail()+":"+m.getName());
		Members members=new Members();
		members.addMember(m);
		return members; 
	}
}
