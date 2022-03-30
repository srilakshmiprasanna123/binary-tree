package com.bridgelabz;

public class MyBinaryTreeMain {
    public static void main(String[] args) {

        System.out.println("------ Welcome to Data Structure : Binary Search Tree ------");

        MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<Integer>();
        myBinaryTree.add(56);
        myBinaryTree.add(30);
        myBinaryTree.add(70);
        myBinaryTree.add(22);
        myBinaryTree.add(60);
        myBinaryTree.add(40);
        myBinaryTree.add(95);
        myBinaryTree.add(65);
        myBinaryTree.add(11);
        myBinaryTree.add(3);
        myBinaryTree.add(16);
        myBinaryTree.add(63);
        myBinaryTree.add(67);

        myBinaryTree.printBinaryTree(63);
        System.out.println("The Size of the Binary Tree is : " + myBinaryTree.getSize());

        System.out.println(new StringBuilder().append("Is 63 present in the Binary Search Tree? ").append(myBinaryTree.printBinaryTree(63)).toString());

    }
}
