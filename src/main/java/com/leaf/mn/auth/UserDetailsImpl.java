package com.leaf.mn.auth;

import java.util.List;

import org.springframework.security.core.GrantedAuthority;

import com.leaf.mn.user.dto.User;

public class UserDetailsImpl extends org.springframework.security.core.userdetails.User {

	private static final long serialVersionUID = 1L;

	public UserDetailsImpl(String id, List<GrantedAuthority> authorities) {
		super(id, "", authorities);
	}

	public UserDetailsImpl(User user, List<GrantedAuthority> authorities) {
		super(user.getUserId(), user.getRealPassword(), authorities);
	}
}
