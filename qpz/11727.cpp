#include <iostream>

using namespace std;

int main() {

	int t, x, y, z, p;

	cin >> t;
	for (int i = 1; i <= t; i++) {

		cin >> x >> y >> z;

		if (x > y)
			if (y > z) p = y;
			else if (x > z) p = z;
			else p = x;
		else
			if (x > z) p = x;
			else if (y > z) p = z;
			else p = y;

		cout << "Case " << i << ": " << p << endl;
	}

	return 0;
}
