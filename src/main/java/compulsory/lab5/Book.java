package compulsory.lab5;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Book implements Item {
    private Integer id;
    private String name;
    private String path;

    public Book() {

    }

    public Book(Integer id, String name, String path) {
        this.id = id;
        this.name = name;
        if (!Files.exists(Paths.get(new File(path).getAbsolutePath()))) {
            throw new InvalidFilePath(path);
        }
        this.path = path;
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getPath() {
        return path;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPath(String path) {
        if (!Files.exists(Paths.get(new File(path).getAbsolutePath()))) {
            throw new InvalidFilePath(path);
        }
        this.path = path;
    }

    @Override
    public String toString() {
        return "\nBook{" +
                "name='" + name + '\'' +
                ", path='" + path + '\'' +
                '}';
    }
}