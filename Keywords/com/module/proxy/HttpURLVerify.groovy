//https://forum.katalon.com/discussion/5409/class-proxyinformation-should-be-public




//package com.module.proxy
//
//import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
//import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
//import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
//import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
//
//import com.kms.katalon.core.annotation.Keyword
//import com.kms.katalon.core.checkpoint.Checkpoint
//import com.kms.katalon.core.checkpoint.CheckpointFactory
//import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
//import com.kms.katalon.core.model.FailureHandling
//import com.kms.katalon.core.testcase.TestCase
//import com.kms.katalon.core.testcase.TestCaseFactory
//import com.kms.katalon.core.testdata.TestData
//import com.kms.katalon.core.testdata.TestDataFactory
//import com.kms.katalon.core.testobject.ObjectRepository
//import com.kms.katalon.core.testobject.TestObject
//import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
//import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords
//
//import internal.GlobalVariable
//
//import MobileBuiltInKeywords as Mobile
//import WSBuiltInKeywords as WS
//import WebUiBuiltInKeywords as WebUI
//
//
//import com.kms.katalon.core.configuration.RunConfiguration
//import com.kms.katalon.core.network.ProxyInformation
//
//
//import java.io.IOException;
//import java.net.HttpURLConnection;
//import java.net.InetSocketAddress;
//import java.net.MalformedURLException;
//import java.net.ProtocolException;
//import java.net.Proxy;
//import java.net.URL;
//import java.util.Optional;
//
//
////public class HttpURLVerify {
////	
////	public void main(String []args){
////		ProxyInformation proxyInfo = new ProxyInformation();
////		proxyInfo = RunConfiguration.getProxyInformation()
////		println proxyInfo.proxyServerType
////	}
////}
//
//
//public class HttpURLVerify {
//	private HttpURLVerifier() {}
//	public static Optional<VerifiableHttpURLConnection> connect(String urlString) {
//	try {
//	URL url = new URL(urlString);
//	return connect(url);
//	} catch (MalformedURLException e) {
//	return Optional.empty();
//	}
//	}
//	public static Optional<VerifiableHttpURLConnection> connect(URL url) {
//	HttpURLConnection conn = null;
//	try {
//	// Proxyが指定されていたらProxyを通過するように設定する
//	if (GlobalVariable.G_http_proxy_host != null && GlobalVariable.G_http_proxy_port != null) {
//	Proxy proxy = new Proxy(Proxy.Type.HTTP,
//	new InetSocketAddress(GlobalVariable.G_http_proxy_host,
//	Integer.parseInt(GlobalVariable.G_http_proxy_port)));
//	conn = (HttpURLConnection) url.openConnection(proxy);
//	} else {
//	conn = (HttpURLConnection) url.openConnection();
//	}
//	conn.setRequestMethod("GET");
//	conn.setConnectTimeout(10000);
//	// リダイレクトをfollowしない
//	conn.setInstanceFollowRedirects(false);
//	// now try to GET the URL
//	conn.connect();
//	return Optional.of(new VerifiableHttpURLConnection(conn));
//	} catch (ProtocolException e) {
//	System.out.println(e);
//	return Optional.empty();
//	} catch (IOException e) {
//	System.out.println(e);
//	return Optional.empty();
//	}
//	}
//	}
