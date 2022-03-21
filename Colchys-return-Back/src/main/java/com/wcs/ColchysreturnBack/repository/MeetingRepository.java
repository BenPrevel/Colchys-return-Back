package com.wcs.ColchysreturnBack.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wcs.ColchysreturnBack.entity.Meeting;

@Repository
public interface MeetingRepository extends JpaRepository<Meeting, Long>{

}
