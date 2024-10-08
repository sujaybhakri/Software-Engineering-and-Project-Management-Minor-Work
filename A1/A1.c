#include<stdio.h>
void main(){
  //Initializing the value of x to 43
  int x=43; 

  // Printing the value of x before calling the increment function
  printf("\nThe value of x before funtion call: %d",x); 
  
  // Function call where we are passing x as a parameter
  increment(x); 
  
  // Printing the value of x after the function call is done
  printf("\nThe value of x after funtion call: %d",x); 

}
void increment(int x){
  // Incrementing x by 1 to show that the value has been modified
  x++; 
  
  // Printing the value of x inside the function
  printf("\nThe value of x inside the function: %d",x); 

}
