package myproject03.src.junit;

import myproject03.src.domain.Employee;
import myproject03.src.service.NameListService;
import myproject03.src.service.TeamException;
import org.junit.Test;

public class NameListServiceTest {
    @Test
    public void testGetAllEmployees() {
        NameListService server = new NameListService();
        Employee[] allEmployees = server.getAllEmployee();

        for(int i = 0;i < allEmployees.length;i++){
            System.out.println(allEmployees[i].toString());
        }

    }
    @Test
    public void testGetEmployee(){
        NameListService server = new NameListService();
        int id = 1;
        try{
            Employee employee = server.getEmployee(id);
            System.out.println(employee);
        }catch(TeamException e){
            System.out.println(e.getMessage());
        }
    }


}
