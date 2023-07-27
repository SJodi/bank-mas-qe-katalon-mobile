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

Mobile.startApplication('bs://3c402c46468a940f238f2a52d8237b3221f0cb87', true)

Mobile.tap(findTestObject('Object Repository/CreateTask/android.widget.ImageButton'), 0)

Mobile.setText(findTestObject('Object Repository/CreateTask/android.widget.EditText - Task name'), 'Task01', 0)

Mobile.tap(findTestObject('Object Repository/CreateTask/android.widget.TextView - No start date'), 0)

Mobile.tap(findTestObject('Object Repository/CreateTask/android.widget.CompoundButton - Week before due'), 0)

Mobile.tap(findTestObject('Object Repository/CreateTask/android.widget.Button - OK'), 0)

Mobile.tap(findTestObject('Object Repository/CreateTask/android.widget.TextView - No due date'), 0)

Mobile.tap(findTestObject('Object Repository/CreateTask/android.widget.CompoundButton - Tomorrow'), 0)

Mobile.tap(findTestObject('CreateTask/android.widget.Button - OK'), 0)

Mobile.tap(findTestObject('Object Repository/CreateTask/android.widget.RadioButton'), 0)

Mobile.tap(findTestObject('CreateTask/android.widget.ImageButton (2)'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/CreateTask/android.widget.TextView - Task01'), 'Task01')

Mobile.tapAndHold(findTestObject('Update_delete/android.widget.RelativeLayout'), 0, 0)

Mobile.tap(findTestObject('Object Repository/Update_delete/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/Update_delete/android.widget.LinearLayout'), 0)

Mobile.tap(findTestObject('Object Repository/Update_delete/android.widget.Button - OK'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Update_delete/android.widget.TextView - There are no tasks here'), 
    'There are no tasks here.')

