#include <algorithm>
#include <string>
#include <iostream>
 
 using namespace std;
int main()
{
	int n;
	cin>>n;
	string s;
	while(n-->0){
	    cin>>s;
	    sort(s.begin(), s.end());
	    do {
	        cout << s << '\n';
	    } while(next_permutation(s.begin(), s.end()));
    }
}