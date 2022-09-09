public class Layer {

  Neuron[] neurons;
  int size;

  public Layer(int inputSize, int size) {
    this.size = size;

    this.neurons = new Neuron[size];
    for (int i = 0; i < size; i++) {
      neurons[i] = new Neuron(inputSize);
    }
  }

  public double[] forward(double[] inputActivations) {
    double[] activations = new double[this.size];
    for (int i = 0; i < size; i++) {
      activations[i] = neurons[i].forward(inputActivations);
    }

    return activations;
  }
}
