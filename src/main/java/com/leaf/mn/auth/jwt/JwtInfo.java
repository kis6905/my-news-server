package com.leaf.mn.auth.jwt;

import java.io.UnsupportedEncodingException;

import com.auth0.jwt.algorithms.Algorithm;

public class JwtInfo {

	public static final String HEADER_NAME = "jwt-header";
	public static final String ISSUER = "1leaf";
	public static final String TOKEN_SECRET_KEY = "mynews321rltnf321";
	public static final long EXPIRES_LIMIT = 3L;

	public static Algorithm getAlgorithm() {
		try {
			return Algorithm.HMAC256(JwtInfo.TOKEN_SECRET_KEY);
		} catch (IllegalArgumentException | UnsupportedEncodingException e) {
			return Algorithm.none();
		}
	}
}
