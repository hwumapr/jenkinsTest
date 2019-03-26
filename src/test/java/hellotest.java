import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.*;
import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;


public class hellotest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }


    @Test
    public void testHelloMainPrintsSecretWithSecret() throws IOException {

        helloworld.main(new String[]{"Poop"});

        System.setOut(new PrintStream(new FileOutputStream(FileDescriptor.out)));

        System.out.println(outContent.toString());
        assertThat(outContent.toString(), containsString("hello world!"));

        assertThat(outContent.toString(), containsString("Poop"));

    }

    @Test
    public void testHelloMainDoesntPrintSecretWithoutSecret() throws IOException{
        helloworld.main(new String[]{});

        System.setOut(new PrintStream(new FileOutputStream(FileDescriptor.out)));

        System.out.println(outContent.toString());

        assertThat(outContent.toString(), containsString("hello world!"));
        assertThat(outContent.toString(), not(containsString("Poop")));


    }
}
