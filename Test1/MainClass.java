import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class MainClass {

  public static void main (String[] args) throws IOException {
    PipedOutputStream pout = new PipedOutputStream();
    PipedInputStream pin = new PipedInputStream(pout);

    NumberProducer fw = new NumberProducer(pout, 20);
    NumberConsumer fr = new NumberConsumer(pin);
    fw.start();
    fr.start();
  }
}

class NumberProducer extends Thread {
  private DataOutputStream theOutput;
  private int howMany;

  public NumberProducer(OutputStream out, int howMany) {
    theOutput = new DataOutputStream(out);
    this.howMany = howMany;
  }

  public void run() {
    try {
      for (int i = 0; i < howMany; i++) {
        theOutput.writeInt(i);
      }
    }
    catch (IOException ex) { System.err.println(ex); }
  }
}

 class NumberConsumer extends Thread {

  private DataInputStream theInput;

  public NumberConsumer(InputStream in) {
    theInput = new DataInputStream(in);
  }

  public void run() {

    try {
      while (true) {
        System.out.println(theInput.readInt());
      }
    }
    catch (IOException ex) {
      if (ex.getMessage().equals("Pipe broken")
        || ex.getMessage().equals("Write end dead")) {
        // normal termination
        return;
      }
      ex.printStackTrace();
    }
  }
}