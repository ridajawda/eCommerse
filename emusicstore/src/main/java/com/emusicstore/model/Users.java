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
@Table(name = "users")
public class Users{

	@Id
	@Column(name = "usersId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int usersId;
    
	@Column(name = "username")
	private String username;
   
	@Column(name = "password")
	private String password;
    
	@Column(name = "enabled")
	private boolean enabled;
    
	@Column(name = "customerId")
	private int customerId;

    public int getUsersId() {
        return usersId;
    }

    public void setUsersId(int usersId) {
        this.usersId = usersId;
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

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
}
