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

 public Filme_IF remove(long id) throws Exception {
    Filme_IF[] removedElement = {null};  // Array usado para armazenar o elemento removido
    root = remove(root, id, removedElement);  // Remove e balanceia a árvore
    if (removedElement[0] == null) throw new Exception("Elemento não encontrado");
    return removedElement[0];
}

private Node remove(Node node, long id, Filme_IF[] removedElement) {
    if (node == null) return null;
    if (id < node.filme.getID() ) {
        node.left = remove(node.left, id, removedElement);
    } else if (id > node.filme.getID()) {
        node.right = remove(node.right, id, removedElement);
    } else {
        removedElement[0] = node.filme;  // Salva o elemento a ser removido

        if (node.left == null || node.right == null) {
            node = (node.left != null) ? node.left : node.right;
        } else {
            Node temp = getMinValueNode(node.right);
            node.filme = temp.filme;
            node.right = remove(node.right, temp.filme.getID(), removedElement);
        }
    }

    if (node == null) return null;

    node.height = 1 + Math.max(height(node.left), height(node.right));
    return balance(node);
}

private Node getMinValueNode(Node node) {
    Node current = node;
    while (current.left != null) {
        current = current.left;
    }
    return current;
}
    @Override
    public void insert(Filme_IF elemento) {
        root = insertRec(root, elemento);
        size++;
    }

    private Node insertRec(Node node, Filme_IF elemento) {
        if (node == null) {
            return new Node(elemento);
        }

        if (elemento.getID() < node.filme.getID()) {
            node.left = insertRec(node.left, elemento);
        } else if (elemento.getID() > node.filme.getID()) {
            node.right = insertRec(node.right, elemento);
        }

        // Atualiza a altura do nó atual
        node.height = 1 + Math.max(height(node.left), height(node.right));

        // Balanceia o nó
        return balance(node);
    }

    private int height(Node node) {
        return node == null ? 0 : node.height;
    }

    // Retorna o fator de balanceamento de um nó
    private int getBalance(Node node) {
        return node == null ? 0 : height(node.left) - height(node.right);
    }

    // Balanceia a árvore AVL a partir do nó fornecido
    private Node balance(Node node) {
        int balance = getBalance(node);

        // Caso 1: Desbalanceamento para a esquerda
        if (balance > 1 && getBalance(node.left) >= 0) {
            return rotateRight(node);
        }

        // Caso 2: Desbalanceamento para a direita
        if (balance < -1 && getBalance(node.right) <= 0) {
            return rotateLeft(node);
        }

        // Caso 3: Desbalanceamento Esquerda-Direita
        if (balance > 1 && getBalance(node.left) < 0) {
            node.left = rotateLeft(node.left);
            return rotateRight(node);
        }

        // Caso 4: Desbalanceamento Direita-Esquerda
        if (balance < -1 && getBalance(node.right) > 0) {
            node.right = rotateRight(node.right);
            return rotateLeft(node);
        }

        return node; // Nó já está balanceado
    }

    private Node rotateRight(Node y) {
        Node x = y.left;
        Node T2 = x.right;

        // Rotaciona para a direita
        x.right = y;
        y.left = T2;

        // Atualiza as alturas
        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        return x;
    }

    private Node rotateLeft(Node x) {
        Node y = x.right;
        Node T2 = y.left;

        // Rotaciona para a esquerda
        y.left = x;
        x.right = T2;

        // Atualiza as alturas
        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        return y;
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
        return height(root);
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
            list.add(node.filme);
            preOrderRec(node.left, list);
            preOrderRec(node.right, list);
        }
    }

    @Override
    public Filme_IF[] order() {
        List<Filme_IF> list = new ArrayList<>();
        inOrderRec(root, list);
        return list.toArray(new Filme_IF[0]);
    }

    private void inOrderRec(Node node, List<Filme_IF> list) {
        if (node != null) {
            inOrderRec(node.left, list);
            list.add(node.filme);
            inOrderRec(node.right, list);
        }
    }

    @Override
    public Filme_IF[] postOrder() {
        List<Filme_IF> list = new ArrayList<>();
        postOrderRec(root, list);
        return list.toArray(new Filme_IF[0]);
    }

    private void postOrderRec(Node node, List<Filme_IF> list) {
        if (node != null) {
            postOrderRec(node.left, list);
            postOrderRec(node.right, list);
            list.add(node.filme);
        }
    }
}

