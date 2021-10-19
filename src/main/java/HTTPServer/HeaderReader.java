package HTTPServer;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;

public final class HeaderReader {

  private HeaderReader() {
  }

  public static HashMap<String, String> readHeaders(InputStream is) throws IOException {
    HashMap<String, String> headers = new HashMap<>();
    boolean keepReading = true;
    int read;
    try (InputStreamReader isr = new InputStreamReader(is, StandardCharsets.US_ASCII)) {
      while (keepReading) {
        read = isr.read();
        if (read == -1) {
          keepReading = false;
        } else {
          char c = (char) read;
          // todo
        }
      }

    }
    return headers;

  }
}