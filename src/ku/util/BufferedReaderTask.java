package ku.util;

public class BufferedReaderTask extends FileCopyTask{
	
	public BufferedReaderTask(String infilename, String outfilename) {
		super(infilename, outfilename);
	}
	
	public void run() {
		FileUtil.bcopy(in, out);
	}
	
	public String toString() {
		return "Copy a file using BufferedReader and PrintWriter to copy lines of text";
	}

}
