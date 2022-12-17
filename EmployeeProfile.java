/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HRModel;

import java.awt.Image;
import java.io.File;
import java.util.Date;

/**
 *
 * @author adity
 */
public class EmployeeProfile {
    /*Parameters*/
    String name;
    String empID;
    int age;
    String gender;
    Date date; /*Alpha numeric format of date*/
    int level; /*Numeric value*/
    String team_Info;
    String title;
    /*Contact Info*/
    long phNo;
    String email;
    String photo;
    
    /*Getters and Setter*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmpID() {
        return empID;
    }

    public void setEmpID(String empID) {
        this.empID = empID;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getTeam_Info() {
        return team_Info;
    }

    public void setTeam_Info(String team_Info) {
        this.team_Info = team_Info;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getPhNo() {
        return phNo;
    }

    public void setPhNo(long phNo) {
        this.phNo = phNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
    
    @Override
    public String toString(){
        return name;
    }
}
