package ua.hillellit.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class FileNavigator {

  Map<String, List<FileData>> listMap = new HashMap<>();

  public void add(String path) {
    FileData file = new FileData(path);
    if (listMap.containsKey(file.getPath())) {
      listMap.get(file.getPath()).add(file);
    } else {
      List<FileData> newList = new ArrayList<>();
      newList.add(file);
      listMap.put(file.getPath(), newList);
    }
  }

  public List<FileData> find(String path) {
    if (listMap.containsKey(path)) {
      return listMap.get(path);
    } else {
      throw new RuntimeException("There are no files for this path.");
    }
  }

  public List<FileData> filterBySize(long size) {
    List<FileData> list = new ArrayList<>();
    for (Entry<String, List<FileData>> entry : listMap.entrySet()
    ) {
      entry.getValue().stream().filter(f -> f.getSize() <= size).forEach(f -> list.add(f));
    }
    return list;
  }

  public void remove(String path) {
    listMap.remove(path);
  }

  public List<FileData> sortBySize() {
    List<FileData> list = new ArrayList<>();
    for (Entry<String, List<FileData>> entry : listMap.entrySet()
    ) {
      entry.getValue().stream().forEach(f -> list.add(f));
    }
    list.sort(new SizeComparator());
    return list;
  }

}