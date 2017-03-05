package ku.util;

public class BlockCopyTask extends FileCopyTask{
	private int blockSize;
	private int numberOfSize = 1024;

	
	public BlockCopyTask(String infilename, String outfilename, int blockSize) {
		super(infilename, outfilename);
		this.blockSize = blockSize;
	}
	
	
	public String getSizeBlock() {
		String sizeBlock = "";
		if (blockSize == numberOfSize) {
			sizeBlock = "1KB";
		}
		if (blockSize == numberOfSize * 4) {
			sizeBlock = "4KB";
		}
		if (blockSize == numberOfSize * 64) {
			sizeBlock = "64KB";
		}
		return sizeBlock;
	}
	
	public void run() {
		FileUtil.copy(in, out, blockSize);
	}
	
	public String toString() {
		return "Copy a file using a byte array of size " + getSizeBlock();
	}
	
	

}
