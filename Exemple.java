Public class Account {

	private float currentAmount;
	private float minimumBalanceAllowed;

	public Account(float currentAmount, float allowedOverDraft) {
		this.currentAmount = currentAmount;
		this.minimumBalanceAllowed = allowedOverDraft;
	}

	public float getMinimumBalanceAllowed() {
		return this.minimumBalanceAllowed;
	}

	public void setMinimumBalanceAllowed(float minimumBalanceAllowed) {
		this.minimumBalanceAllowed = minimumBalanceAllowed;
	}

	public float getCurrentAmount() {
		return this.currentAmount;
	}

	public void setCurrentAmount(float currentAmount) {
		this.currentAmount = currentAmount;
	}

	public boolean tryToProcessPayment(float anAmount) {
		if(this.getCurrentAmount() - anAmount >= this.getMinimumBalanceAllowed()) {
			this.makePayment(anAmount);
			return true;
		} else {
			System.out.println("Not enough money :(");
			return false;
		}
	}

	protected void makePayment(float anAmount) {
		this.setCurrentAmount(this.getCurrentAmount() - anAmount);
	}
}