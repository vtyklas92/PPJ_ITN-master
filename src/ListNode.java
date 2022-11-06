public class ListNode {
    int val;
         ListNode next;

         ListNode() {}
         ListNode(int val) {
             this.val = val;
         }

         ListNode(int val, ListNode next) {
             this.val = val;
             this.next = next;
         }
     }

     class mergeTwoLList {
         public static ListNode deleteDuplicates(ListNode head, ListNode head1) {

             ListNode sortedList = null;

             if (head == null) {
                 return head;
             }
             if (head1 == null) {
                 return head1;
             }


             if (head.val <= head1.val) {
                 sortedList = head;
                 head.next = deleteDuplicates(head.next, head1);
             } else {
                 sortedList = head1;
                 head1.next = deleteDuplicates(head, head1.next);
             }

             return sortedList;

         }

         static void printList(ListNode node){
             while(node != null){
                 System.out.println(node.val + " ");
                 node = node.next;
             }
         }

         public static void main(String[] args) {

             ListNode head = new ListNode(12);
             head.next = new ListNode(36);
             head.next.next = new ListNode(51);

             ListNode head1 = new ListNode(2);
             head1.next = new ListNode(4);
             head1.next.next = new ListNode(61);

             ListNode mergedLists = deleteDuplicates(head,head1);

             printList(mergedLists);

         }


         }



