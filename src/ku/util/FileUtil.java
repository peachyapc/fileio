package ku.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;

/**
 * Learn how to read and write files using Java I/O classes and catch exception.
 * 
 * @author Apichaya Tiwcharoensakul
 *
 */
public class FileUtil {

	/**
	 * Copy the InputStream to the OutputStream one byte at a time.
	 * 
	 * @param in
	 *            is the InputStream to the file to be read.
	 * @param out
	 *            is the OutputStream to the file to be written.
	 */
	static void copy(InputStream in, OutputStream out) {
		int word = 0;
		try {
			while ((word = in.read()) != -1) {
				out.write(word);
			}
			in.close();
			out.close();
		} catch (IOException e) {
			throw new RuntimeException();
		}
	}

	/**
	 * Copy the InputStream to the OutputStream using a byte array of size
	 * blocksize.
	 * 
	 * @param in
	 *            is the InputStream to the file to be read.
	 * @param out
	 *            is the OutputStream to the file to be written.
	 * @param blocksize
	 *            is a size of byte to copy at a time.
	 */
	static void copy(InputStream in, OutputStream out, int blocksize) {
		byte[] buffer = new byte[blocksize];
		try {
			while (in.read(buffer) != -1) {
				out.write(buffer);
			}
			in.close();
			out.close();
		} catch (IOException e) {
			throw new RuntimeException();
		}
	}

	/**
	 * Copy the InputStream to the OutputStream a BufferedReader to read
	 * InputStream and PrintWriter to write the OutputStrem.
	 * 
	 * @param in
	 *            is the InputStream used to read.
	 * @param out
	 *            is the OutputStream used to write.
	 */
	static void bcopy(InputStream in, OutputStream out) {
		PrintWriter print = new PrintWriter(out);
		BufferedReader read = new BufferedReader(new InputStreamReader(in));
		String getLine;
		try {
			while ((getLine = read.readLine()) != null) {
				print.write(getLine);
			}
			read.close();
			print.close();
			in.close();
			out.close();
		} catch (IOException e) {
			throw new RuntimeException();
		}
	}

}
