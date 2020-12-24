#include<iostream>
using namespace std;

int multiply(int a,int b)
{
    int c = a*b;
 return c;
}

int add(int a,int b)
{
    int c = a + b;
 return c;
}

int subtract(int a,int b)
{
    int c = b - a;
 return c;
}

int divide(int a,int b)
{
    int c = b / a;
 return c;
}

void printmessage(){
    cout<<"see you soon";
}

void printtableofN(int n){

 for(int i=1;i<=10;i++){

    cout<< to_string(n) + " X " + to_string(i)+ " = " + to_string(n * i)<< endl; 

   }
}
void printtabletillM(int m){
for( int i=1; i<=m;i++){
    printtableofN(i);
    cout<<endl;
}

} 
void oddEven(int n){
  int c = n % 2;
  if(c==0){
    cout<<n<<" -> even"<<endl;
  }
  else {
    cout<<n<<" -> odd"<<endl;
  }
}

void serialorderoddeven(int m){
     for(int i = 1;i <= m; i++){
         oddEven(i);
        
      }
}

void arrayoddeven(int *h){
  int a[100],len;
  for(int i=1;*h!='\0';i++){
     *h++;
     len++;

  }
}

void randomoddeven(int x){
    int a;       
    for(int i = 1; i <= x; i++){
        cin>> a;
        oddEven(a);
        
    }
}
bool isprime_(int n){
    bool prime = true;
    for(int i = 2; i*i <= n; i++){
        if(n % i == 0){
            prime =false;
            break;
        }
    }
    return prime;

}

void isprime(){
    int n;
    cin >> n;
    bool ans = isprime_(n);
    
    if(ans) cout<<"prime"<<endl;
    else cout<<"not prime"<<endl;
}

void primetillN(int low,int high){
  for(int i = low; i <= high; i++){
   bool ans = isprime_(i);
    if(ans) cout<<i<<" is prime";
  
  else{
    cout<<i<<" is not prime";
  }
}
}
int countdigits(int n){
  int count = 0;
  while(n != 0){
    n /= 10;
    count++;
  }
}
int digitsofNumber(int n){
    
}

void reverse(int n){
    while(n != 0){
        int lastDigit = n % 10;
        n /= 10;
        
        cout << lastDigit << endl;
    }
}

int reverseNumber(int n){
    int ans = 0;
    while(n != 0){
        int lastDigit = n % 10;
        n /= 10;
        
        ans = ans * 10 + lastDigit;
    }

    return ans;
}


void fibonaccitillN(int n){               // starting from 0
  int x = 0, y = 1;
  cout<< x <<endl<< y <<endl;
  for(int i = 1; i < n - 1 ; i++){
    int c = x + y;
    x = y;
    y = c; 
    cout<< c <<endl;
  }
}


void fibonaccifromN(int p, int q, int n){     // starting from a particular number 'p', goes till 'n' digits.
   cout<< p << endl << q << endl;
   
   for(int i = 1; i < n - 1 ; i++){
      int c = p + q;
      p = q;
      q = c; 
      cout<< c << endl;
    }
  
}

int main()
{
// cout<<"Hello"<<endl;
// cout<<"Pepcoders"<<endl;    

//   int a,b;
//   cin>> a >> b; 
//    cout<< multiply(a,b) <<endl;
//     cout<< add(a,b) <<endl;
//     cout<< subtract(a,b) <<endl;
//     cout<< divide(a,b) <<endl;
//   printmessage();

// printtableofN(8);

int y ;
cin >>y;
// printtabletillM(y);
// randomoddeven(y);
serialorderoddeven(54);
//manyoddeven(a);
// fibonaccitillN(y);
// fibonaccifromN(5,8,9);
return 0;
}