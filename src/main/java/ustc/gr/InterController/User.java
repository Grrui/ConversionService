package ustc.gr.InterController;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable{
	private String loginName;
	private Date birthday;
	public User() {
		super();
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
}
