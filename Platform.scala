class Platform extends TraitBirga {
  private var _quantity_tokens:Double = 1000000
  private var _fiat:Double = 1000000


  def get_quantity_tokens:Double = _quantity_tokens
  def set_quantity_tokens(NewValue:Double): Unit = {
    _quantity_tokens = NewValue
  }
  def get_fiat:Double = _fiat

  def set_fiat(NewValue:Double): Unit = {
    _fiat = NewValue
  }

  override def toString: String = super.toString + s", ${_quantity_tokens}" + s", ${_fiat}"

  def Show(): String = s"\nQuantity tokens: ${_quantity_tokens}\n" + s"Fiat: ${_fiat}\n"
}
