#include<stdio.h>

int main()
{
  int num1,num2;
  printf("enter two numbers: ");
  scanf("%d%d",&num1,&num2);
  if(num1>num2)
  {
    printf("%d is maximum",num1);
    printf("%d is minimum",num2);
  }
  else
  {
    printf("%d is maximum",num2);
    printf("%d is minimum",num1);
  }
    return(0);
 }