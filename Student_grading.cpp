#include<iostream>
#include<string>
using namespace std;
struct student{
		string name;
	string roll;
	int grades[5];
};
int main(){
	while(true)
	{
	
	struct student s;
    int total;
	float average;
	cout<<"Enter student name: ";
	cin>>s.name;
	cout<<"Enter student roll: ";
	cin>>s.roll;
	cout<<"\nEnter 5 subjects grades:\n";
	for(int i=0;i<5;i++)
	{
	cin>>s.grades[i];
    } 
	for(int i=0;i<5;i++)
	{
	total = total + s.grades[i];
	}
	average=total/5;
	cout<<"Student name: "<<s.name<<"\n";
	cout<<"Student roll: "<<s.roll<<"\n";
	cout<<"Student total grades: "<<total<<"\n";	
	cout<<"student average: "<<average<<"\n";
	int min = s.grades[0];
	for(int i=0;i<5;i++)
	{
		if(min>s.grades[i])
		{
			min = s.grades[i];
		}
	}
	cout<<"Lowest grades: "<<min<<"\n";
	int max = s.grades[0];
	for(int i=0;i<5;i++)
	{
    	if(max<s.grades[i])	
	    {
		max = s.grades[i];
	    }
	}
	cout<<"Highest grades: "<<max<<"\n\n*************\nEnter another student Data\n\n";
}
	return 0;
}