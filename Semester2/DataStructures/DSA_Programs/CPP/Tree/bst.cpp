#include <iostream>
using namespace std;

struct Node
{
    int data;
    Node *left;
    Node *right;
};

Node *create(int item)
{
    Node *node = new Node;
    node->data = item;
    node->left = node->right = NULL;
    return node;
}

Node* insertion(Node* root, int item){
    if(root == NULL){
        return create(item);
    }
    if(item < root->data){
        root->left = insertion(root->left, item);
    }
    else{
        root->right = insertion(root->right, item);
    }
    return root;
}

void inorder(Node *root){
    if(root == NULL)
        return;
    inorder(root->left);
    cout<<root->data<<" ";
    inorder(root->right);
}

int main()
{
    Node *root = NULL;
    root = insertion(root, 8);
    //cout << "root's data: " << root->data << endl;
    root = insertion(root, 10);
    root = insertion(root, 6);
    root = insertion(root, 12);
    inorder(root);

    /*cout << "left's data: " << root->left->data << endl;
    cout << "right's data: " << root->right->data << endl;
    cout << "root's address: " << root << endl;
    cout << "left's address: " << root->left << endl;
    */cout << "right's address: " << root->right << endl;
    return 0;
}
