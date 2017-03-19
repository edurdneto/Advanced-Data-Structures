

class NodeDouble (override val proxv: Node, override val valuev: Int, prevv : NodeDouble ) extends Node(proxv,valuev) {
  var prev = prevv
  
  def addNode(headn : NodeDouble, nodea : NodeDouble) : NodeDouble = {
    if(headn == null){
      nodea.prox = nodea
      nodea.prev = nodea
    } else {
      nodea.prox = headn
      nodea.prev = headn.prev
      headn.prev.prox = nodea
      headn.prev = nodea
    }
    return nodea
  }
  
  def goThrList(headn : NodeDouble){
    var aux : Node = headn
    if(aux!=null){
      aux.printNode()
      aux = aux.prox
      while((aux.equals(headn))!=true){
        aux.printNode()
        aux = aux.prox
      }
    }
  }
}