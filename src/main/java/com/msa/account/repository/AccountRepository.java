package com.msa.account.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.msa.account.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {
	
}
