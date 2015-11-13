#include <iostream>
#include <cstdio>

using namespace std;

int main() {

	int n, b, h, w;
	int p, t;

	while (scanf("%d %d %d %d", &n, &b, &h, &w) == 4) {

		long a = 1e6;

		while (h--) {

			scanf("%d", &p);

			for (int i = 0; i < w; i++) {

				scanf("%d", &t);

				if (t >= n)
					a = (a > p ? p : a);
			}
		}

		if (a * n > b)
			cout << "stay home" << endl;
		else
			cout << a * n << endl;
	}

	return 0;
}
