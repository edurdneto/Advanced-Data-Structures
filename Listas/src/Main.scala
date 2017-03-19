

object Main {
  def main(args: Array[String]) {
    /*val node1 = new Node(null,10)
    val node2 = new Node(null,20)
    val node3 = new Node(null,30)
    var list : Node = node1
    var head : Node = null
    head = list.addNode(head,node1)
    //list.goThrList(head)
    head = list.addNode(head,node2)
    //list.goThrList(head)
    head = list.addNode(head,node3)
    list.goThrList(head)
    list.printReversList(head)  
      */
    val node1 = new NodeDouble(null,10,null)
    val node2 = new NodeDouble(null,20,null)
    val node3 = new NodeDouble(null,30,null)
    var list : NodeDouble = node1
    var head : NodeDouble = null
    head = list.addNode(head, node1)
    head = list.addNode(head, node2)
    head = list.addNode(head, node3)
    list.goThrList(head)
   }
}