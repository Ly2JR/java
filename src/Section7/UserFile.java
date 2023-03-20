package Section7;

import java.io.File;

public class UserFile {
    public static void main(String[] args) {
        File f=new File("export/home/d.java");
        System.out.println("The file is exists?-->"+f.exists());
        System.out.println("The file can write?-->"+f.canWrite());
        System.out.println("The file can read?-->"+f.canRead());
        System.out.println("The file is a file?-->"+f.isFile());
        System.out.println("The file is a directory?-->"+f.isDirectory());
        System.out.println("The file is absolute path?-->"+f.isAbsolute());
        System.out.println("The file's name is -->"+f.getName());
        System.out.println("The file's path is -->"+f.getPath());
        System.out.println("The file's absolute path is-->"+f.getAbsolutePath());
        System.out.println("The file's parent path is-->"+f.getParent());
        System.out.println("The file's last modifered time is-->"+f.lastModified());
        System.out.println("The file's  length is -->"+f.length());

        File newFile=new File("newFile");
        f.renameTo(newFile);
        System.out.println("\tRename the file to:"+newFile.getName());
        System.out.println(f+"is exists?--->"+f.exists());
        newFile.delete();

        System.out.println("Delete "+newFile+"....");
        System.out.println(newFile+"is exists?--->"+f.exists());
    }
}
