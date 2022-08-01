#include<iostream>
#include <string>
using namespace std;
int main(){
    string s; cin>>s;
    string ans="";
    string vowelC="AEIOU";
    string vowelS="aeiou";
    for(int i=0;i<s.length();i++){
        if(s[i] > 'A' && s[i] < 'Z'){
            int f = vowelC.find(s[i]);
            if(f != string::npos){
                f = (f+1) % (vowelC.length());
                ans += vowelC[f];
            }
            else ans += s[i];
        }
        else {
            int f = vowelS.find(s[i]);
            if(f != string::npos){
                f = (f+1)%vowelS.length();
                ans+=vowelS[f];
            }
            else ans += s[i];
        }
    }
    cout << ans << "\n";
    return 0;
}