package Task1;

import java.util.Arrays;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        /*
    Task 1
    Develop and test a set of classes to solve the task of calculating the wage of employees of a certain company.
    The company has several methods of remuneration of labour:
    ■wage indicates how much money an employee receives per working day, for each employee, it is written how many days in a month they have worked;
    ■hourly wage indicates how much money the employee receives per hour, it is written how many hours each employee has worked in a month.
    ■piece-rate wage indicates how much money the employee will receive for the work done, there are written sums for each work done  by each employee in a month.
    The  program  should  be  able  to  output  the  report  on  all  employees of the company on wages in the form of:
         */
    ListOfWorkers listOfWorkers = new ListOfWorkers();
    Worker worker1 = new Worker("Brown", "Wage", 3000);
    Worker worker2 = new Worker("Smith", "Hourly wage", 800);
    Worker worker3 = new Worker("Travolta", "Pierce-rate wage", 5500);
    List<Worker> workers = Arrays.asList(worker1,worker2, worker3);
    listOfWorkers.collectWorkers(workers);

    //listOfWorkers.getTableOfWorkers();

    /*Task 2
    Output  the  report  including  taxes  for  the  previous  task.
    For  employees, who receive wage and an hourly wage the tax is 20%.
    For employees, who receive a piece-rate wage, the tax is 15%.
    The  program  should  be  able  to  output  the  report  on  all  employees of the company on wages in the following form:*/
    worker1.setTax(20);
    worker2.setTax(20);
    worker3.setTax(15);
    //listOfWorkers.getAfterTaxToPayTable();


    /*Task 3
    Based on the previous task, make a new report, so that the tax rate for employees, who do not have children, is 5% higher. */
    worker1.setChildren(true);
    worker2.setChildren(false);
    worker3.setChildren(true);
    //listOfWorkers.getAfterTaxToPayTable();

    /*
    Task 4
    On the basis of the previous task, redo the report, taking into account the fact that employees with an hourly wage receive half
    of the wage in currency (tugriks), at the exchange rate on the day of payroll.
     */
    //listOfWorkers.getAfterTaxToPayTable();

    /*
    Task 5
    The  company  moves  a  part  of  its  employees  to  the  offshore  zone.
    Employees in offshore do not pay taxes. Create a new report taking into account this innovation.*/
    worker1.setOffshore(true);
    worker2.setOffshore(false);
    worker3.setOffshore(false);
    listOfWorkers.getAfterTaxToPayTable();

    /*
    Task 6
    The  company  introduces  bonuses  to  employees,  who  worked  more  than  200  hours  per  month,
      but  are  not  in  offshore.  The  bonuses  should  be  summed  up  in  the  basic  wage.
        Create  a  new  report taking into account these changes. */

    }
}
