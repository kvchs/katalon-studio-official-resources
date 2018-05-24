import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.json.JSONObject


import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS

def response = WS.sendRequest(findTestObject('Web Services/New REST Request'))

println response.getResponseText()

//WS.verifyElementPropertyValue(response, response.getContentType(), 'application/json')

String Response = " {\"employee\": \"0001\",\"name\":\"katalon\",\"contacts\": [{\"email\": \"email@kms.com\"},{\"phone\": \"00000000\"},{\"phone\": \"11111111\"}]}" 

JSONObject jsonObj = new JSONObject(Response);

//WSBuiltInKeywords.verifyElementPropertyValue(jsonObj, "employee.contacts.email", "email@kms.com")

WS.verifyElementPropertyValue(jsonObj, "employee.contacts.email", "email@kms.com")


