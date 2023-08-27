import java.io.File;
//        Write a program to list all the files and directories of D:\. If
//        the file in consideration is a directory then display all the
//        files and directories also.
public class Main{
    public static void main(String[] args){
        File f=new File("/");
        if(f.isDirectory()){
            File[] s=f.listFiles();
            for(int i=0;i<s.length;i++){
                String p="E:\\RCOEM 4TH Semester\\Java VSC (Errors)\\practice\\src"+s[i];
                File a=new File(p);
                System.out.println(a.getName());
            }
        }
    }
}