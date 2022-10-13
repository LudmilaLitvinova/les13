package ua.hillellit.model;

import java.util.Comparator;

public class SizeComparator implements Comparator<FileData> {

  @Override
  public int compare(FileData o1, FileData o2) {
    return (int)(o1.size- o2.size);
  }
}
