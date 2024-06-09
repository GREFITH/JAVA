#include<stdio.h>
#include<conio.h>

void main(){
    int n,i,j,tat[20],wt[20],ct[20],bt[20],m=0,t=0,x,p[20],temp,cpuidel=0,at[20],z;
    int atat,awt;
    printf("\nEnter no of process = ");
    scanf("%d",&n);
    for(i=0;i<n;i++){
        printf("\nEnter Burst time of process P%d (in ms) = ",i);
        scanf("%d",&bt[i]);
        printf("\nEnter Arrival time of process P%d (in ms) = ",i);
        scanf("%d",&at[i]);
		p[i] = i;
    }
    printf("\n\tFCFS Scheduling algorithm");
    ct[-1]=0;
    bt[-1]=0;
    at[-1]=0;
    for(i=0; i<n-1; i++)
{
for(j=i+1; j<n; j++)
{
if((at[i] > at[j]) ||
(at[i] == at[j]&& p[i] > p[j]))
{
temp = p[i]; p[i] = p[j]; p[j] = temp;
temp = at[i]; at[i] = at[j]; at[j] = temp;
temp = bt[i]; bt[i] = bt[j]; bt[j] = temp;

}
}
}
    for(i=0;i<n;i++){
        ct[i]=ct[i-1]+bt[i];
        t=t+bt[i];
    }
    awt=atat=0;
    for(i=0;i<n;i++){
        tat[-1]= 0;
        wt[-1]= 0;
        tat[i]=ct[i]-at[i];
        wt[i]=tat[i]-bt[i];
        atat = atat + tat[i]; 
        awt = awt + wt[i]; 
    }
    printf("\nGantt Chart\n");
    printf("-");
    for(i=0;i<tat[n-1]+2*(n+2);i++){
        printf("-");
    }
    printf("\n|");
    for(i=0;i<n;i++){
        z= bt[i]/2;
        for(j=0;j<z;j++){
            printf(" ");
        }
        printf("P%d",p[i]);
        for(j=z+1;j<bt[i];j++){
            printf(" ");
        }
        printf("|");
    }
    printf("\n");
    printf("-");
    for(i=0;i<tat[n-1]+2*(n+2);i++){
        printf("-");
    }
    printf("\n0");
    for (i = 0; i < n; i++){
        x=bt[i];
        if(ct[i]<10){
            x=x+1;
        }
        for(j=0;j<x;j++){
            printf(" ");
        }
        printf("%d",ct[i]);
    }

    printf("\n\nSollution Table\n");

    printf("\n\t--------------------------------------------------------");
    printf("\n\t|Time\t| Process  \t|Turn Arround Time|Waiting Time|");
    printf("\n\t|    \t| Completed\t|=CT-AT           | =TAT-BT    |");
    printf("\n\t--------------------------------------------------------");

    printf("\n\t|0 \t| - \t\t| -\t\t  | - \t       |");
    for(i=0;i<n;i++){
        if(wt[i]%10==wt[i] && tat[i]%10==tat[i]){
           printf("\n\t|%d \t| P%d\t\t| 0%d\t\t  | 0%d         |",ct[i],p[i],tat[i],wt[i]);    
        }
        else if(wt[i]%10==wt[i] && tat[i]%10!=tat[i]){
           printf("\n\t|%d \t| P%d\t\t| %d\t\t  | 0%d         |",ct[i],p[i],tat[i],wt[i]); 
        }
        else if(wt[i]%10!=wt[i] && tat[i]%10==tat[i]){
		printf("\n\t|%d \t| P%d\t\t| 0%d\t\t  | %d         |",ct[i],p[i],tat[i],wt[i]);     
        }
        else{
           printf("\n\t|%d \t| P%d\t\t| %d\t\t  | %d         |",ct[i],p[i],tat[i],wt[i]);     
        }
    }
    printf("\n\t--------------------------------------------------------");
    printf("\n\nAverage turn around time = (Sum of all processes TAT/Total no. of processes)");
    printf("\n = ");
    for(i=0; i<n; i++){
        printf(" T.T(P%d) ",p[i]);
        if(i<n-1){
            printf("+");
        }
    }
    printf("/%d",n);
    printf("\n = ");
    for(i=0; i<n; i++){
        printf(" %d ",tat[i]);
        if(i<n-1){
            printf("+");
        }
    }
    printf("/ %d \n =  %d/%d",n,atat,n);
    printf("\n =  %.2f ms",(float)atat/(float)n);
    printf("\n\nAverage Waiting time (Sum of all processes WT/Total no. of processes)");
    printf("\n = ");
    for(i=0; i<n; i++){
        printf(" W.T(P)%d ",p[i]);
        if(i<n-1){
            printf("+");
        }
    }
    printf("/%d",n);
    printf("\n = ");
    for(i=0; i<n; i++){
        printf(" %d ",wt[i]);
        if(i<n-1){
            printf("+");
        }
    }
    printf("/ %d \n =  %d/%d",n,awt,n);
    printf("\n =  %.2f ms",(float)awt/(float)n);
    printf("\n\nThroughput = No. of Process/Total burst time\n = %d / %d \n = %.2f ms^(-1)\n\n",n,t,(float)n/(float)t);
	printf(" CPU utilization = [(CPU Busy time)/(CPU ideal time+CPU Busy time)]*100\n = [(%d)/(%d+%d)]*100",t,cpuidel,t);
    printf("\n = %d Percentage",((t/(cpuidel+t))*100));
}
