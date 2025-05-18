#include<stdio.h>
#include<stdlib.h>
struct node{
    int data;
    struct node* left;
    struct node* right;
};
struct node* createnode(int value){
    struct node* newnode=(struct node*)malloc(sizeof(struct node*));
    newnode -> data=value;
    newnode -> left =NULL;
    newnode -> right =NULL;
}
void inorder(struct node* root){
    if(root==NULL){
        return;
    }
    inorder(root->left);
    printf("%d ",root->data);
    inorder(root->right);
}
void preorder(struct node* root){
    if(root==NULL){
        return;
    }
    printf("%d ",root->data);
    preorder(root->left);
   
    preorder(root->right);
}
void postorder(struct node* root){
    if(root==NULL){
        return;
    }
    
    postorder(root->left);
    postorder(root->right);
    printf("%d ",root->data);
}

int main(){
    struct node* root = createnode(1);
    root->left=createnode(2);
    root->right=createnode(3);
    printf("Inorder \n");
    inorder(root);
    printf("\n");
    printf("preorder \n");
    preorder(root);
    printf("\n");
printf("postorder \n");
    postorder(root);
    printf("\n");

    return 0;
}
