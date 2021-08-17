#include <iostream>
#include <stdlib.h>

using namespace std;

void displayMenu();
int main() {
    displayMenu();
    int input;
    cin >> input;
    while(input != 4){
        if(input == 1){
            int input1;
            int input2;
            cout << input1 << " + " << input2 << " = " << input1 + input2 << endl;
        }else if(input == 2){
            int input3; 
            int input4;
            cout << input3 << " - " << input4 << " = " << input3 - input4 << endl;
        }else if(input == 3){
            int input5;
            int input6;
            cout << input5 << " * " << input6 << " = " << input5 * input6 << endl;
        }else if(input == 4){
            exit(0);
        }
    }
}

void diplayMenu(){
    cout << "----------------\n- 1)Add -\n- 2)Subtract -\n- 3)Multiply -\n- 4)Exit -\n----------------\n";
}