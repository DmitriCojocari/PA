package optional.lab5.model;

import optional.lab5.exception.InvalidFilePathException;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Song implements Item {
    private String name;
    private String path;

    public Song(String name, String path) {
        this.name = name;
        if (!Files.exists(Paths.get(new File(path).getAbsolutePath()))) {
            throw new InvalidFilePathException(path);
        }
        this.path = path;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getPath() {
        return path;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public String toString() {
        return "\nSong{" +
                "name='" + name + '\'' +
                ", path='" + path + '\'' +
                '}';
    }
}