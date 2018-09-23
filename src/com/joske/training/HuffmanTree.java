package com.joske.training;

import com.joske.training.enums.HuffmanTreePart;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract class HuffmanTree implements Comparable<HuffmanTree> {

  protected int frequency;
  protected HuffmanTreePart treePart;

  @Override
  public int compareTo(HuffmanTree frequency) {
    return this.frequency - frequency.frequency;
  }
}
