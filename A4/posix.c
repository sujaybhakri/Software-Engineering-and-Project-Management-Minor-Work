/*
This is a POSIX standard compliant C program which implements the following business scenario:
You have to create an application that reads employee salaries from a text file and gives you an employee report(Number of employees, Average Salary). The Application must written in POSIX standards.

*/

#include <stdio.h>
#include <stdlib.h>
#define file_name "emp.txt" // defining text file name for easy access
void get_employee_report()
{
    // creating file pointer
    FILE *file;

    char str[6];
    double total_salary = 0;
    double avg_salary = 0;
    int employee_count = 0;

    // opening file in read mode
    file = fopen(file_name, "r");

    // reading salaries and employee count
    while (fgets(str, sizeof(str), file))
    {
        int salary = atof(str);
        if (salary != 0)
        {
            employee_count++;
            total_salary += salary;
        }
    }

    // closing file after read operations are over
    fclose(file);

    // computing average salary
    avg_salary = total_salary / employee_count;

    // displaying employee report
    printf("Employee Count= %d\nAverage Salary: %.2f\n", employee_count, avg_salary);
}
void main()
{
    get_employee_report();
}