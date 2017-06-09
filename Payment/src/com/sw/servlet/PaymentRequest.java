package com.sw.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sw.utils.*;
/** 
 * @author Swxctx
 * @version 创建时间：2016年11月15日 下午8:50:34 
 * @FileName:PaymentRequest.java
 * @Explain:发起支付请求
 */
@SuppressWarnings("serial")
@WebServlet("/servlet/yeepay/paymentRequest")
public class PaymentRequest extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("GBK");
		String orderid = request.getParameter("orderid");//订单号
		String amount = request.getParameter("amount");//支付金额
		String pd_FrpId = request.getParameter("pd_FrpId");//选择的支付银行
		String p1_MerId = ConfigInfo.getValue("p1_MerId");//编号
		String keyValue = ConfigInfo.getValue("keyValue");//密钥
		String merchantCallbackURL = ConfigInfo.getValue("merchantCallbackURL");		
		String messageType = "Buy"; // 请求命令,在线支付固定为Buy
		String currency = "CNY"; // 货币单位
		String productDesc = ""; // 商品描述
		String productCat = ""; // 商品种类
		String productId = ""; // 商品ID
		String addressFlag = "0"; // 需要填写送货信息 0：不需要 1:需要		
		String sMctProperties = ""; // 商家扩展信息
		String pr_NeedResponse = "0"; // 应答机制
		String md5hmac = PaymentUtil.buildHmac(messageType, p1_MerId, orderid, amount, currency,
				productId, productCat, productDesc, merchantCallbackURL, addressFlag, sMctProperties, 
				pd_FrpId, pr_NeedResponse, keyValue);
		
		request.setAttribute("messageType", messageType);
		request.setAttribute("merchantID", p1_MerId);
		request.setAttribute("orderId", orderid);
		request.setAttribute("amount", amount);
		request.setAttribute("currency", currency);
		request.setAttribute("productId", productId);
		request.setAttribute("productCat", productCat);
		request.setAttribute("productDesc", productDesc);
		request.setAttribute("merchantCallbackURL", merchantCallbackURL);
		request.setAttribute("addressFlag", addressFlag);
		request.setAttribute("sMctProperties", sMctProperties);
		request.setAttribute("frpId", pd_FrpId);
		request.setAttribute("pr_NeedResponse", pr_NeedResponse);
		request.setAttribute("hmac", md5hmac);
		
		//跳转到支付链接页面（并且传递相应值）
		request.getRequestDispatcher("/WEB-INF/page/connection.jsp").forward(request, response);
	}

}
