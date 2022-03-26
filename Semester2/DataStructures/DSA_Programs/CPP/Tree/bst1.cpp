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
    root = insertion(root, 3);
    root = insertion(root, 4);
    root = insertion(root, 5);
    root = insertion(root, 6);
    root = insertion(root, 7);
    root = insertion(root, 8);
    root = insertion(root, 9);
    
    Node* current = root;
    while(current->left != NULL){
        current = root->left;
    }
    cout<<"Smallest: "<<current->data<<endl;
    
    current = root;
    while(current->right != NULL){
        current = root->right;
    }
    cout<<"largest: "<<current->data;
    return 0;
}
