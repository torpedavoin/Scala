class Smartcontrakt(var profit:Int, var period:Int, var percentage_part:Int) {
  private var _profit: Int = profit
  private var _period: Int = period
  private var _percentage_part: Int = percentage_part

  override def toString: String = s"Прибуток: ${_profit}, Период навчання: ${_period}, Нагорода: ${_percentage_part}"

  def Profit: Int = _profit

  def Profit(newValue: Int): Unit = {
    _profit = newValue
  }

  def Period: Int = _period

  def Period(newValue: Int): Unit = {
    _period = newValue
  }

  def Percentage_part: Int = _percentage_part

  def Percentage_part(newValue: Int): Unit = {
    _percentage_part = newValue
  }

}
