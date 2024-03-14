package basicConcepts

class EuclidsAlgorithm {

    //Euclid's algorithm
    //Given two positive integers, m and n, find their greatest common divisor, that is, the largest positive integer
    //That is, the largest positive integer that evenly divides both m and n.
    fun euclidsAlgorithm(m: Int, n: Int): Int {
        if (m < 0 || n < 0) {
            throw IllegalStateException("Numbers cannot be lesser then 0")
        }

        //E0 ()
        var m1 = m;
        var n1 = n;
        var temp = 0;

        if (m1 < n1) {
            temp = m1;
            m1 = n1;
            n1 = temp;
        }

        //E1 (Find remainder)
        var remainder = m1 % n1;

        //E2(Is it zero?)
        while (remainder != 0) {
            m1 = n1;
            n1 = remainder;
            //E3 (Reduce.)
            remainder = m1%n1
        }
        return n1;
    }

}