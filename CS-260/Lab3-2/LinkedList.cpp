//============================================================================
// Name        : LinkedList.cpp
// Author      : Samuel Bailey
// Version     : 1.0
// Copyright   : Copyright © 2017 SNHU COCE
// Description : Lab 3-3 Lists and Searching
//============================================================================

#include <algorithm>
#include <iostream>
#include <time.h>

#include "CSVparser.hpp"

 using namespace std;

//============================================================================
// Global definitions visible to all methods and classes
//============================================================================

// forward declarations
double strToDouble(string str, char ch);

// define a structure to hold bid information
struct Bid {
    string bidId; // unique identifier
    string title;
    string fund;
    double amount;
    Bid() {
        amount = 0.0;
    }
};

// //============================================================================
// // Linked-List class definition
// //============================================================================

/**
 * Define a class containing data members and methods to
 * implement a linked-list.
 */
class LinkedList {

private:
    // FIXME (1): Internal structure for list entries, housekeeping variables
    //struct for Node to hold the next and tail for the linked list
    struct Node {
        Bid bid;
        Node* next;
        Node* tail;
    	Node() { //points the next node to null so it doesn't spring random errors
    		next = nullptr;
        }
        Node(Bid bid) { 
        	bid = bid;
        	next = nullptr;
        }
    };
    //variables/pointers for the front and back of the list and the size counter that will be called later on
    Node* head;
    Node * tail;
    int size;

public:
    LinkedList();
    virtual ~LinkedList();
    void Append(Bid bid);
    void Prepend(Bid bid);
    void PrintList();
    void Remove(string bidId);
    Bid Search(string bidId);
    int Size();
};

/**
 * Default constructor
 */
LinkedList::LinkedList() {
    // FIXME (2): Initialize housekeeping variables
    //setting variables to null and zero to avoid errors
    head = nullptr;
    tail = nullptr;
    size = 0; 
}

/**
 * Destructor
 */
LinkedList::~LinkedList() {
}

/**
 * Append a new bid to the end of the list
 */
void LinkedList::Append(Bid bid){
    // FIXME (3): Implement append logic
    //append function that first creates a new node, then checks the front of the node to see if it is null(empty) 
    //if it's empty then it adds the bid into the head(since it's empty) if not then it adds to the end
    Node* node = new Node(bid);
	if(head == nullptr) {
		head = node;
	}else{
		if(tail != nullptr) {
			tail->next = node;
		}
	}
	tail = node;
	size++;
}
/**
 * Prepend a new bid to the start of the list
 */
void LinkedList::Prepend(Bid bid) {
    // FIXME (4): Implement prepend logic
    //this puts the node bid at the beginning of the list and replaces the head with the bid 
    Node* node = new Node(bid); 
    if (head != nullptr){
        node->next = head; 
    }    
    head = node; 
    size++;
}

/**
 * Simple output of all bids in the list
 */
void LinkedList::PrintList() {
    // FIXME (5): Implement print logic
    //just a simple print loop,
    Node* cNode = head;
    while (cNode != nullptr){
        cout << cNode->bid.bidId << " | " << cNode->bid.title << " | " << cNode->bid.fund << " | " << cNode->bid.amount << endl;
        cNode = cNode -> next;
    }
}
/**
 * Remove a specified bid
 *
 * @param bidId The bid id to remove from the list
 */
void LinkedList::Remove(string bidId) {
    // FIXME (6): Implement remove logic
    //function takes in the Id to delete, function checks to see if it's the head is the bid to be deleted. If not 
    //then it moves on to loop through the rest of the list to find the bid to be deleted. 
    if(head != nullptr){
		if(head->bid.bidId == bidId){
			Node* temp = head->next;
			delete head;
			head = temp;
		}
	}
	Node* cNode = head;
		while(cNode->next != nullptr){
			if(cNode->next->bid.bidId == bidId){
				Node* currTmpNode = cNode->next;
				cNode->next = currTmpNode->next;
				delete currTmpNode;
				return;
			}
			cNode = cNode->next;
		}
}
/**
 * Search for the specified bidId
 *
 * @param bidId The bid id to search for
 */
Bid LinkedList::Search(string bidId) {
    // FIXME (7): Implement search logic
    //this function returns whatever bid was passed into the function, if it doesn't exist then it prints out that it couldn't find it
    //there is an open path that doens't have a return as well, this path should have some sort of return but im not sure what to put. 
    //it doesn't have any compile errors so I left it. 
    Node* cNode = head; 
    while(cNode != nullptr){
        if (cNode->bid.bidId == bidId){
            return cNode->bid; 
        }
        cNode = cNode->next; 
    }
    cout << "Could not find bid" << endl;
    //return; 
}

