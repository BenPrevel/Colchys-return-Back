package com.wcs.ColchysreturnBack.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.wcs.ColchysreturnBack.Dto.MeetingDto;
import com.wcs.ColchysreturnBack.entity.Meeting;
import com.wcs.ColchysreturnBack.entity.Member;
import com.wcs.ColchysreturnBack.repository.MeetingRepository;
import com.wcs.ColchysreturnBack.repository.MemberRepository;

@CrossOrigin
@RestController
@RequestMapping("/meetings")
public class MeetingController {

	@Autowired
	MeetingRepository meetingRepository;
	
	@Autowired
	MemberRepository memberRepository;
	
	// get all
	@GetMapping
	public List<Meeting> getAll(){
		return meetingRepository.findAll();
	}
	
	// Create
	@PostMapping
	public Meeting create(@Valid @RequestBody MeetingDto meetingDto) {
		
		System.err.println();
		
		// get the role in the dto
		Long memberId = meetingDto.getMemberId();
		// check if the role exist
		Member member = memberRepository.findById(memberId).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
		
		Meeting meeting = new Meeting();
		
		meeting.setFirstname(meetingDto.getFirstname());
		meeting.setLastname(meetingDto.getLastname());
		meeting.setDate(meetingDto.getDate());
		meeting.setSubject(meetingDto.getSubject());
		meeting.setDescription(meetingDto.getDescription());
		meeting.setMember(member);

		return meetingRepository.save(meeting);	
		
	}
	
	
	// delete
	@DeleteMapping("/{id}")
	public void delete(@PathVariable(required = true) Long id) {
		Optional<Meeting> optMeeting = meetingRepository.findById(id);
		if(optMeeting.isEmpty()) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND);
		}
		meetingRepository.deleteById(id);
	}
}
