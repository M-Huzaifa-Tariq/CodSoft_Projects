#include<iostream>
using namespace std;
int main()
{ 
    //int a, b ;
    while(true)
    {
    	cout<<"\nenter nmbr:";
    	int a;
		cin>>a;
		cout<<"\nenter nmbr:";
    	int b;
		cin>>b;
		
	
    cout<<" |*********************************|\n";
    cout<<" |***********MAIN MANU*************|\n";
    cout<<" |     PRESS 1 FOR ADDITION        |\n";
    cout<<" |     PRESS 2 FOR SUBTRACTION     |\n";
    cout<<" |     PRESS 3 FOR MULTIPLICATION  |\n";
    cout<<" |     PRESS 4 FOR DIVISION        |\n";
    cout<<" |*********************************|\n";
     cout<<"|Enter your choice: ";
    int ch;
    cin>>ch;
    
    
    switch(ch)
    {
    	
    	case 1:
    
        {
        	cout<<"addition of "<<a<<"and "<<b<<"is:"<<a+b;
            break;
		}
    
    case 2:
    
        {
        	cout<<"subtraction of "<<a<<"and "<<b<<"is:"<<a-b;
            break;
		}
    
    case 3:
    
        {
        	cout<<"multiplication of "<<a<<"and "<<b<<"is:"<<a*b;
            break;

		}    
    case 4:
    {
	
        if(b>0)
        {
            cout<<"division of "<<a<<"and "<<b<<"is:"<<a/b;
        break;
        }
        else
        {
            cout<<"ERROR! Try Again :(";
        }
        break;
    }
        default:
    {
	
        cout<<"Invalid Choice";
        break;
    }

	
//	return 0;
   }
}

    //return 0;
    
}
