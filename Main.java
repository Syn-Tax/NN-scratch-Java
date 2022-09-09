public class Main {
  public static void main(String[] args) {
    double[] inputs = { 0.5 };
    Layer fc1 = new Layer(1, 3);
    double[] activations = fc1.forward(inputs);

    for (double i : activations) {
      System.out.println(i);
    }
  }
}