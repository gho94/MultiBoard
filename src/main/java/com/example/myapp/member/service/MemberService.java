package com.example.myapp.member.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.myapp.member.dao.IMemberRepository;
import com.example.myapp.member.model.Member;

@Service
public class MemberService implements IMemberService {

	@Autowired
	IMemberRepository memberRepository;
	
	@Override
	public void insertMemeber(Member member) {
		memberRepository.insertMemeber(member);
	}

	@Override
	public Member selectMember(String userid) {
		return memberRepository.selectMember(userid);
	}

	@Override
	public List<Member> selectAllmembers() {
		return memberRepository.selectAllmembers();
	}

	@Override
	public void updateMember(Member member) {
		memberRepository.updateMember(member);
	}

	@Override
	public void deleteMember(Member member) {
		memberRepository.deleteMember(member);
	}

	@Override
	public String getPassword(String userid) {
		return memberRepository.getPassword(userid);
	}

}
