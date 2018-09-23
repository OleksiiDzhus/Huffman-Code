package com.joske.training.utils;

import com.joske.training.HuffmanLeaf;
import com.joske.training.HuffmanNode;
import com.joske.training.HuffmanTree;
import com.joske.training.enums.HuffmanTreePart;

public class CodesPrinter {

  public void printCodes(HuffmanTree tree, StringBuffer prefix) {
    HuffmanTreePart treePart = tree.getTreePart();

    switch (treePart) {
      case LEAF:
        HuffmanLeaf leaf = (HuffmanLeaf) tree;
        System.out.println(leaf.getValue() + "\t" + leaf.getFrequency() + "\t" + prefix);
        break;
      case NODE:
        HuffmanNode node = (HuffmanNode) tree;
        traverseNode(node, prefix);
    }
  }


  private void traverseNode(HuffmanNode node, StringBuffer prefix) {
    traverseLeft(node, prefix);
    traverseRight(node, prefix);
  }

  private void traverseLeft(HuffmanNode node, StringBuffer prefix) {
    prefix.append(HuffmanNode.LEFT_NODE_CODE);
    printCodes(node.getLeftSubTree(), prefix);
    prefix.deleteCharAt(prefix.length() - 1);
  }

  private void traverseRight(HuffmanNode node, StringBuffer prefix) {
    prefix.append(HuffmanNode.RIGHT_NODE_CODE);
    printCodes(node.getRightSubTree(), prefix);
    prefix.deleteCharAt(prefix.length() - 1);
  }
}
