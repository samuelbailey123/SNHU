#include "clock.h"
//Class implementation
//Default constructor
Clock::Clock() {
   hours = minutes = seconds = 0;
}
//Parameterized constructor
Clock::Clock(int hrs, int mnts, int secs) {
   setHours(hrs);
   setMinutes(mnts);
   setSeconds(secs);
}
//Setters
void Clock::setHours(int hrs){
   if (hrs > 23) {
       hours = 0;
   }
   else {
       hours = hrs;
   }
};
void Clock::setMinutes(int mnts) {
   if (mnts > 59) {
       minutes = mnts;
       seconds += 1;
       if (seconds > 59) {
           seconds = seconds - 60;
           minutes += 1;
       }
       if (minutes > 59) {
           hours += 1;
           minutes = minutes - 60;
       }
       if (hours > 23) {
           hours = 0;
       }
   }
   else {
       minutes = mnts;
   }
}
void Clock::setSeconds(int secs) {
   if (secs > 59) {
       seconds = secs - 60;
       minutes += 1;
       if (minutes > 59) {
           hours += 1;
           minutes = minutes - 60;
       }
       if (hours > 23) {
           hours = 0;
       }
   }
   else {
       seconds = secs;
   }
}
//Getters
int Clock::getHrs() {
   return hours;
}
int Clock::getMinutes() {
   return minutes;
}
int Clock::getSeconds() {
   return seconds;
}
//Display 24 format
void Clock::display24format() {
   if (hours < 10 || minutes < 10 || seconds < 10) {
       if (hours < 10) {

           cout << "0" << hours;
       }
       else {
           cout << hours;
       }
       if (minutes < 10) {
           cout << ":0" << minutes;
       }
       else {
           cout << ":" << minutes;
       }
       if (seconds < 10) {
           cout << ":0" << seconds;
       }
       else {
           cout << ":" << seconds;
       }
   }
   else {
       cout << hours << ":" << minutes << ":" << seconds;
   }
}
//Display 12 format
void Clock::display12format() {
   if (hours > 12) {
       hours = hours - 12;
       if (hours < 10 || minutes < 10 || seconds < 10) {
           if (hours < 10) {
               cout << "0" << hours;
           }
           else {
               cout << hours;
           }
           if (minutes < 10) {
               cout << ":0" << minutes;
           }
           else {
               cout << ":" << minutes;
           }
           if (seconds < 10) {
               cout << ":0" << seconds << " PM";
           }
           else {
               cout << ":" << seconds << " PM";
           }
       }
       else {
           cout << hours << ":" << minutes << ":" << seconds << " PM";
       }
   }
   else if (hours == 12) {
       hours = 12;
       if (hours < 10 || minutes < 10 || seconds < 10) {
           if (hours < 10) {
               cout << "0" << hours;
           }
           else {
               cout << hours;
           }
           if (minutes < 10) {
               cout << ":0" << minutes;
           }
           else {
               cout << ":" << minutes;
           }
           if (seconds < 10) {
               cout << ":0" << seconds << " PM";
           }
           else {
               cout << ":" << seconds << " PM";
           }
       }
       else {
           cout << hours << ":" << minutes << ":" << seconds << " PM";
       }
   }
   else if (hours == 0) {
       hours = 12;
       if (hours < 10 || minutes < 10 || seconds < 10) {
           if (hours < 10) {
               cout << "0" << hours;
           }
           else {
               cout << hours;
           }
           if (minutes < 10) {
               cout << ":0" << minutes;
           }
           else {
               cout << ":" << minutes;
           }
           if (seconds < 10) {
               cout << ":0" << seconds << " AM";
           }
           else {
               cout << ":" << seconds << " AM";
           }
       }
       else {
           cout << hours << ":" << minutes << ":" << seconds << " AM";
       }
   }
   else {
       if (hours < 10 || minutes < 10 || seconds < 10) {
           if (hours < 10) {
               cout << "0" << hours;
           }
           else {
               cout << hours;
           }
           if (minutes < 10) {
               cout << ":0" << minutes;
           }
           else {
               cout << ":" << minutes;
           }
           if (seconds < 10) {
               cout << ":0" << seconds << " AM";
           }
           else {
               cout << ":" << seconds << " AM";
           }
       }
       else {
           cout << hours << ":" << minutes << ":" << seconds << " AM";
       }
   }
}
//Increment hour 1
void Clock::incrementHr() {
   hours += 1;
   setHours(hours);
}
//Increment minute1
void Clock::incrementMinute() {
   minutes += 1;
   setMinutes(minutes);
}
//Increment second
void Clock::incrementSec() {
   seconds += 1;
   setSeconds(seconds);
}
