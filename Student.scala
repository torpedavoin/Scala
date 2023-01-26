class Student(name:String, surname:String, age:Int, email:String, addr:Address, var login:String, var password:String,
              var balance:Double, var fiat:Double, var smartcontrakt:Smartcontrakt ) extends Human(name, surname, age, email, addr) with  TraitBirga
              {
                private var _login:String = login
                private var _password:String = password
                private var _balance:Double = balance
                private var _fiat:Double = fiat
                private var _smartcontrakt:Smartcontrakt = smartcontrakt





                def Login:String = _login
                def Login(newValue:String): Unit = {
                  _login=newValue
                }
                def Password:String = _password
                def Password(newValue:String): Unit = {
                  _password=newValue
                }
                def Balance:Double = _balance
                def set_balance(newValue:Double, birga:Birrga): Unit = {
                  if(newValue<0){
                    var reserv = newValue.abs
                    var toup:(Double, Double) = buy(reserv, birga, _balance, _fiat)
                    _balance=toup._1
                    _fiat=toup._2
                  }
                  else{
                    _balance=newValue
                  }
                }
                def Fiat:Double = _fiat
                def set_fiat(newValue:Double): Unit = {
                  _fiat=newValue
                }
                def Smartcontrakt:Smartcontrakt = _smartcontrakt
                def Smartcontrakt(newValue:Smartcontrakt): Unit = {
                  _smartcontrakt=newValue
                }

                override def toString: String = super.toString() + s", ${_balance}" + s", ${_fiat}" + s", ${_smartcontrakt}"

                override def Show(): String = super.Show() + s"\nBalance: ${_balance}\n" + s"\nFiat: ${_fiat}\n" + s"Smartcontrakt: ${_smartcontrakt.toString}\n"
}
