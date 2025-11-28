public class Main {
    public static void main(String[] args){
        FolderComposite root = new FolderComposite("root");
        FolderComposite docs = new FolderComposite("docs");
        docs.add(new FileLeaf("readme.txt"));
        root.add(docs);
        root.add(new FileLeaf("main.java"));
        root.show();
    }
}