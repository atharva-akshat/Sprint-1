package com.womenempowerment.dto;

import javax.validation.constraints.Pattern;

public class IUserDto {
    @Pattern(regexp = "^[a-zA-Z0-9]([._-](?![._-])|[a-zA-Z0-9]){3,18}[a-zA-Z0-9].{5,20}$",
            message = ("Username must contain \n" +
                    "1. Alphanumeric characters (a-z, A-Z, 0-9), lowercase, or uppercase\n" +
                    "2. Username of the dot (.), underscore (_), and hyphen (-) allowed\n" +
                    "3. The dot (.), underscore (_), or hyphen (-) must not be the first or last character\n" +
                    "4. The dot (.), underscore (_), or hyphen (-) does not appear consecutively (e.g., alex..smith)\n" +
                    "5. The number of characters must be between 5 to 20"))
    private String userName;
    @Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#!$%^&\\-+=()])(?=\\S+$).{4,}$",
            message = ("Password must contain \n" +
                    "1. UPPERCASE and lowercase characters (a-z, A-Z) \n" +
                    "2. Numbers(0-9)\n" +
                    "3. Special characters(@#@#!$%^&\\-+=())\n"))
    private String userPassword;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
}
