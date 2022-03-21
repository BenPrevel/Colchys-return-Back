package com.wcs.ColchysreturnBack.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wcs.ColchysreturnBack.entity.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {

}
