trait TraitPlatform {
  def give(platform: Platform, price: Double): Unit = {
    var newValue = platform.get_quantity_tokens - price
    platform.set_quantity_tokens(newValue)
  }

  def get(platform: Platform, corseprice: Int): Unit = {
    var newValue = platform.get_quantity_tokens + (corseprice / 2)
    platform.set_quantity_tokens(newValue)
  }
}
