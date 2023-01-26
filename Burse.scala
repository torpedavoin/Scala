class Birrga {
  private var _quantity_token:Double = 1000000
  private var _quantity_fiat:Double = 1000000
  private var _price:Double = 1.0

  def get_quantity_tokens:Double = _quantity_token
  def set_quantity_tokens(NewValue:Double): Unit = {
    _quantity_token = NewValue
  }
  def get_quantity_fiat:Double = _quantity_fiat
  def set_quantity_fiat(NewValue:Double): Unit = {
    _quantity_fiat = NewValue
  }
  def get_price:Double = _price
  def set_price(NewValue:Double): Unit = {
    _price = NewValue
  }

  override def toString: String = super.toString + s", ${_quantity_token}" + s", ${_quantity_fiat}" + s", ${_price}"

  def Show(): String = s"\nQuantity tokens: ${_quantity_token}\n" + s"Amount fiat: ${_quantity_fiat}\n" + s"Price_token: ${_price}\n"
}
