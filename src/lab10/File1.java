package lab10;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class File1 {
	public static void main(String args[]) throws Exception {
		CreateFile();
	}

	static void CreateFile() {
		try {

			String pathname = "C:/Users/Dell/Desktop/myfile.txt";

			File file = new File(pathname);
			file.createNewFile();

			System.out.println("File Created successflly!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static void CheckFileExist() {
		String pathname = "C:/Users/Dell/Desktop/myfile.txt";
		File file = new File(pathname);

		if (file.exists()) {
			System.out.println("File alread exists!!");
		} else {
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	static void DeleteFile() {
		String pathname = "C:/Users/Dell/Desktop/myfile.txt";
		File file = new File(pathname);

		if (file.exists()) {
			file.delete();
			System.out.println("file delete succssfully");
		} else {
			System.out.println("File does not exists!!");
		}
	}

	static void FolderCheck() {
		String pathname = "C:/Users/Dell/Desktop/myfile.txt";
		File file = new File(pathname);

		if (file.isDirectory()) {
			System.out.println("Its Directory!!");
		} else {
			System.out.println("Its not directory!!");
		}
	}

	static void CreateDirectory() {
		String pathname = "C:/Users/Dell/Desktop/myfile.txt";

		File file = new File(pathname);

		if (!file.exists()) {
			file.mkdir();
			System.out.println("Directory created successfully!!");
		} else {
			System.out.println("Directory already exists!!");
		}
	}

	static void DeleteFolder() {
		String pathname = "C:/Users/Dell/Desktop/myfile.txt";

		File file = new File(pathname);

		if (file.exists()) {
			file.delete();
			System.out.println("Deleted Succssefully!");
		}
	}

	static void Write() throws FileNotFoundException {
		String pathname = "C:/Users/Dell/Desktop/myfile.txt";
		File file = new File(pathname);

		PrintWriter pw = new PrintWriter(file);
		pw.append("Hellooooo\n");
		pw.append("World \n");
		pw.append("Hellooooo\n");
		pw.append("World\n");
		pw.append("Hellooooo\n");
		pw.append("World");

		pw.flush();
		pw.close();
	}

	static void Read() throws FileNotFoundException {
		String pathname = "C:/Users/Dell/Desktop/myfile.txt";
		File file = new File(pathname);

		Scanner scanner = new Scanner(file);

		while (scanner.hasNextLine()) {
			String line = scanner.nextLine();
			System.out.println(line);
		}

		scanner.close();
	}
}
