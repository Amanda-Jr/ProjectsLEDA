package atividade02;
import java.util.ArrayList;
import java.util.List;

public class AVL implements BST_IF {

    private class Node {
        Filme_IF filme;
        Node left, right;
        int height;

        public Node(Filme_IF filme) {
            this.filme = filme;
            this.height = 1; // Altura inicial é 1 quando o nó é criado
        }
    }

    private Node root;
    private int size;

    public AVL() {
        this.root = null;
        this.size = 0;
    }

    @Override
    public Filme_IF remove(long id) throws Exception {
        root = removeRec(root, id);
        return null; // Retorna null se o filme não for encontrado
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
            // Nó encontrado
            if (node.left == null || node.right == null) {
                Node temp = node.left != null ? node.left : node.right;

                if (temp == null) {
                    temp = node;
                    node = null;
                } else {
                    node = temp;
                }
            } else {
                Node temp = findMin(node.right);
                node.filme = temp.filme;
                node.right = removeRec(node.right, temp.filme.getID());
            }
        }

        if (node == null) {
            return node;
        }

        // Atualiza a altura do nó atual
        node.height = 1 + Math.max(height(node.left), height(node.right));

        // Balanceia o nó
        return balance(node);
    }
