import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.testobject.RestRequestObjectBuilder
import com.kms.katalon.core.testobject.TestObjectProperty as TestObjectProperty
import com.kms.katalon.core.testobject.UrlEncodedBodyParameter
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
  
def builder = new RestRequestObjectBuilder()
   
'Create a new POST object using builder'
def requestObject = builder
	.withRestRequestMethod("POST")
	.withRestUrl("https://sample-web-service-aut.herokuapp.com/api/users/urlencoded")
	.withHttpHeaders([
		new TestObjectProperty("Content-Type", ConditionType.EQUALS, "application/x-www-form-urlencoded")
	])
	.withUrlEncodedBodyContent([
		new UrlEncodedBodyParameter("username", "myUsername"),
		new UrlEncodedBodyParameter("password", "myPassword"),
		new UrlEncodedBodyParameter("gender", "MALE"),
		new UrlEncodedBodyParameter("age", "20"),
		new UrlEncodedBodyParameter("avatar", "AAA"),
	])
	.build()
	  
def response = WS.sendRequest(requestObject)

println response.getResponseText()

//{"id":4,"username":"myUsername","password":"myPassword","gender":"MALE","age":20,"avatar":"QUFB"}
   
assert response.getStatusCode() == 200