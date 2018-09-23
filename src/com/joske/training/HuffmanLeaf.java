package com.joske.training;

import com.joske.training.enums.HuffmanTreePart;
import lombok.Data;

@Data
public class HuffmanLeaf extends HuffmanTree {

  private char value;

  public HuffmanLeaf(int frequency, char value) {
    super(frequency, HuffmanTreePart.LEAF);
    this.value = value;
  }
}
