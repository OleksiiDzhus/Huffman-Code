package com.joske.training;

import com.joske.training.enums.HuffmanTreePart;
import lombok.Data;

@Data
public class HuffmanNode extends HuffmanTree {

  public static final char LEFT_NODE_CODE = '0';
  public static final char RIGHT_NODE_CODE = '1';

  private HuffmanTree leftSubTree;
  private HuffmanTree rightSubTree;

  public HuffmanNode(HuffmanTree leftSubTree, HuffmanTree rightSubTree) {
    super(leftSubTree.frequency + rightSubTree.frequency, HuffmanTreePart.NODE);
    this.leftSubTree = leftSubTree;
    this.rightSubTree = rightSubTree;
  }

}
