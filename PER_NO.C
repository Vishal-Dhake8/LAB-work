#include<stdio.h>
#include<conio.h>
int main()
{
   int n,i=1,sum=0;
    printf("enter the no.:");
    scanf("%d",&n);
    while(i<n)
    {
      if (n%i==0)
      sum=sum+i;
      i++;
      }
      if(sum==n)
      printf("%d is perfect no.",i);
      else
      printf("%d is not a perfect no.",i);
      getch();
  }