#include<stdio.h>
#include<stdlib.h>
int triangular(int x)
{
    int i, j, k;
    for(i=1; i<=x; i++)
    {
        for(j=1; j<=i; j++)
        {
            printf("%d", j);
        }
        printf("\n");
    }
    for(i=x-1; i>=1; i--)
    {
        for(j=1; j<=i; j++)
        {
            printf("%d", j);
        }
        printf("\n");
    }
}
int main(void)
{
    int n;
    printf("Masukkan nilai n: ");
    scanf("%d", &n);
    triangular(n);
    return 0;
}