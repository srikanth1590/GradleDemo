import com.app.Encription;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EncriptionTest {
    Encription e = new Encription();

    @Test
    public void testOne() {
        assertEquals("ssk76vu", e.performEncription("abc76dd", "sri4"));
    }

    @Test
    public void testTwo() {
        assertEquals("18qyn2ams9", e.performEncription("18ind2aus9", "r2ilk4"));
    }

    @Test
    public void testThree() {
        assertEquals("rpace 34 test", e.performEncription("space 34 test", "ya 3 hi"));
    }

    @Test
    public void testFour() {
        assertEquals("yamaha77hi", e.performEncription("yamaha77hi", "1234"));
    }

    @Test
    public void testFive() {
        assertEquals("6472628472", e.performEncription("6472628472", "remo3"));
    }

    @Test
    public void testSix() {
        assertEquals("ti os a hgkc ywg zzgr thar 500 vpoflqhkrs gugts cv hss miver uvvjxvqr hc thevrhgzt cvr sbirypxvqf rtv'h pr perjctems.qi th g tewh wwh udfp hnan 500 kwtzopfsfy chipm qd cvr uvcen wrplmdvm gz hnerejctv jbm ryqffptisb tid'c op dkrfovzgu.xn wg o zest sqj cizs fvnt 500 eyihtkirdh iheco kf jbm ttkrt serhgfkt bd fvrxefovr lpt mcpdndzion pcf'j js bsflormiq.zc cb n iryt fsf ewhx iulc 500 gucjirnmgg qukck mb lpt owjpc yentibev ii iupgrlore hjv thkgmbivun ceb'l qx erdtcxmed.vv qi i hphh for zqjm npob 500*", e.performEncription("it is a test for more than 500 characters check in the given sentence so therefore the encryption can't be performed.it is a test for more than 500 characters check in the given sentence so therefore the encryption can't be performed.it is a test for more than 500 characters check in the given sentence so therefore the encryption can't be performed.it is a test for more than 500 characters check in the given sentence so therefore the encryption can't be performed.it is a test for more than 500*", "long234encription"));
    }

    @Test
    public void testSeven() {
        assertEquals("Sorry, encryption can't be performed", e.performEncription("it is a test for more than 500 characters check in the given sentence so therefore the encryption can't be performed.it is a test for more than 500 characters check in the given sentence so therefore the encryption can't be performed.it is a test for more than 500 characters check in the given sentence so therefore the encryption can't be performed.it is a test for more than 500 characters check in the given sentence so therefore the encryption can't be performed.it is a test for more than 500*1", "long234encription"));
    }

    @Test
    public void testEight() {
        assertEquals("Sorry, encryption can't be performed", e.performEncription("it is a test for more than 500 characters check in the given sentence so therefore the encryption can't be performed.it is a test for more than 500 characters check in the given sentence so therefore the encryption can't be performed.it is a test for more than 500 characters check in the given sentence so therefore the encryption can't be performed.it is a test for more than 500 characters check in the given sentence so therefore the encryption can't be performed.it is a test for more than 500 characters check in the given sentence so therefore the encryption can't be performed", "no2encription"));
    }
}
