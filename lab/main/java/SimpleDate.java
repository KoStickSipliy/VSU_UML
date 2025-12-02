package main.java;

/**
 * Класс для управления датами (упрощенный)
 */
class SimpleDate {

	private java.time.LocalDate date;

	/**
	 * 
	 * @param year
	 * @param month
	 * @param day
	 */
	public SimpleDate(int year, int month, int day) {
		this.date = java.time.LocalDate.of(year, month, day);
	}

	@Override()
	public String toString() {
		return date.getDayOfMonth() + "." + date.getMonthValue() + "." + date.getYear();
	}

}