package model;

public class User {

    private Integer id;
    private String name;
    private String userName;
    private String email;
    private Object address;
    private String phone;
    private String website;
    private Object company;

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setAddress(Object address) {
        this.address = address;
    }

    public Object getAddress() {
        return address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getWebsite() {
        return website;
    }

    public void setCompany(Object company) {
        this.company = company;
    }

    public Object getCompany() {
        return company;
    }
}
