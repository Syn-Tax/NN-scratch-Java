import java.util.Random;

public class Neuron {
  int inputSize;

  double output;
  private double[] inputWeights;
  private double bias;

  public Neuron(int inputSize) {
    this.inputSize = inputSize;
    this.inputWeights = new double[inputSize];

    Random rand = new Random();

    for (int i = 0; i < inputSize; i++) {
      inputWeights[i] = rand.nextDouble();
    }
    this.bias = rand.nextDouble();
  }

  public double forward(double[] inputActivations) {
    double activation = 0;

    for (int i = 0; i < inputWeights.length; i++) {
      activation += inputWeights[i] * inputActivations[i];
    }

    activation += bias;

    return activation;
  }

  public void setInputWeights(double[] inputWeights) {
    this.inputWeights = inputWeights;
  }

  public double[] getInputWeights() {
    return this.inputWeights;
  }
}
