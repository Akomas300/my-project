package Week_1.Day_1;

public class What_Is_IDE {
    /*   What is IDE?

  Imagine you're an artist. You could technically paint on any surface
  using any kind of brush or even your fingers, but having a proper
  canvas, easel, and a set of brushes makes the job a whole lot easier
  and more organized. Similarly, when you're writing Java code
  (or code in other languages), you could use a basic text editor,
  but an Integrated Development Environment (IDE) like Eclipse,
  IntelliJ offers a much more powerful and convenient workspace. */

    public static void main(String[] args) {
        int count = 0;
        int[] numbers = {5, 7, 9, 34, 86, 32, 98, 75, 9, 8, 1, 507, 884, 33, 223, 9};
        int max = numbers[0];
        for (int number : numbers) {
            // System.out.print(number + " ");
            if (number > max) {
                max = number;
                count++;
            }

        }
        System.out.println();
        System.out.println(max);
        // System.out.println(count);

    }
}
