//============================================================================
// Name        : Lab1-3.cpp
// Author      : Samuel Bailey
// Version     : 1.0
// Copyright   : Copyright © 2017 SNHU COCE
// Description : Lab 1-3 Up to Speed in C++
//============================================================================

#include <algorithm>
#include <iostream>

using namespace std;

//============================================================================
// Global definitions visible to all methods and classes
//============================================================================

/**
 * Simple C function to convert a string to a double
 * after stripping out unwanted char
 *
 * credit: http://stackoverflow.com/a/24875936
 *
 * @param ch The character to strip out
 */
double strToDouble(string str, char ch) {
    str.erase(remove(str.begin(), str.end(), ch), str.end());
    return atof(str.c_str());
}

// FIXME (1): Define a data structure to hold bid information together as a single unit of storage.
struct project{
    string title; 
    int fund; 
    string vehicle; 
    double amount;
};

// FIXME (4): Display the bid values passed in data structure
/**
 * Display the bid information
 *
 * @param ?type? data structure containing the bid info
 */
void displayBid(project lab) {
    cout << "Title: " << lab.title << endl;
    cout << "Fund: " << lab.fund << endl;
    cout << "Vehicle: " << lab.vehicle << endl;
    cout << "Bid Amount: " << lab.amount << endl;

    return;
}

// FIXME (3): Store input values in data structure
/**
 * Prompt user for bid information
 *
 * @return data structure containing the bid info
 */
project getBid() {

    project lab; 

    cout << "Enter title: ";
    cin.ignore();
    getline(cin, lab.title);

    cout << "Enter fund: ";
    cin >> lab.fund;

    cout << "Enter vehicle: ";
    cin.ignore();
    getline(cin, lab.vehicle);

    cout << "Enter amount: ";
    //cin.ignore();
    string strAmount;
    getline(cin, strAmount); 
    lab.amount = strToDouble(strAmount,'$');

    return lab;
}

/**
 * The one and only main() method
 */
int main() {

    // FIXME (2): Declare instance of data structure to hold bid information
	project lab; 

    // loop to display menu until exit chosen
    int choice = 0;
    while (choice != 9) {
        cout << "Menu:" << endl;
        cout << "  1. Enter Bid" << endl;
        cout << "  2. Display Bid" << endl;
        cout << "  9. Exit" << endl;
        cout << "Enter choice: ";
        cin >> choice;

        // FIXME (5): Complete the method calls then test the program
        int input;
        switch (choice) {
            case 1:
            	lab = getBid();
                break;
            case 2:
                displayBid(lab);
                break;
            case 9: 
                break;
        }
    }

    cout << "Good bye." << endl;

    return 0;
}
