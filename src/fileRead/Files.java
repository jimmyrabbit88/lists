package fileRead;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Files {
    public static void main(String[] args) {
        String filename = "C:\\Users\\t00175979\\IdeaProjects\\Jason Dowling\\Res\\hamlet.txt";
        Set<String> names = new HashSet<>();

        try{
            Scanner in = new Scanner(new File(filename));
            int lineNumber = 1;
            while (in.hasNext()){
                Scanner lineParser = new Scanner(in.nextLine());
                lineParser.useDelimiter("[^A-Za-z0-9]+");
                while(lineParser.hasNext()){
                    String identifier = lineParser.next();
                    names.add(identifier);
                }
            }
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        Iterator<String> iter = names.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
        System.out.println(names.size());

        //Maps

        Map<String, List<Integer>> index = new HashMap();

        try{
            Scanner in = new Scanner(new File(filename));
            int lineNumber = 1;
            while (in.hasNext()){
                Scanner lineParser = new Scanner(in.nextLine());
                lineParser.useDelimiter("[^A-Za-z0-9]+");
                while(lineParser.hasNext()){
                    String identifier = lineParser.next();

                    index.put(identifier, );
                }
                lineNumber++;
            }
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }

        Set<String> keySet = index.keySet();
        for(String k : keySet){
            Integer line = index.get(k);
            System.out.println(k + " :: " + line);
        }
    }
}
