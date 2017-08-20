package MSys;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CountWords {
	static List<String> allFilesList = new LinkedList<String>();
	static Map<String, Integer> wordMap = new LinkedHashMap();
	static boolean allFilesRead = false;

	public static void main(String[] args) {

		if (args.length < 2) {
			System.out.println("Please provide all input arguments in following format:");
			System.out
					.println("countWords <Number of Highest occuring words> <Directories or files seperated by space>");
		} else {
			Set<String> inputList = new HashSet<String>();

			int maxWords = 0;
			try {
				maxWords = Integer.parseInt(args[0]);
			} catch (NumberFormatException e) {
				System.err.println("Please enter Integer value for Number of Highest occuring words");
				return;
			}

			System.out.println("Total Words to lookout: " + maxWords);
			System.out.println("Directories/Files to lookout: ");
			for (int i = 1; i < args.length; i++) {
				inputList.add(args[i]);
			}
			System.out.println("Reading all files located under Input Directories " + inputList);

			for (String path : inputList) {
				File file = new File(path);
				if (file.isFile() && (!file.isHidden()))
					allFilesList.add(file.getPath());
				else
					readAllFilesRecursively(file, allFilesList);
			}

			// for (String file : allFilesList)
			// System.out.println(file);
			System.out.println("Total files " + allFilesList.size());
			long startTime = System.nanoTime();

			// ExecutorService service = Executors.newFixedThreadPool(10);
			// for (int i = 0; i < 100; i++) {
			// MyThread t1 = new MyThread();
			// Future future = service.submit(t1);
			// }
			// service.shutdown();
			Thread t1 = new Thread(new MyThread());
			Thread t2 = new Thread(new MyThread());
			Thread t3 = new Thread(new MyThread());
			Thread t4 = new Thread(new MyThread());
			// new MyThread().run();
			t1.run();
			t3.start();
			t4.start();
			t2.start();
			while (!allFilesRead)
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			long endTime = System.nanoTime();
			long duration = (endTime - startTime);
			System.out.println("Total Time spent " + duration);
			System.out.println(allFilesList.size());
			System.out.println(wordMap.size());

			// int i = 0;
			// Iterator<String> itr = wordMap.keySet().iterator();
			// while (itr.hasNext()) {
			// String key = itr.next();
			// System.out.println(key + " " + wordMap.get(key));
			// i++;
			// if (i > 100)
			// break;
			// }
		}
	}

	static class MyThread implements Runnable {

		public Object call() throws Exception {
			return null;
		}

		public void run() {
			while (true) {
				String file = getFile();
				if (file != null) {
					// System.out.println("Running
					// "+Thread.currentThread().getName()+" Reading "+file);
					readFile(file);
					// readActualFile(file);
				} else
					break;
				// readFile(file);
			}
		}

		public synchronized String getFile() {
			if (allFilesList.size() > 0) {
				System.out.print("");
				// System.out.println(allFilesList.size() + " " +
				// allFilesList.get(0));
				String file = allFilesList.get(0);
				allFilesList.remove(0);
				return file;
			}
			allFilesRead = true;
			System.out.println("All files read !!");
			return null;
		}

		private synchronized void readActualFile(String fileName) {
			// System.out.println(fileName);
			BufferedReader br = null;
			FileReader fr = null;

			try {
				// System.out.println("Reading: "+fileName);
				// br = new BufferedReader(new FileReader(FILENAME));
				fr = new FileReader(fileName);
				br = new BufferedReader(fr);
				String sCurrentLine;
				while ((sCurrentLine = br.readLine()) != null) {
					String temp[] = sCurrentLine.split(" ");
					for (String word : temp) {
						if (wordMap.containsKey(word)) {
							wordMap.put(word, wordMap.get(word) + 1);
						} else {
							wordMap.put(word, 1);
						}
					}
				}
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					if (br != null)
						br.close();
					if (fr != null)
						fr.close();
				} catch (IOException ex) {
					ex.printStackTrace();
				}
			}
		}

		private void readFile(String filePath) {
			File file = new File(filePath);

			try {
				readActualFile(filePath);
				// FileReader fileReader = new
				// FileReader(file.getAbsolutePath());
				// fileReader.read();
				// fileReader.close();
				// // System.out.println("Readable file: " + file.getPath());
			} catch (Exception e) {
				System.out.println(e.getMessage());
				System.err.println("exception occured during reading " + filePath);
			}
		}

	}

	private static void readAllFilesRecursively(File file, List<String> allFilesList2) {
		File[] list = file.listFiles();
		if (list == null)
			return;
		for (File tempFile : list) {
			if (tempFile.isDirectory()) {
				
				if (tempFile.getName().startsWith(".") || tempFile.getName().equals("target")) {
					System.out.println("Skip folder " + tempFile.getName());
					continue;
				}
				readAllFilesRecursively(tempFile, allFilesList2);
			} else {
				if (!tempFile.exists()) {
					System.out.println("File not exist");
					continue;
				}
				if (!tempFile.canRead()) {
					System.out.println("Unable to read file.");
					continue;
				}
				if (tempFile.isHidden()) {
					// System.out.println("hidden file.");
					continue;
				}
				if (tempFile.getName().endsWith("jar") || tempFile.getName().startsWith("\\.")) {
					continue;
				}
				if (tempFile.getName().endsWith(".py"))
					allFilesList2.add(tempFile.getPath());
			}
		}

	}

}
