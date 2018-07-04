/*
You are given two non-empty linked lists representing two non-negative integers.
The digits are stored in reverse order and each of their nodes contain a single digit.
Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Example

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807.
 */

public class addLinkLists {

    public Node addLists(Node firstList, Node secondList)
    {
        int lengthOfA = lengthOfList(firstList);
        int lengthOfB = lengthOfList(secondList);

        while(lengthOfA > lengthOfB)
        {
            secondList = addValueToEndOfList(secondList,0);
            lengthOfB++;
        }

        while(lengthOfB > lengthOfA)
        {
            firstList = addValueToEndOfList(firstList,0);
            lengthOfA++;
        }

        int carry = 0;

        Node a = firstList;
        Node b = secondList;

        Node result = null;

        for(int i = 0; i < lengthOfA; i++)
        {
            int partialSum = a.value + b.value + carry;

            result = addValueToEndOfList(result, partialSum % 10);
            carry = partialSum / 10;

            a = a.next;
            b = b.next;
        }

        if(carry > 0)
            result = addValueToEndOfList(result, carry);

        return result;
    }

    public int lengthOfList(Node list)
    {
        if(list == null)
            return 0;

        int count = 0;
        while(list != null)
        {
            list = list.next;
            count++;
        }

        return count;
    }

    public Node addValueToEndOfList(Node list, int value)
    {
        if(list == null)
            return new Node(value);

        Node head = list;
        Node temp = list;
        while(temp.next != null)
        {
            temp = temp.next;
        }

        temp.next = new Node(value);

        return head;
    }
}

