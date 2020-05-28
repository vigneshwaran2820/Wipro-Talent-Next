class Code
{
 public class sumoflast(input1){
int n=input1;
    if(n<0)
    {
        n*=-1;
        n=n%10;
        return n;
    }
    else if(n>=0&&n<=9)
    {
        
        return n;
    }
    else
    {
        n=n%10;
        return n;
    }
}
