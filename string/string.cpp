#include <iostream>
#include <vector>

using namespace std;

bool isPalindrome(string str)
{
    int si = 0, ei = str.length() - 1;
    while (si < ei)
    {
        if (str[si++] != str[ei--])
            return false;
    }

    return true;
}

void getAllSubstrings(string str)
{
    for (int i = 0; i < str.length(); i++)
    {
        for (int len = 1; i + len <= str.length(); len++)
        {
            cout << (str.substr(i, len));
        }
    }
}

string compression1(string str)
{
    if (str.length() <= 1)
        return str;
    string ans = "";
    ans += str[0];

    for (int i = 1; i <= str.length(); i++)
    {
        int count = 1;
        while (i < str.length() && str[i-1] == str[i])
        {
            count++;
            i++;
        }

        // if (count != 1)
        //     ans += to_string(count);
        if (i < str.length())
            ans += str[i];
    }

    return ans;
}

string compression2(string str)
{
    if (str.length() <= 1)
        return str;
    string ans = "";
    ans += str[0];

    for (int i = 1; i <= str.length(); i++)
    {
        int count = 1;
        while (i < str.length() && str[i-1] == str[i])
        {
            count++;
            i++;
        }

        if (count != 1)
            ans += to_string(count);
        if (i < str.length())
            ans += str[i];
    }

    return ans;
}



int main()
{
    return 0;
}