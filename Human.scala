class Human(var name:String, var surname:String, var age:Int, var email:String, var addr:Address) {
  private var _name:String = name
  private var _surname:String = surname
  private var _age:Int = age
  private var _email:String = email
  private var _addr:Address = addr


  def Name:String = _name
  def Name(newValue:String): Unit = {
    _name=newValue
  }
  def Emaile:String = _email
  def Email(newValue:String): Unit = {
    _email=newValue
  }
  def Surname:String = _surname
  def Surname(newValue:String): Unit = {
    _surname=newValue
  }
  def Age:Int = _age
  def Age(newValue:Int): Unit = {
    if(newValue>0)
      _age=newValue
    else println("Вік не може буди негативним!")
  }
  def Address:Address = _addr
  def Address(newValue:Address): Unit = {
    _addr=newValue
  }


  override def toString: String = s"${_name}, ${_surname}, ${_age}, ${_email}, ${_addr}"

  def Show(): String = s"Name: ${_name}\nSurname: ${_surname}\nAge: ${_age}\nEmail: ${_email}\n Address: ${_addr.toString()}"

}
