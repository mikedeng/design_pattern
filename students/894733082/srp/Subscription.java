package com.coderising.ood.srp;

import java.util.List;
public class Subscription {
	private Product product
	private Customer customer

	public static List<Subscription> getMailingList() {
		sendMailQuery = "Select name, email from subscriptions "
				+ "where product_id= '" + productID +"' "
				+ "and send_mail=1 ";
		System.out.println("loadQuery set");
		return new List<Subscription>()
	}

	public void send_promotion_email {
		String subject = "您关注的产品降价了";
		String message = "尊敬的 " + this.customer.name + ", 您关注的产品 " + this.product.productDesc + " 降价了，欢迎购买!" ;
		SendEmailService.send(this.customer.email, subject, message)
	}
}