package ua.hillellit;

import ua.hillellit.model.FileNavigator;

public class Main {

  public static void main(String[] args) {
    FileNavigator fn = new FileNavigator();
    fn.add("src\\ua\\hillellit\\resources\\pack1\\part1.txt");
    fn.add("src\\ua\\hillellit\\resources\\pack1\\part2.txt");
    fn.add("src\\ua\\hillellit\\resources\\pack2\\part3.txt");
    fn.add("src\\ua\\hillellit\\resources\\pack2\\part4.txt");
    fn.add("src\\ua\\hillellit\\resources\\part5.txt");
    fn.add("src\\ua\\hillellit\\resources\\part6.txt");

    System.out.println(fn.find("src\\ua\\hillellit\\resources"));
    System.out.println(fn.filterBySize(1160));
    System.out.println(fn.sortBySize());
    fn.remove("src\\ua\\hillellit\\resources\\pack2");
    System.out.println(fn.sortBySize());

  }
}