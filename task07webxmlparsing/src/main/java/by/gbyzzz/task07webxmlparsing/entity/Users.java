package by.gbyzzz.task07webxmlparsing.entity;



import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class Users {
    private Long userId;
    private String username;
    private String name;
    private String surname;
    private String phone;
    private String email;
    private String role;
    private Boolean isActive;
    private Date regDate;

    public Users() {
    }

    public Users(String role) {
        this.role = role;
    }

    public Users(Long userId, String username, String name, String surname, String phone, String email, String role, Boolean isActive, Date regDate) {
        this.userId = userId;
        this.username = username;
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.email = email;
        this.role = role;
        this.isActive = isActive;
        this.regDate = regDate;
    }

    public void setAll(Long userId, String username, String name, String surname, String phone, String email, Boolean isActive, Date regDate) {
        this.userId = userId;
        this.username = username;
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.email = email;
        this.isActive = isActive;
        this.regDate = regDate;
    }

    public String getRegDate() {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        return format.format(regDate);
    }

    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", role='" + role + '\'' +
                ", isActive=" + isActive +
                ", regDate=" + regDate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Users users = (Users) o;
        return Objects.equals(userId, users.userId) && Objects.equals(username, users.username) && Objects.equals(name, users.name) && Objects.equals(surname, users.surname) && Objects.equals(phone, users.phone) && Objects.equals(email, users.email) && Objects.equals(role, users.role) && Objects.equals(isActive, users.isActive) && Objects.equals(regDate, users.regDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, username, name, surname, phone, email, role, isActive, regDate);
    }
}
