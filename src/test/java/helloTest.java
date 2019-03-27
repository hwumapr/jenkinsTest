import org.hamcrest.CoreMatchers;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.*;
import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;


public class helloTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void sampleTest() throws IOException
    {
        assert(true);
    }


    @Test
    public void testHelloMainPrintsSecretWithSecret() throws IOException {

        helloworld.main(new String[]{"Poop"});

        System.setOut(new PrintStream(new FileOutputStream(FileDescriptor.out)));

        System.out.println(outContent.toString());
        Assert.assertThat(outContent.toString(), CoreMatchers.containsString("hello world!"));

        Assert.assertThat(outContent.toString(), CoreMatchers.containsString("Poop"));

    }

    @Test
    public void testHelloMainDoesntPrintSecretWithoutSecret() throws IOException{
        helloworld.main(new String[]{});

        System.setOut(new PrintStream(new FileOutputStream(FileDescriptor.out)));

        System.out.println(outContent.toString());

        Assert.assertThat(outContent.toString(), CoreMatchers.containsString("hello world!"));
        Assert.assertThat(outContent.toString(), CoreMatchers.not(CoreMatchers.containsString("Poop")));


    }
}
