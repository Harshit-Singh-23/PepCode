#include <iostream>
using namespace std;

void pattern10(int row){
    int nsp1 = row / 2, nsp2 = -1; // nsp = number of spaces,   nst = number of stars.
        for (int r = 1; r <= row; r++) {
            for (int csp = 1; csp <= nsp1; csp++) { // csp = count of spaces.
                cout<<"\t";
            }

            cout<<"*\t";

            for (int csp = 1; csp <= nsp2; csp++) { // cst = count of stars.
                
                cout<<"\t";
                
            }

            if(nsp2 != -1) cout<<"*\t";

            if (r <= row / 2) {
                nsp1--;
                nsp2+= 2;
            } else {
                nsp2-= 2;
                nsp1++;
            }

            cout<<endl;
        }
}

int main()
{
    int n;
    cin >> n;
    pattern10(n);
    return 0;
}