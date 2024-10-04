package atividade02;

import java.util.ArrayList;
import java.util.List;

public class BST implements BST_IF {

    private class Node {
        Filme_IF filme;
        Node left, right;

        public Node(Filme_IF filme) {
            this.filme = filme;
            this.left = null;
            this.right = null;
        }
    }

    private Node root;
    private int size;

    public BST() {
        this.root = null;
        this.size = 0;
    }

    @Override
    public Filme_IF remove(long id) throws Exception {
        root = removeRec(root, id);
        return null;
    }

    private Node removeRec(Node node, long id) throws Exception {
        if (node == null) {
            throw new Exception("Filme não encontrado.");
        }
        if (id < node.filme.getId()) {
            node.left = removeRec(node.left, id);
        } else if (id > node.filme.getId()) {
            node.right = removeRec(node.right, id);
        } else {
           
            if (node.left == null) {
                return node.right;
            } else if (node.right == null) {
                return node.left;
            }

        
            node.filme = findMin(node.right);
            node.right = removeRec(node.right, node.filme.getId());
        }
        return node;
    }

    private Filme_IF findMin(Node node) {
        while (node.left != null) {
            node = node.left;
        }
        return node.filme;
    }

    @Override
    public void insert(Filme_IF elemento) {
        root = insertRec(root, elemento);
        size++;
    }

    private Node insertRec(Node node, Filme_IF elemento) {
        if (node == null) {
            node = new Node(elemento);
            return node;
        }
        if (elemento.getId() < node.filme.getId()) {
            node.left = insertRec(node.left, elemento);
        } else if (elemento.getId() > node.filme.getId()) {
            node.right = insertRec(node.right, elemento);
        }
        return node;
    }

