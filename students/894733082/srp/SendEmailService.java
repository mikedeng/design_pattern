package com.coderising.ood.srp;
public class SendEmailService {
	public static void send(from, to, subject, message, mainHost, altHost){
		Configuration config = new Configuration();
		String mainHost      = config.getProperty(ConfigurationKeys.SMTP_SERVER);
		String altHost       = config.getProperty(ConfigurationKeys.ALT_SMTP_SERVER);
		String from          = config.getProperty(ConfigurationKeys.EMAIL_ADMIN);
		Email email          = new Email(from, to, subject, message);
		try
		{
				email.setHost(mainHost);
				email.send();
		}
		catch (Exception e)
		{
			try {
				email.setHost(altHost);
				email.send();
			} catch (Exception ex){
				System.out.println("通过备用 SMTP服务器发送邮件失败: " + ex.getMessage());
			}
		}
	}
}