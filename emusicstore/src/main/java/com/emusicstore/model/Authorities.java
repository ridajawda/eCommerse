package com.emusicstore.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Le on 1/24/2016.
 */

@Entity
@Table(name = "authorities")
public class Authorities {

	@Id
	@Column(name = "authoritiesId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int authoritiesId;
    
	@Column(name = "username")
	private String username;
   
	@Column(name = "authority")
	private String authority;

    public int getAuthoritiesId() {
        return authoritiesId;
    }

    public void setAuthoritiesId(int authoritiesId) {
        this.authoritiesId = authoritiesId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }
}
