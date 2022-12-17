/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HRModel;

import java.util.ArrayList;

/**
 *
 * @author adity
 */
public class EmpProfileHistory {
    
    private ArrayList<EmployeeProfile> emphistory;

    public ArrayList<EmployeeProfile> getEmphistory() {
        return emphistory;
    }

    public void setEmphistory(ArrayList<EmployeeProfile> emphistory) {
        this.emphistory = emphistory;
    }
    
    public EmpProfileHistory(){
        this.emphistory=new ArrayList<EmployeeProfile>();
    }
    
    public EmployeeProfile addEmployee(){
        EmployeeProfile newEmployee = new EmployeeProfile();
        emphistory.add(newEmployee);
        return newEmployee;
    }
    
    public void deleteEmployee(EmployeeProfile ep){
        emphistory.remove(ep);
    }
    public ArrayList<EmployeeProfile> getSearch(String search){
        ArrayList<EmployeeProfile> emp=new ArrayList<EmployeeProfile>();
        /*String empID= (search);*/
        /*int level= Integer.parseInt(search);*/
        for(EmployeeProfile ep : emphistory){
            if(ep.getName().contains(search)||ep.getEmpID().contains(search)||ep.getTitle().contains(search)|| ep.getGender().contains(search)){
                emp.add(ep);
            }
        }
    return emp;
    }
    
   
}
