package com.msa.account.dto;

import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import com.msa.account.entity.Account;
import com.msa.account.entity.Role;
import com.msa.account.model.Address;
import com.msa.account.model.Name;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;

public class AccountDto {

    @Getter
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    public static class LoginReq {
    	
    	@Email
    	@NonNull
        private String email;
    	
    	@NotBlank
        private String password;

        @Builder
        public LoginReq(String email, String password) {
            this.email = email;
            this.password = password;
        }
    }

    @Getter
    public static class Res {
    	private Long accountId;
        private String email;
        private Name name;
        private Address address;
        private Role role;

        public Res(Account account) {
        	this.accountId = account.getId();
            this.email = account.getEmail();
            this.name = account.getName();
            this.address = account.getAddress();
            this.role = account.getRole();
        }
    }
    
}
