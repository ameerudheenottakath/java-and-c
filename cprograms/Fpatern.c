#include <stdio.h>

int main(void)
{
    for (int i = 1; i <= 4; i++)
    {
        if (i % 2 == 0)
        {
            for (int j = 1; j <= 2; j++)
            {
                printf("X\n");
            }
        }
        else
        {
            printf("*\n");
        }
        if (i == 4)
        {
            break;
        }

        for (int j = 1; j <= i * 4; j++) // Changed the loop variable to 'j'
        {
            printf("*");
        }
        printf("\n");
    }

    return 0;
}
