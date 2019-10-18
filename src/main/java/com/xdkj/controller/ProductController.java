package com.xdkj.controller;

import com.xdkj.bean.Product;
import com.xdkj.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.util.Date;
import java.util.List;

/**
 * @author mr guo
 * @create 2019-10-16 10:41
 */
@Controller
public class ProductController {
    @Autowired
    private ProductService ps;
    @Autowired
    private JavaMailSenderImpl sender;

    @RequestMapping("sendMail")
    @ResponseBody
    public  String  sendMail(MultipartFile mf){
        System.out.println(mf.getOriginalFilename());



        try {
            //创建邮件
            MimeMessage message = sender.createMimeMessage();
            //true 代表附件
            MimeMessageHelper helper = new MimeMessageHelper(message,true);
            helper.setFrom("15829851589@163.com");
            helper.setTo("1849201215@qq.com");
            helper.setSubject("测试邮件");
            helper.setText("这是一封测试邮件");
            helper.setSentDate(new Date());
            //添加附件
            helper.addAttachment(mf.getOriginalFilename(),mf);
            //发送邮件
            sender.send(message);

            return "success";


        } catch (MessagingException e) {
            e.printStackTrace();
        }
    return "fail";


    }






    @RequestMapping("findAll1")
    public String showProduct(Model model){
        List<Product> list = ps.findAll();

        model.addAttribute("list",list);

        return "showProduct";
    }

    @RequestMapping("findAll2")
    public ModelAndView showProduct2(){
        ModelAndView mv = new ModelAndView("showProduct");
        List<Product> list = ps.findAll();
        mv.addObject("list",list);
        return mv;

    }
    @RequestMapping("delete")
    public String del(Integer pid){
        boolean b = ps.deleteByPid(pid);
        if(b){
            return "redirect:/findAll1";
        }
        return "error";
    }

}
