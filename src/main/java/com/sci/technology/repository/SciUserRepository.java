package com.sci.technology.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sci.technology.entity.SciUser;

@Repository
public interface SciUserRepository extends JpaRepository<SciUser, Long> {

}
