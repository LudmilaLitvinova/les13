package ua.hillellit.model;

import java.io.File;


public class FileData {

  private String name;
  private long size;
  private String path;

  public FileData(String path) {
    File f = new File(path);
    if (f.exists() && f.isFile()) {
      this.name = f.getName();
      this.size = f.length();
      this.path = f.getParent();
    } else {
      System.out.println("It is not path to the file");
    }
  }

  @Override
  public String toString() {
    return "FileData{" +
        "name='" + name + '\'' +
        ", size=" + size +
        ", path='" + path + '\'' +
        '}';
  }

  public String getName() {
    return name;
  }

  public long getSize() {
    return size;
  }

  public String getPath() {
    return path;
  }
}
