#include<iostream>
using namespace std ;

class hello{
     public:
     static int hi(int x){
         int p=x/2;
        for(int i=2;i<=p;i++){
         if(x%i==0){
            cout<<"it is not a prime number "<<endl;
            break;
         }
         else if(x==1){
            cout<<"1 is neither prime nor composite "<<endl;
            break;
         }
         else{
            cout<<"it is a prime number "<<endl;
            break;
         }
        }

     }
};
int main()	{
int user;
cout<<"enter the number : "<<endl;
cin>>user;
    hello::hi(user);
return 0;
}