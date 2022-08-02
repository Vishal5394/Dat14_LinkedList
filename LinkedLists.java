package com.BridgeLabz.LinkedList;

import java.util.LinkedList;
import java.util.List;

import a.LinkedLists.Node;

public class LinkedLists {
				class Node {
				    int data;
				    Node next;
				
				    public Node(int data) {
				        this.data = data;
				        this.next = null;
				    }
				}
				  public Node head = null;    
				  public Node tail = null; 
				    
				  public void addNode(int data) {
				
				        Node newNode = new Node(data);
				
				        if (head == null) {
				            head = newNode;
				            tail = newNode;
				        } 
				        else {
				            tail.next = newNode;
				            tail = newNode;
				        }
				    }
				  public void display() {

				        Node current = head;

				        if (head == null) {
				            System.out.println("List is empty");
				            return;
				        }
				        System.out.println("Sequence of linked list: ");
				        while (current != null) {

				            System.out.print(current.data + "-> ");
				            current = current.next;
				        }
				        System.out.println("null");
				    }
				  public void addAtStart(int newdata) {

				        Node newNode = new Node(newdata);

				        if (head == null) {
				            head = newNode;
				            tail = newNode;
				        } else {
				            Node temp = head;

				            head = newNode;
				            head.next = temp;
				        }
				    }
				  public void append( int newdata) {
						Node newNode = new Node(newdata);
						 if (head == null) {
					            head = newNode;
					            tail = newNode;
					        } 
					        else {
					            tail.next = newNode;
					            tail = newNode;
					        }
					}
				  public void insert(Node preNode, int newdata) {
				        if (preNode == null) {
				            System.out.println("invalid");
				            return;

				        }
				        Node newNode = new Node(newdata);
				        newNode.next = preNode.next;
				        preNode.next = newNode;

				    }
				  void pop() {
				        if (this.head != null) {

				            Node temp = this.head;

				            this.head = this.head.next;

				            temp = null;
				        }

				    }
				  void popLast() {
				        if (head == null)
				            return;

				        if (head.next == null) {
				            return;
				        }

				        // Find the second last node
				        Node second_last = head;
				        while (second_last.next.next != null)
				            second_last = second_last.next;

				        // Change next of second last
				        second_last.next = null;

				        return;
				    }
					public static void main(String[] args) {
						  LinkedLists linkedList= new LinkedLists();
						 linkedList.addNode(56);
						 linkedList.addNode(70);							  
						 linkedList.insert( linkedList.head, 30);
						 linkedList.popLast();
						 						 					  
						  linkedList.display();	  			
					}
}
		      