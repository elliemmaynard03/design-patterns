package singleton;

public enum Difficulty {
    EASY("singleton/three.txt"), MEDIUM("singleton/four.txt"), HARD("singleton/five.txt");

    public final String fileName;

    private Difficulty(String fileName) {
        this.fileName = fileName;
    }
}
