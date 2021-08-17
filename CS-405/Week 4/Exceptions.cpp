// @author Samuel Bailey

#include <iostream>

using namespace std;

//custom exception to fail later on in the program to fail
struct customException : public exception{
  virtual const char *what() const throw(){
    return "my name is sam and this is an error";
  }
};

bool do_even_more_custom_application_logic(){
  throw bad_exception(); //throws an error
  cout << "Running Even More Custom Application Logic." << endl;
  return true;
}

void do_custom_application_logic(){
  cout << "Running Custom Application Logic." << endl;
  try{ //start of wrap for function below
    if(do_even_more_custom_application_logic()){
      cout << "Even More Custom Application Logic Succeeded." << endl;
    }
  }
  catch(const exception &exception){ //catch for function
    cerr << "Exception message: " << exception.what() << endl;
  }
  throw customException(); //custom excpetion to be caught in main
  cout << "Leaving Custom Application Logic." << endl;
}

float divide(float num, float den){
  if(den == 0){ //exception for dividing by zero
    throw runtime_error("come on you can't do that");
  }
  return (num / den);
}

void do_division(){
  float numerator = 10.0f;
  float denominator = 0;
  try{ //try except for dividing
    auto result = divide(numerator, denominator);
    cout << "divide(" << numerator << ", " << denominator << ") = " << result << endl;
  }catch(const exception &exception){ //catch exception for divide
    cerr << "still can't do that because: " << exception.what() << endl;
  }
}

int main(){
  cout << "Exceptions Tests!" << endl;
  try{
    do_division();
    do_custom_application_logic();
  }catch(const customException &exception){ //calling the catch defined earlier
    cerr << "Exception message: " << exception.what() << endl;
  }catch(...){}//end of wrap for main function
}