package Ensyuu;

public class Purchase implements java.io.Serializable{
	
	private String count;
	private String payment;
	private String review;
	private String mail;
	
	public String getCount() {
		return count;
	}
	
	public String getPayment() {
		return payment;
	}
	
	public String getReview() {
		return review;
	}
	
	public String getMail() {
		return mail;
	}
	
	public void setCount(String count) {
	this.count=count;
	}
	
	public void setPayment(String payment) {
		this.payment=payment;
	}
	
	public void setReview(String review) {
		this.review=review;
	}
	
	public void setMail(String mail) {
		this.mail=mail;
	}
}
