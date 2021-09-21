import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://demo.guru99.com/test/newtours/reservation2.php')

WebUI.click(findTestObject('Object Repository/MercuryPageObjets/a_REGISTER'))

WebUI.setText(findTestObject('Object Repository/MercuryPageObjets/input_First               Name_firstName'), 'Juan Andres')

WebUI.setText(findTestObject('Object Repository/MercuryPageObjets/input_Last               Name_lastName'), 'Perez Montalvo')

WebUI.setText(findTestObject('Object Repository/MercuryPageObjets/input_Phone_phone'), '3013785421')

WebUI.setText(findTestObject('Object Repository/MercuryPageObjets/input_Email_userName'), 'juan@montalvo.com')

WebUI.setText(findTestObject('Object Repository/MercuryPageObjets/input_Address_address1'), 'calle 15 # 15-35')

WebUI.setText(findTestObject('Object Repository/MercuryPageObjets/input_City_city'), 'Medellin')

WebUI.setText(findTestObject('Object Repository/MercuryPageObjets/input_StateProvince_state'), 'Antioquia')

WebUI.setText(findTestObject('Object Repository/MercuryPageObjets/input_Postal               Code_postalCode'), '2540')

WebUI.selectOptionByValue(findTestObject('Object Repository/MercuryPageObjets/select_ALBANIAALGERIAAMERICAN SAMOAANDORRAA_ae5feb'), 
    'COLOMBIA', true)

WebUI.setText(findTestObject('Object Repository/MercuryPageObjets/input_User               Name_email'), 'juanam*')

WebUI.setEncryptedText(findTestObject('Object Repository/MercuryPageObjets/input_Password_password'), 'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.setEncryptedText(findTestObject('Object Repository/MercuryPageObjets/input_Confirm               Password_confir_11d7ab'), 
    'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('Object Repository/MercuryPageObjets/input_Confirm               Password_submit'))

WebUI.click(findTestObject('Object Repository/MercuryPageObjets/a_sign-in'))

WebUI.setText(findTestObject('Object Repository/MercuryPageObjets/input_User               Name_userName'), 'juanam*')

WebUI.setEncryptedText(findTestObject('Object Repository/MercuryPageObjets/input_Password_password (1)'), 'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('Object Repository/MercuryPageObjets/input_Password_submit'))

WebUI.verifyElementVisible(findTestObject('MercuryPageObjets/p_Thank you for Loggin'), FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

