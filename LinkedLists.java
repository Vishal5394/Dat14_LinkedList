package com.BridgeLabz.LinkedList;

import java.util.LinkedList;
import java.util.List;


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
				        System.out.println("\n Sequence of linked list: ");
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
				    public void search(Integer data) {
				        boolean flag = false;
				        int i = 1;
				        Node current = head;
				        if (head == null) {
				            System.out.println("empty");
				        }
				        while (current != null) {
				            if (current.data == data) {
				                System.out.println("found");
				                flag = true;
				                break;
				            }
				            i++;
				            current = current.next;
				        }
				        if (flag) {
				            System.out.println("element is present at:" + i);
				        } else {
				            System.out.println("element is absent");
				        }
				    }
				    public void insertAfter(Node prev_node, int newdata) {
				        if (prev_node == null) {
				          System.out.println("The given previous node cannot be null");
				          return;
				        }
				        Node new_node = new Node(newdata);
				        new_node.next = prev_node.next;
				        prev_node.next = new_node;
				      }
				    public void deleteNode(int position) {
				        if (head == null)
				          return;

				        Node temp = head;

				        if (position == 0) {
				          head = temp.next;
				          return;
				        }
				        for (int i = 0; temp != null && i < position - 1; i++)
				          temp = temp.next;
				        if (temp == null || temp.next == null)
				          return;

				          Node next = temp.next.next;

				        temp.next = next;
				      }
				    public void sortList(){
				        Node current = head, Position = null;
				        int temp;
		
				        if (head == null) {
				            return;
				        }
				        else {
				            while (current != null) {
				            	Position = current.next;
				            	  
				                while (Position != null) {
				                	 if (current.data > Position.data) {
				                         temp = current.data;
				                         current.data = Position.data;
				                         Position.data = temp;
				                     }
				   
				                	 Position = Position.next;
				                 }
				                 current = current.next;
				             }
				         }
	                }
			
				    
				
					public static void main(String[] args) {
						  LinkedLists linkedList= new LinkedLists();
						 linkedList.addNode(56);
						 linkedList.addNode(70);							  
						 linkedList.insert( linkedList.head, 30);
						 linkedList.search(30);
						 linkedList.insertAfter(linkedList.head.next, 40);
						 linkedList.display();	
						  linkedList.sortList();
						 						 					  
						  linkedList.display();	  			
					}
}
		      