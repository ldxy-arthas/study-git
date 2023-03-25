package com.arthas.webdemo.domain;

import java.util.Objects;

import lombok.Builder;

/**
 * @author: yuluo
 * @date: 2023/3/23 12:37
 * @description: some desc
 */

@Builder
public class User {

	private String username;

	private String password;

	private String eamil;

	@Override
	public String toString() {
		return "User: {" +
				"username='" + username + '\'' +
				", password='" + password + '\'' +
				", eamil='" + eamil + '\'' +
				'}';
	}
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		User user = (User) o;
		System.out.println("push txt");
		return Objects.equals(username, user.username) && Objects.equals(password, user.password) && Objects.equals(eamil, user.eamil);
	}

	@Override
	public int hashCode() {
		return Objects.hash(username, password, eamil);
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEamil() {
		return eamil;
	}

	public void setEamil(String eamil) {
		this.eamil = eamil;
	}
}
