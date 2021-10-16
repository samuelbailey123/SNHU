#include <cstdlib>
#include <string>
#include <iostream>

using namespace std;

//vulnerability in these variables below
const char *clints[5] = { "Bobby boy", "Sara davy", "Amy lastname","Johnny Smithy", "Carol Speary" };
    
int services[5] = {1,2,2,1,1};

int samsFunction(){
    cout << "Hello, I\'m sam this is me inserting things into the cpp file";
}

int CheckUserPermissionAccess(){
    string user_name = "";
    string password = "";
    cout<<"Enter Your User Name"<<endl;
    cin>>user_name; //vulnerability here at this input
     cout<<"Enter Your Password"<<endl;
     cin>>password; //vulnerability here at this input
     if(password == "123"){ //hardcoded password here
         return 0;
     }
     return 1;
}

//not really a vulnerability but could be written better... to much redundency 
int DisplayInfo(){
    int num1 = services[1];
    cout<<"1. "<<clints[0]<<"Selected Option "<<num1<<endl;
    int num2 = services[2];
    cout<<"2. "<<clints[1]<<"Selected Option "<<num2<<endl;
    int num3 = services[3];
    cout<<"3. "<<clints[2]<<"Selected Option "<<num3<<endl;
    int num4 = services[4];
    cout<<"4. "<<clints[3]<<"Selected Option "<<num4<<endl;
    int num5 = services[5];
    cout<<"5. "<<clints[4]<<"Selected Option "<<num5<<endl;
}

void ChangeCustomerChoice(){
    int newChoice = 0;
    cout<<"Enter the number of the client that you wish to change"<<endl;
    cin>>newChoice; //input vulnerability
    cout<<"Please Enter The Clients new Service(1 = Brokerage, 2 = Retirement)"<<endl;
    int newService = 0;
    cin>>newService;
    services[newChoice-1] = newService;
}

int main(int argc, char** argv) {
    int answer = CheckUserPermissionAccess();
    while(answer == 1){
        cout<<"Invalid Password. Please try again"<<endl;
        answer = CheckUserPermissionAccess();
    }

    
    cout<<"What would you Like To do"<<endl;
    int choice = 0;
    while(choice != 3){
        cout<<"What would you Like to do"<<endl;
        cout<<"Display The client list (enter 1)"<<endl;
        cout<<"Change a client's choice (enter 2)"<<endl;
        cout<<"Exit (enter 3)"<<endl;
        cin>>choice; //input vulnerability
    if(choice == 1){
        cout<<"You Chose 1"<<endl;
        DisplayInfo();
    }else if(choice == 2){
        cout<<"You Chose 2"<<endl;
        ChangeCustomerChoice();
    }else if(choice == 3){
        cout<<"You Chose 3"<<endl;
    }
    return 0;
    }
}   