#include <iostream>
#include <cstdio>

using namespace std;

int main() {

	long h, d;
	float u, f;

	while (scanf("%ld %f %ld %f", &h, &u, &d, &f) == 4 && h) {

		double t = 0, r = u * f / 100.0;
		long c = 0;

		do {

			c++;

			t += u;
			if (t > h) break;

			u = (u - r > 0 ? u - r : 0);
			t -= d;
		} while (t >= 0);		

		if (t >= h)
			cout << "success on day " << c << endl;
		else
			cout << "failure on day " << c << endl;
	}

	return 0;
}
