package de.bkwitten.projekt.susautomarkt.entities;

public class User {

	private String username;
	private String name;
	private String lastName;
	private String password;
	private String birthdate;
	private String email;
        private Role rolle;

	public enum Role{
            ADMIN(0),
            USER(1);
            
            private int value;
            private Role(int Value){
                value = Value;
            }
            
            private int getValue(){
                return value;
            }
            
            public Boolean ToBoolean(){
                return this == USER;
            }
        }

	public User(String username, String name, String lastName, String password, String birthdate, String email, Role rolle) {
		this.username = username;
		this.lastName = lastName;
		this.birthdate = birthdate;
		this.email = email;
		this.rolle = rolle;
	}
        
        public Role getRole(){
            return rolle;
        }
        
        public Boolean isUser(){
            return rolle == Role.USER;
        }

	public String getUsername() {
		return username;
	}

	public String getName() {
		return name;
	}

	public String getLastName() {
		return lastName;
	}

	public String getPassword() {
		return password;
	}

	public String getBirthdate() {
		return birthdate;
	}

	public String getEmail() {
		return email;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setRole(Role rolle) {
		this.rolle = rolle;
	}
        
        public void setRole(Boolean isUser){
            if(isUser){
                this.rolle = Role.USER;
            }else{
                this.rolle = Role.ADMIN;
            }
        }
}
