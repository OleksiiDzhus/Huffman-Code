import com.joske.training.utils.CodesPrinter;
import com.joske.training.utils.HuffmanTreeBuilder;
import com.joske.training.HuffmanTree;

public class Main {

  public static void main(String[] args) {
    String testString = "AAAAAAAAAAAAAAAAAAAAAAAAABBBBBBBBBBBBBBBBBBBBBBBBBCCCCCCCCCCCCDDDDDDDDDDDEEEEEEEEEEFFGG";

    HuffmanTreeBuilder huffmanTreeBuilder = new HuffmanTreeBuilder(testString);
    HuffmanTree tree = huffmanTreeBuilder.buildTree();

    System.out.println("SYMBOL\tFREQ\tHUFFMAN CODE");
    CodesPrinter printer = new CodesPrinter();
    printer.printCodes(tree, new StringBuffer());
  }

}
