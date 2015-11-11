#include <iostream>
#include <cstdio>

using namespace std;

int main() {

	int k, m, n, x, y;

	while (scanf("%d", &k), k != 0) {

		cin >> m >> n;
		while (k--) {

			cin >> x >> y;

			if (x == m || y == n)
				cout << "divisa" << endl;
			else if (y > n) {

				if (x > m) cout << "NE" << endl;
				else cout << "NO" << endl;

			} else {

				if (x > m) cout << "SE" << endl;
				else cout << "SO" << endl;
			}

		}

	}

	return 0;
}

