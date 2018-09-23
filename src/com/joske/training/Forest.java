package com.joske.training;

import java.util.PriorityQueue;
import java.util.Queue;
import lombok.Data;

@Data
public class Forest {

  private Queue<HuffmanTree> trees;

  public Forest() {
    trees = new PriorityQueue<>();
  }

  public void addLeaf(HuffmanLeaf leaf) {
    trees.offer(leaf);
  }

  public HuffmanTree getSmallestTree() {
    return trees.poll();
  }

}
