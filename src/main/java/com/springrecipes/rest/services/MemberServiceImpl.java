package com.springrecipes.rest.services;

import java.util.Arrays;
import java.util.Collection;
import com.springrecipes.rest.beans.Member;

public class MemberServiceImpl implements MemberService {
	Member[] members = { new Member("MartenDeinum", "00-31-12343544545", "marten@deinum.biz"),
			new Member("JohnDoe", "00-800-800-800", "john@doe.com"),
			new Member("JaneDoe", "1-801-801-803", "jane@doe.com") };

	public Collection<Member> findAll() {
		return Arrays.asList(members);
	}

	public Member findMemberByName(String name) {
		Member member=new Member();
		System.out.println("Inside findMemberByName method:name"+name);
		for(Member m:members) {
			if(m.getName().equalsIgnoreCase(name)) {
				System.out.println("Inside findMemberByName if condition:"+m.getName());
				member=m;
				break;
			}
		}
		return member;
	}
}
