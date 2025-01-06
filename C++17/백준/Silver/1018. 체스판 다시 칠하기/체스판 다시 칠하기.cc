#include <stdio.h>
int main()
{
    char startWhite[8][8] = {
    {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
    {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
    {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
    {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
    {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
    {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
    {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
    {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'}};
  
  char startBlack[8][8] = {
    {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
    {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
    {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
    {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
    {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
    {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
    {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
    {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'}};

    int n,m,b=0,w=0,k=0;
    int cnt=0,cnt2=0;
    int a=0,b1=0;
    int min=10000,min1=10000;
    char x[50][50],y[8][8],cnt1;
    scanf("%d %d",&n,&m);
    for(int i=0; i<n; i++)
    {
        scanf("%c",&cnt1); //공백
        for(int j=0; j<m; j++)  //입력받기
        {
            scanf("%c",&x[i][j]);  
            if(x[i][j]=='B')  //카운트
            b++;
            else if(x[i][j]=='W')
            w++;
        }
    }  


    for(int i=0; i<=n-8; i++) //행계산
    { 
        b1=0; 
        for(int j=0; j<=m-8; j++) //열계산
        {
            cnt=0;
            cnt1=0;
          // if(x[0+a][0+b1]=='W')
          //  {  //w일때 차이계산
                for(int i=0; i<8; i++)
                {
                for(int j=0; j<8; j++)
                    {
                    if(startWhite[i][j]!=x[i+a][j+b1])
                    cnt++;
                    }
          //      }

            }
          //  if(x[0+a][0+b1]=='B')
             //차이계산
             for(int i=0; i<8; i++)
                {
                for(int j=0; j<8; j++)
                    {
                    if(startBlack[i][j]!=x[i+a][j+b1])
                    cnt1++;
                    }
                } 
         //    }
             if(min>cnt) //최소값 변경
             min=cnt;
               
             if(min1>cnt1) //최소값 변경
             min1=cnt1;
             b1++;
        }
        a++;
        
    }
    //거꾸로 짤라서 비교
    
   /* for(int i=0; i<=n-8; i++) //행계산
    { 
        b1=0; 
        for(int j=0; j<=m-8; j++) //열계산
        {
            cnt2=0;
            if(x[n-a][m-b1]=='W')
            { //w일때 차이계산
                for(int i=7; i>=0; i--)
                {
                for(int j=7; j>=0; j--)
                    {
                    if(startWhite[i][j]!=x[i+a][j+b1])
                    cnt2++;
                    }
                }

            }
            if(x[n-a][m-b1]=='B')
            { //차이계산
             for(int i=7; i>=0; i--)
                {
                for(int j=7; j>=0; j--)
                    {
                    if(startBlack[i][j]!=x[i+a][j+b1])
                    cnt2++;
                    }
                } 
             }
             if(min1>cnt2) //최소값 변경
             min1=cnt2;
             b1++;   
        }
        a++;
        
    }  */
    min>=min1 ? printf("%d\n",min1) : printf("%d\n",min);
   

    return 0;
}