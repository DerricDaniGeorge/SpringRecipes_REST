package com.springrecipes.rest.services;
import java.util.Arrays;
import java.util.Collection;
import com.springrecipes.rest.beans.Member;
public class MemberServiceImpl implements MemberService {
	public Collection<Member>findAll(){
		return Arrays.asList(new Member("Marten Deinum","00-31-12343544545","marten@deinum.biz"),
				new Member("John Doe","00-800-800-800","john@doe.com"),
				new Member("Jane Doe","1-801-801-803","jane@doe.com"));
	}
}
