

class Node(val proxv: Node, val valuev: Int) {
  var prox: Node = proxv 
  var value: Int = valuev
  
  def setValue(valuev:Int){
    value = valuev
  }
  
  def getValue() : Int = {
    return value
  }
  
  def setNodeProx(nodep : Node){
    this.prox = nodep
  }
  
  def getNodeProx() : Node = {
    return this.prox
  }
  
  def addNode(headn : Node, nodea : Node) : Node = {
    if(headn != null){
      nodea.prox = headn
    }
    return nodea
  }
  
  def goThrList(headn : Node){
    var aux = headn
    while(aux!=null){
      aux.printNode()
      aux = aux.prox
    }
  }
  
  def getIElement(head: Node, i : Int) : Node = {
    var aux = head
    var j = 0
    while((aux!=null)&&(j<i)){
      aux = aux.prox
      j = j + 1
    }
    if(j<=i){ 
      return aux
    } else {
      return null
    }
  }
  
  def rmElement(headn : Node, valuef : Int) : Node = {
    var aux_prev = headn
    var aux_next : Node = null
    var aux : Node = null
    if(aux_prev!=null){
      aux_next = aux_prev.prox 
    } else {
      return null
    }
    if(aux_prev.value == valuef ){
      return aux_prev.prox
    } else {
      while(aux_next!=null){
        if(aux_next.value == valuef){
          aux_prev.prox = aux_next.prox
          return headn
        }
        aux = aux_next
        aux_next = aux_next.prox
        aux_prev = aux
      }
    }
    return headn
  }
  
  def printReversList(head : Node){
    if(head.prox!=null){
      printReversList(head.prox)
    } 
    head.printNode()
  }
  
  def printNode(){
    println(this.value)
  }
}