/**
 * Returns the current size (number of elements) in the list
 */
int LinkedList::Size() {
    return size;
}

//============================================================================
// Static methods used for testing
//============================================================================

/**
 * Display the bid information
 *
 * @param bid struct containing the bid info
 */
void displayBid(Bid bid) {
    cout << bid.bidId << ": " << bid.title << " | " << bid.amount
         << " | " << bid.fund << endl;
    return;
}

/**
 * Prompt user for bid information
 *
 * @return Bid struct containing the bid info
 */
Bid getBid() {
    Bid bid;

    cout << "Enter Id: ";
    cin.ignore();
    getline(cin, bid.bidId);

    cout << "Enter title: ";
    getline(cin, bid.title);

    cout << "Enter fund: ";
    cin >> bid.fund;

    cout << "Enter amount: ";
    cin.ignore();
    string strAmount;
    getline(cin, strAmount);
    bid.amount = strToDouble(strAmount, '$');

    return bid;
}

/**
 * Load a CSV file containing bids into a LinkedList
 *
 * @return a LinkedList containing all the bids read
 */
void loadBids(string csvPath, LinkedList *list) {
    cout << "Loading CSV file " << csvPath << endl;

    // initialize the CSV Parser
    csv::Parser file = csv::Parser(csvPath);

    try {
        // loop to read rows of a CSV file
        for (int i = 0; i < file.rowCount(); i++) {

            // initialize a bid using data from current row (i)
            Bid bid;
            bid.bidId = file[i][1];
            bid.title = file[i][0];
            bid.fund = file[i][8];
            bid.amount = strToDouble(file[i][4], '$');

            //cout << bid.bidId << ": " << bid.title << " | " << bid.fund << " | " << bid.amount << endl;

            // add this bid to the end
            list->Append(bid);
        }
    } catch (csv::Error &e) {
        std::cerr << e.what() << std::endl;
    }
}

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

/**
 * The one and only main() method
 *
 * @param arg[1] path to CSV file to load from (optional)
 * @param arg[2] the bid Id to use when searching the list (optional)
 */
int main(int argc, char* argv[]) {

    // process command line arguments
    string csvPath, bidKey;
    switch (argc) {
    case 2:
        csvPath = argv[1];
        bidKey = "98109";
        break;
    case 3:
        csvPath = argv[1];
        bidKey = argv[2];
        break;
    default:
        csvPath = "eBid_Monthly_Sales_Dec_2016.csv";
        bidKey = "98109";
    }

    clock_t ticks;

    LinkedList bidList;

    Bid bid;

    int choice = 0;
    while (choice != 9) {
        cout << "Menu:" << endl;
        cout << "  1. Enter a Bid" << endl;
        cout << "  2. Load Bids" << endl;
        cout << "  3. Display All Bids" << endl;
        cout << "  4. Find Bid" << endl;
        cout << "  5. Remove Bid" << endl;
        cout << "  9. Exit" << endl;
        cout << "Enter choice: ";
        cin >> choice;

        switch (choice) {
        case 1:
            bid = getBid();
            bidList.Append(bid);
            displayBid(bid);

            break;

        case 2:
            ticks = clock();

            loadBids(csvPath, &bidList);

            cout << bidList.Size() << " bids read" << endl;

            ticks = clock() - ticks; // current clock ticks minus starting clock ticks
            cout << "time: " << ticks << " milliseconds" << endl;
            cout << "time: " << ticks * 1.0 / CLOCKS_PER_SEC << " seconds" << endl;

            break;

        case 3:
            bidList.PrintList();

            break;

        case 4:
            ticks = clock();

            cout << "What is the BidID: " << endl; 
            cin >> bidKey; 
            
            bid = bidList.Search(bidKey);
            

            ticks = clock() - ticks; // current clock ticks minus starting clock ticks

            if (!bid.bidId.empty()) {
                displayBid(bid);
            } else {
            	cout << "Bid Id " << bidKey << " not found." << endl;
            }

            cout << "time: " << ticks << " clock ticks" << endl;
            cout << "time: " << ticks * 1.0 / CLOCKS_PER_SEC << " seconds" << endl;

            break;

        case 5:
            bidList.Remove(bidKey);

            break;
        }
    }

    cout << "Good bye." << endl;

    return 0;
}

//Used for testing
// int main (){
//     cout << "Hello World" << endl; 
// }