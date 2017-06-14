package com.coderising.ood.srp;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class PromotionMailService {
	public static void main(String[] args) throws Exception {
		List<Product> products = Product.getAllPromotionProductList();
		System.out.println("开始发送邮件");
		for(Product product : products){
			List<Subscription> mailingList = Subscription.getMailingList();
			if (mailingList != null) {
				Iterator iterator = mailingList.iterator();
				while (iterator.hasNext()) {
					Subscription subscr = iterator.next();
					subscr.send_promotion_email(product)
				}
			}else {
				System.out.println("没有要发送的邮件！");
			}

		}

		System.out.println("邮件发送完成！");
	}
}
