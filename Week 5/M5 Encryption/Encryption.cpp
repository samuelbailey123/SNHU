#include <cassert>
#include <fstream>
#include <iomanip>
#include <iostream>
#include <sstream>
#include <ctime>

using namespace std;
/// <summary>
/// encrypt or decrypt a source string using the provided key
/// </summary>
/// <param name="source">input string to process</param>
/// <param name="key">key to use in encryption / decryption</param>
/// <returns>transformed string</returns>
string encrypt_decrypt(const string& source, const string& key){
  // get lengths now instead of calling the function every time.
  // this would have most likely been inlined by the compiler, but design for perfomance.
  const int key_length = key.length();
  const int source_length = source.length();

  // assert that our input data is good
  assert(key_length > 0);
  assert(source_length > 0);

  string output = source;

  // loop through the source string char by char
  for (size_t i = 0; i < source_length; ++i){
    output[i] = source[i] ^ key[i % key_length];
  }

  assert(output.length() == source_length);

  return output;
}

string read_file(const string& filename){
  string file_text = "Samuel Bailey\nThis is my test string";
  ifstream ifile(filename);
  getline(ifile, file_text, '\0');
  return file_text;
}

string get_student_name(const string& string_data){
  string student_name;
  size_t pos = string_data.find('\n');
  if (pos != string::npos){
    student_name = string_data.substr(0, pos);
  }
  return student_name;
}

void save_data_file(const string& filename, const string& student_name, const string& key, const string& data){
  ofstream outdata;
  outdata.open("output.txt");
  time_t now = time(0);
  outdata << student_name + "\n" + to_string(now) + "\n" + key + data;
  outdata.close();
}

int main(){
  cout << "Encyption Decryption Test!" << endl;

  // input file format
  // Line 1: <students name>
  // Line 2: <Lorem Ipsum Generator website used> https://pirateipsum.me/ (could be https://www.lipsum.com/ or one of https://www.shopify.com/partners/blog/79940998-15-funny-lorem-ipsum-generators-to-shake-up-your-design-mockups)
  // Lines 3+: <lorem ipsum generated with 3 paragraphs> 
  //  Fire in the hole bowsprit Jack Tar gally holystone sloop grog heave to grapple Sea Legs. Gally hearties case shot crimp spirits pillage galleon chase guns skysail yo-ho-ho. Jury mast coxswain measured fer yer chains man-of-war Privateer yardarm aft handsomely Jolly Roger mutiny.
  //  Hulk coffer doubloon Shiver me timbers long clothes skysail Nelsons folly reef sails Jack Tar Davy Jones' Locker. Splice the main brace ye fathom me bilge water walk the plank bowsprit gun Blimey wench. Parrel Gold Road clap of thunder Shiver me timbers hempen halter yardarm grapple wench bilged on her anchor American Main.
  //  Brigantine coxswain interloper jolly boat heave down cutlass crow's nest wherry dance the hempen jig spirits. Interloper Sea Legs plunder shrouds knave sloop run a shot across the bow Jack Ketch mutiny barkadeer. Heave to gun matey Arr draft jolly boat marooned Cat o'nine tails topsail Blimey.

  const string file_name = "inputdatafile.txt";
  const string encrypted_file_name = "encrypteddatafile.txt";
  const string decrypted_file_name = "decrytpteddatafile.txt";
  const string source_string = read_file(file_name);
  const string key = "password";

  // get the student name from the data file
  const string student_name = get_student_name(source_string);

  // encrypt sourceString with key
  const string encrypted_string = encrypt_decrypt(source_string, key);

  // save encrypted_string to file
  save_data_file(encrypted_file_name, student_name, key, encrypted_string);

  // decrypt encryptedString with key
  const string decrypted_string = encrypt_decrypt(encrypted_string, key);

  // save decrypted_string to file
  save_data_file(decrypted_file_name, student_name, key, decrypted_string);

  cout << "Read File: " << file_name << " - Encrypted To: " << encrypted_file_name << " - Decrypted To: " << decrypted_file_name << endl;
}