##fileio


Task                                        | Time
--------------------------------------------|----------------------
Copy a file byte-by-byte                    | 6.160393 sec
Copy a file using a byte array of size 1KB  | 0.019852 sec
Copy a file using a byte array of size 4KB  | 0.008117 sec
Copy a file using a byte array of size 64KB | 0.003668 sec
Copy a file one lines of text               | 0.151950 sec


###Explain why some copy methods are faster or slower than others


>The `Copy a file byte-by-byte` is **slowest** because it has to read byte-by-byte until end. 

>Then `Copy a file using BufferedReader and PrintWriter to copy lines of text` is **slower than** Copy a file using a byte of size of an array because the BufferedReader will read the whole one line and then it will have a process to change from byte into String, by change from byte into byte[], then into char, next is char[], and then String (byte>byte[]>char>char[]>String) , So it take a long time to do that.

>And **the fastest** is `Copy a file using a byte of size of an array`, This will read by byte as we has input, likes we input the blocksize is 1024 so it will read all of it immediately, unlike Copy a file byte-by-byte that it will read byte-by-byte.

