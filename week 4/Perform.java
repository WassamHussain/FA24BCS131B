public class Perform {
    public static void main(String args[]) {
        Library library = new Library(
            new Staff("Usman", new Address("Pakistan", "Lahore", "133"), "Librarian"),
            new Book("Cainoosh", "123abc", "10th", new Dop(21, 2, 2005), new Person("Yasim", new Address("Pakistan", "Lahore", "134"), "author")),
            "Wassam",
            new Person("Momina", new Address("Pakistan", "Karachi", "135"), "incharge")
        );
    }
}
