package com.BridgeLabz.LinkedList;

import java.util.LinkedList;

import a.E.Node;

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
					public static void main(String[] args) {
						  LinkedLists linkedList= new LinkedLists();
						 //linkedList.addNode(56);
				         //linkedList.addNode(30);
						 //linkedList.addNode(70);
						  System.out.println("-----------------");
						  linkedList.addAtStart(70);
						  linkedList.addAtStart(30);
						  linkedList.addAtStart(56);
						  
						  
						  
						  linkedList.display();
						  
						  
				
				     
				    
				
					}
}
		      