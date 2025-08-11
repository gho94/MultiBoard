package com.example.myapp.member.service;

import java.util.List;

import com.example.myapp.member.model.Member;

public interface IMemberService {
	void insertMemeber(Member member);
	Member selectMember(String userid);
	List<Member> selectAllmembers();
	void updateMember(Member member);
	void deleteMember(Member member);
	String getPassword(String userid);
}
