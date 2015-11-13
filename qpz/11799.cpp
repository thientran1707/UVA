#include <iostream>
#include <cstdio>

using namespace std;

int main() {

	int n, m, s, c;

	cin >> n;
	for (int i = 1; i <= n; i++) {

		c = 0;

		cin >> m;
		while (m--) {

			cin >> s;
			c = (c < s ? s : c);
		}

		cout << "Case " << i << ": " << c << endl;
	}

	return 0;
}

