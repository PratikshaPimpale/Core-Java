//B) Write a java program to display the files having extension .txt from a 
 //given directory.
 import java.io.File;
class Demo 
{
    public static void main(String[] args) 
    {
        File file = new File("D:\\java\\Slips");
        String[] fileList = file.list();
        for(String str : fileList) {
            if(str.endsWith(".txt"))
            {
                System.out.println(str);
            }
        }
    }
}
