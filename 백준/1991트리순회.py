
class Node:
    def __init__(self, data, left_node, right_node):
        self.data = data
        self.left = left_node
        self.right = right_node


def preorderTraversal(node):
    print(node.data, end='')
    if node.left != '.':
        preorderTraversal(tree[node.left])
    if node.right != '.':
        preorderTraversal(tree[node.right])


def inorderTraversal(node):
    if node.left != '.':
        inorderTraversal(tree[node.left])
    print(node.data, end='')
    if node.right != '.':
        inorderTraversal(tree[node.right])


def postorderTraversal(node):
    if node.left != '.':
        postorderTraversal(tree[node.left])
    if node.right != '.':
        postorderTraversal(tree[node.right])
    print(node.data, end='')


def solution(tree):

    preorderTraversal(tree['A'])
    print()
    inorderTraversal(tree['A'])
    print()
    postorderTraversal(tree['A'])


if __name__ == '__main__':
    N = int(input())
    tree = {}

    for _ in range(N):
        node, left_node, right_node = map(str, input().split())
        tree[node] = Node(node, left_node, right_node)

    solution(tree)