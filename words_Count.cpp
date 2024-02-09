#include <iostream>
#include <string>
#include<fstream>

using namespace std;
int main()
{
	string temp;
	cout<<"Enter the name of text file you want to read without extension:\n";
	cin>>temp;
	temp = temp + ".txt";
	const char* fileName = temp.c_str();
	ifstream file(fileName);
	if(!file.is_open()){
		cout<<"file not found.\n";
		return 1;    //using instead of else.
	}
	int count = 0;
	char ch;
	while(file.get(ch)){
		if(ch == ' '){
			count++;
		}
	}
	cout<<"The number of words are:"<<count+1<<"\n";
	file.close();
	return 0;
 } 