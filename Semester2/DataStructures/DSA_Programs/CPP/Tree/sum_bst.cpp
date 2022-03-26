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

int sum = 0;
void inorder(Node *root){
    if(root == NULL)
        return;
    sum += root->data;
    inorder(root->left);
    cout<<root->data<<" ";
    inorder(root->right);
}

int main()
{
    Node *root = NULL;
    root = insertion(root, 8);
    root = insertion(root, 10);
    root = insertion(root, 6);
    root = insertion(root, 12);
    cout<<"Elements Present in BST (Inorder): "<<endl;
    inorder(root);
    cout<<endl<<"sum: "<<sum<<endl;
    return 0;
}
