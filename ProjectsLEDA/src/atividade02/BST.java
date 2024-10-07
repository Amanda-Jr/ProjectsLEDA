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
        if (id < node.filme.getID()) {
            node.left = removeRec(node.left, id);
        } else if (id > node.filme.getID()) {
            node.right = removeRec(node.right, id);
        } else {
           
            if (node.left == null) {
                return node.right;
            } else if (node.right == null) {
                return node.left;
            }

        
            node.filme = findMin(node.right);
            node.right = removeRec(node.right, node.filme.getID());
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
        if (elemento.getID() < node.filme.getID()) {
            node.left = insertRec(node.left, elemento);
        } else if (elemento.getID() > node.filme.getID()) {
            node.right = insertRec(node.right, elemento);
        }
        return node;
    }

   @Override
    public boolean isEmpty() {
        return root == null;
    }

    @Override
    public Filme_IF search(long id) throws Exception {
        Node node = searchRec(root, id);
        if (node == null) {
            throw new Exception("Filme não encontrado.");
        }
        return node.filme;
    }

    private Node searchRec(Node node, long id) {
        if (node == null || node.filme.getID() == id) {
            return node;
        }
        if (id < node.filme.getID()) {
            return searchRec(node.left, id);
        }
        return searchRec(node.right, id);
    }

    @Override
    public Filme_IF root() throws Exception {
        if (root == null) {
            throw new Exception("Árvore vazia.");
        }
        return root.filme;
    }

    @Override
    public int height() {
        return heightRec(root);
    }

    private int heightRec(Node node) {
        if (node == null) {
            return -1;
        }
        return 1 + Math.max(heightRec(node.left), heightRec(node.right));
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isComplete() {
        return isCompleteRec(root, 0, size);
    }

    private boolean isCompleteRec(Node node, int index, int numberNodes) {
        if (node == null) {
            return true;
        }
        if (index >= numberNodes) {
            return false;
        }
        return isCompleteRec(node.left, 2 * index + 1, numberNodes) &&
               isCompleteRec(node.right, 2 * index + 2, numberNodes);
    }

    @Override
    public Filme_IF[] preOrder() {
        List<Filme_IF> list = new ArrayList<>();
        preOrderRec(root, list);
        return list.toArray(new Filme_IF[0]);
    } 

    private void preOrderRec(Node node, List<Filme_IF> list) {
        if (node != null) {
            list.add(node.filme);}
    }

	@Override
	public Filme_IF[] order() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Filme_IF[] postOrder() {
		// TODO Auto-generated method stub
		return null;
	}
}
