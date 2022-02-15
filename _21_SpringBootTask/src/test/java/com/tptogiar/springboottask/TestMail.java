package com.tptogiar.springboottask;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;

import javax.mail.internet.MimeMessage;
import java.io.File;

/**
 * @author Tptogiar
 * @description
 * @date 2022/2/15 - 20:42
 */
public class TestMail {

    @Autowired
    JavaMailSenderImpl mailSender;

    @Test
    public void contextLoads() {
        SimpleMailMessage message = new SimpleMailMessage();
        //邮件设置
        message.setSubject("通知-今晚开会");
        message.setText("今晚7:30开会");

        message.setTo("17512080612@163.com");
        message.setFrom("534096094@qq.com");

        mailSender.send(message);
    }

    @Test
    public void test02() throws  Exception{
        //1、创建一个复杂的消息邮件
        MimeMessage mimeMessage = mailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);

        //邮件设置
        helper.setSubject("通知-今晚开会");
        helper.setText("<b style='color:red'>今天 7:30 开会sdfsdf水电费</b>",true);

        helper.setTo("34234@163.com");
        helper.setFrom("sfsfsf@qq.com");

        //上传文件
        helper.addAttachment("1.jpg",new File("C:\\Users\\Tptogair\\Downloads\\SpringBoot (7).ico"));
        helper.addAttachment("2.jpg",new File("C:\\Users\\Tptogair\\Downloads\\SpringBoot.ico"));

        mailSender.send(mimeMessage);

    }




}
