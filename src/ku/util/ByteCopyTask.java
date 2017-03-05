package ku.util;

public class ByteCopyTask extends FileCopyTask{
	
	public ByteCopyTask(String infilename, String outfilename) {
		super(infilename, outfilename);
	}
	
	public void run() {
		FileUtil.copy(in, out);
	}
	
	public String toString() {
		return "Copy a file byte-by-byte";
	}

}
