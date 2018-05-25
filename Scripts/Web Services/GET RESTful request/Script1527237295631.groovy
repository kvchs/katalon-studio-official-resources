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
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
 
'Create a new GET object using builder'
def builder = new RestRequestObjectBuilder()
def requestObject = builder
	.withRestRequestMethod("GET")
	.withRestUrl("http://jsonplaceholder.typicode.com/comments")
	.withRestParameters([
		new TestObjectProperty("postId", ConditionType.EQUALS, "1"),
		new TestObjectProperty("id", ConditionType.EQUALS, "1")
	])
	.withHttpHeaders([
		new TestObjectProperty("Content-Type", ConditionType.EQUALS, "application/json")
	])
	.build()
'Send a request'
def response = WS.sendRequest(requestObject)

println response.getResponseText()
/**
 * [
  {
    "postId": 1,
    "id": 1,
    "name": "id labore ex et quam laborum",
    "email": "Eliseo@gardner.biz",
    "body": "laudantium enim quasi est quidem magnam voluptate ipsam eos\ntempora quo necessitatibus\ndolor quam autem quasi\nreiciendis et nam sapiente accusantium"
  }
]
 * 
 */
 
'Verify if comment\'s email after sending request is correct or not'
WS.verifyElementPropertyValue(response, '[0].email', 'Eliseo@gardner.biz')

WS.verifyElementsCount(response, "[0].name", 28)

//WS.verifyElementText(response, " ", "id labore ex et quam laborum")   for XML data

WS.verifyResponseStatusCode(response, 200)

WS.verifyResponseStatusCodeInRange(response, 100, 300)

   
'Use Web Service keyword'
def stringConcatenate = WS.concatenate(['Katalon', 'Automation Tool'] as String[], FailureHandling.STOP_ON_FAILURE)

println stringConcatenate

WS.containsString(response, "Eliseo@gardner.biz", false)

WS.verifyMatch('Katalon', '(K|T)atalon', true)

WS.verifyNotMatch('Katalon', '(L|T)atalon', true)

WS.comment('Your text here')

WS.delay(2)
