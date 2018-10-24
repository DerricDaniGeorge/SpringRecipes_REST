package com.springrecipes.rest.services;

import java.util.Collection;
import com.springrecipes.rest.beans.Member;
public interface MemberService {
public Collection<Member> findAll();
public Member findMemberByName(String name);
}
