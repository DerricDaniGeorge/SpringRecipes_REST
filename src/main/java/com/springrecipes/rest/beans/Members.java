package com.springrecipes.rest.beans;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Members {

	@XmlElement(name="hoi")  // This "hoi" will come in xml view as tag
	private List<Member> members=new ArrayList<>();
	
	public void setMembers(List<Member> members) {
		this.members=members;
	}
	public List<Member> getMembers(){
		return members;
	}
	public void addMembers(Collection<Member> members) {
		this.members.addAll(members);
	}
	public void addMember(Member member) {
		this.members.add(member);
	}
}
