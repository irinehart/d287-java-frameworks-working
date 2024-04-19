# WESTERN GOVERNOR UNIVERSITY 
## D287 – JAVA FRAMEWORKS

C.  Customize the HTML user interface for your customer’s application. The user interface should include the shop name, the product names,
and the names of the parts.
Note: Do not remove any elements that were included in the screen. You may add any additional elements you would like or any images, colors, and styles,
although it is not required.

I changed the websites name to "Computer Galaxy" (mainscreen.html (line 14)), the header to "Computer Galaxy Store" (mainscreen.html (line 19)),
and the search bar to "Parts Search:" (mainscreen.html (line 21)).
I added 5 parts: CPU, GPU, RAM, PSU, and SSD
I added 5 products: Workhorse PC, Laptop, Gaming PC, All-in-one, and MAC
Changes the font in Galaxy to Blue on the heading to add an eye-popping effect on the title (mainscreen.html (line 19))

D.  Add an “About” page to the application to describe your chosen customer’s company to web viewers and include navigation to and from the “About” page
and the main screen.

Used the CSS file from mainscreen.html to keep format consistant (about.html(line 9-10))
Changed the title to "Computer Galaxy's About Page" (about.html(line 12))
Added some headings (about.html(line 17-19))
Wrote a couple paragraphs about Computer Galaxy's goals and mission statement. (about.html(line 21-31))
Added a heading for and a link back to the main page. (about.html(line 33-34))
Link back to the about page on the main page (mainscreen.html)(line 90-91)
Created AboutPageController for my about.html file

E.  Add a sample inventory appropriate for your chosen store to the application. You should have five parts and five products in your sample inventory and should not overwrite existing data in the database.
Note: Make sure the sample inventory is added only when both the part and product lists are empty. When adding the sample inventory appropriate for the store, the inventory is stored in a set so duplicate items cannot be added to your products. When duplicate items are added, make a “multi-pack” part.

Created an if statement that if both my part and product repos were empty to add sample inventory. (BootStrapData.java (line 65-176))
If we ran out of inventory again then it would create a multi-pack part. (BootStrapData.java (line 68))

F.  Add a “Buy Now” button to your product list. Your “Buy Now” button must meet each of the following parameters:
•  The “Buy Now” button must be next to the buttons that update and delete products.
•  The button should decrement the inventory of that product by one. It should not affect the inventory of any of the associated parts.
•  Display a message that indicates the success or failure of a purchase.

Created a by now button in mainscreen using the template of the other two buttons. (mainscreen.html (line 85))
Created a failed and successful purchase screen based on my about page (confirmationpurchase.html and failedpurchase.html)
In the class AddProductController I created a buy product function that will send you either to the failed or successful screen. (AddProductController.java (line 125))
In the Product class I created a function that checks if there is inventory then decrements it. (Product.java (line 110))

G.  Modify the parts to track maximum and minimum inventory by doing the following:
•  Add additional fields to the part entity for maximum and minimum inventory.
•  Modify the sample inventory to include the maximum and minimum fields.
•  Add to the InhousePartForm and OutsourcedPartForm forms additional text inputs for the inventory so the user can set the maximum and minimum values.
•  Rename the file the persistent storage is saved to.
•  Modify the code to enforce that the inventory is between or at the minimum and maximum value.

In Part.java I declared the minimum and maximum value of inventory (line 32-36).
Created my getters and setters (Part.java(92-106)).
Created a new constructor that included my minimum and maximum values (Part.java(61-68)).
In BootStrapData.java I added minimum and maximum values to my sample inventory parts (BootStrapData.java(73-158)).
I created fields on the part forms for maximum and minimum inputs- 
(OutsourcedPartForm.html (line 25-29) and InhousePartForm (lines 24 - 28))
In application.properties I renamed the database to spring.datasource.url=jdbc:h2:file:~/src/main/resources/spring-boot-h2-db102 (Line 6).
I added a check method that makes sure the value the user enters for inventory cannot  fall above or below the min or max (Part.java (Line 128-142)).
I added fields to track minimum and maximum on mainscreen.html (Line 48).
I added my tester to InhousePart.java and OutsourcedPart.java (Line 54).

ERROR Corrected: I had commented out an important line on InhousePartForm.html (Lines 25 and 28).
ERROR Corrected: Changed a greater than to a greater than or equal to (MinimumPartInventoryValidator.java (Lines 27)).

H.  Add validation for between or at the maximum and minimum fields. The validation must include the following:
•  Display error messages for low inventory when adding and updating parts if the inventory is less than the minimum number of parts.
•  Display error messages for low inventory when adding and updating products lowers the part inventory below the minimum.
•  Display error messages when adding and updating parts if the inventory is greater than the maximum.

I declared my new validator classes (Part.java(Lines 21-22).
Created a MinimumPartInventoryValidator.java validator class.
Created a interface class ValidMinimumPartInventory.java.
Created a class PartInventoryValidator.java.

I.  Add at least two unit tests for the maximum and minimum fields to the PartTest class in the test package.

Added test cases to PartTest.java for getMinimumInventory() getMaximumInventory()(Lines 161-177).

J.  Remove the class files for any unused validators in order to clean your code.

Remove a validator with no usages (DeletePartValidator.java).
