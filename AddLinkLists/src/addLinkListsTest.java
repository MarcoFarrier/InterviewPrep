import org.junit.Assert;

public class addLinkListsTest {

    @org.junit.Test
    public void addLists() {

        Node firstNumber = new Node(2);
        firstNumber.next = new Node(4);
        firstNumber.next.next = new Node(3);

        Node secondNumber = new Node(5);
        secondNumber.next = new Node(6);
        secondNumber.next.next = new Node(4);

        Node expectedResult = new Node(7);
        expectedResult.next = new Node(0);
        expectedResult.next.next = new Node(8);

        Node actualResult = new addLinkLists().addLists(firstNumber, secondNumber);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @org.junit.Test
    public void addZeroToEndOfListTest() {

        addLinkLists aLL = new addLinkLists();

        Node start = new Node(5);

        Node expected = start;
        expected.next = new Node(0);

        Node actual = aLL.addValueToEndOfList(start,0);

        Assert.assertEquals(actual, expected);
    }

    @org.junit.Test
    public void addZeroToEndOfListBiggerListTest()
    {
        addLinkLists aLL = new addLinkLists();

        Node start = new Node(5);
        start.next = new Node (4);


        Node expected = start;
        expected.next.next = new Node(0);

        Node actual = aLL.addValueToEndOfList(start,0);

        Assert.assertEquals(actual, expected);
    }
}