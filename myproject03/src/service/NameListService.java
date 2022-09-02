package myproject03.src.service;

import myproject03.src.domain.*;


import static myproject03.src.service.Data.*;

public class NameListService {
    private Employee[] employees;

    public NameListService() {
        employees = new Employee[Data.EMPLOYEES.length];
        for(int i = 0;i < employees.length; i++){
            //获取员工类型
            int type = Integer.parseInt(Data.EMPLOYEES[i][0]);
            //获取Employee的4个基本信息
            int id = Integer.parseInt(EMPLOYEES[i][1]);
            String name = EMPLOYEES[i][2];
            int age = Integer.parseInt(EMPLOYEES[i][3]);
            double salary = Double.parseDouble(EMPLOYEES[i][4]);
            Equipment equipment;
            double bonus;

            switch(type){
                case EMPLOYEE:
                    employees[i] = new Employee(id,name,age,salary);
                    break;
                case PROGRAMMER:
                    equipment = createEquipment(i);
                    employees[i] = new Programmer(id,name,age,salary,equipment);
                    break;
                case DESIGNER:
                    equipment = createEquipment(i);
                    bonus = Double.parseDouble(EMPLOYEES[i][5]);
                    employees[i] = new Designer(id,name,age,salary,equipment,bonus);
                    break;
                case ARCHITECT:
                    bonus = Double.parseDouble(EMPLOYEES[i][5]);
                    equipment = createEquipment(i);
                    int stock = Integer.parseInt(EMPLOYEES[i][6]);
                    employees[i] = new Architect(id,name,age,salary,equipment,bonus,stock);
                    break;
            }
        }
    }
    public Equipment createEquipment(int index){
        int type = Integer.parseInt(EQUIPMENTS[index][0]);
        switch(type){
            case PC:
                return new PC(EQUIPMENTS[index][1],EQUIPMENTS[index][2]);
            case NOTEBOOK:
                double price = Double.parseDouble(EQUIPMENTS[index][2]);
                return new NotBook(EQUIPMENTS[index][1],price);
            case PRINTER:
                return new Printer(EQUIPMENTS[index][1],EQUIPMENTS[index][2]);
        }
        return null;
    }
    public Employee[] getAllEmployee(){

        return employees;
    }

    public Employee getEmployee(int id) throws TeamException{
        for(int i = 0;i < employees.length;i++){
            if(id == employees[i].getId()){
                return employees[i];
            }
        }
        throw new TeamException("找不到指定员工");
    }
}
