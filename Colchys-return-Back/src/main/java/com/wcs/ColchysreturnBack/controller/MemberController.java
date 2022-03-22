package com.wcs.ColchysreturnBack.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wcs.ColchysreturnBack.Dto.MemberDto;
import com.wcs.ColchysreturnBack.entity.Member;
import com.wcs.ColchysreturnBack.repository.MemberRepository;

@CrossOrigin
@RestController
@RequestMapping("/members")
public class MemberController {

	@Autowired
	MemberRepository memberRepository;
	
	// get all
		@GetMapping
		public List<Member> getAll(){
			return memberRepository.findAll();
		}
		
		
		
		// Create a member of the gov
		@PostMapping
		public Member create(@Valid @RequestBody MemberDto memberDto) {
			Member member = new Member();
			
			member.setGovFirstname(memberDto.getGovFirstname());
			member.setGovLastname(memberDto.getGovLastname());
			member.setMinistry(memberDto.getMinistry());
			member.setRole(memberDto.getRole());

			return memberRepository.save(member);	
			
		}
	
}
