package com.example.car_park.entity;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name = "employee")
public class Employee {

    @Id
    private int employeeId;
    @NotNull(message = "Thiếu tên đăng nhập")// account = ""
    private String account;
    @NotNull(message = "Thiếu phòng ban")
    private String department;
    @NotNull(message = "Thiếu địa chỉ")
    private String employeeAddress;
    @NotEmpty(message = "Thiếu ngày sinh")
    @Pattern(regexp = "^(0?[1-9]|[12][0-9]|3[01])[\\/\\-](0?[1-9]|1[012])[\\/\\-]\\d{4}$")
    private String employeeBirthdate;
    @NotEmpty(message = "Thiếu Email ")
    @Pattern(regexp = "^[a-z][a-z0-9_\\.]{5,32}@[a-z0-9]{2,}(\\.[a-z0-9]{2,4}){1,2}$")
    private String employeeEmail;
    @NotEmpty(message = "Thiếu tên nhân viên")
    private String employeeName;

    @NotEmpty(message = "Thiếu số điện thoại")
    @Pattern(regexp = "^(0|\\+84)(\\s|\\.)?((3[2-9])|(5[689])|(7[06-9])|(8[1-689])|(9[0-46-9]))(\\d)(\\s|\\.)?(\\d{3})(\\s|\\.)?(\\d{3})$")
    private String employeePhone;
    @NotEmpty(message = "thiếu mật khẩu")
    @Pattern(regexp = "(?!^[0-9]*$)(?!^[a-zA-Z]*$)^([a-zA-Z0-9]{8,32})$")
    private String password;
    @NotEmpty(message = "Thiếu giới tính")
    private String sex;

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getEmployeeAddress() {

        return employeeAddress;
    }

    public void setEmployeeAddress(String employeeAddress) {
        this.employeeAddress = employeeAddress;
    }

    public String getEmployeeBirthdate() {
        return employeeBirthdate;
    }

    public void setEmployeeBirthdate(String employeeBirthdate) {
        this.employeeBirthdate = employeeBirthdate;
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeePhone() {
        return employeePhone;
    }

    public void setEmployeePhone(String employeePhone) {
        this.employeePhone = employeePhone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", account='" + account + '\'' +
                ", department='" + department + '\'' +
                ", employeeAddress='" + employeeAddress + '\'' +
                ", employeeBirthdate='" + employeeBirthdate + '\'' +
                ", employeeEmail='" + employeeEmail + '\'' +
                ", employeeName='" + employeeName + '\'' +
                ", employeePhone='" + employeePhone + '\'' +
                ", password='" + password + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
