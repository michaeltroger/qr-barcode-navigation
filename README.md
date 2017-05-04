# Augmented Reality barcode & QR code navigation for >= Android 4.0 #

<img src="/qrbarcodenavi.png" alt="Augmented Reality barcode and QR code navigation" width="400px"/>

### What is this repository for? ###

* Uses the real time camera image to analyze it for barcodes and uses them for a navigation to a goal barcode. Arrows into the right direction are shown depending on a hardcoded 2D barcode matrix. The Features include the automatically taking of a photo when a barcode is detected. Audio guidance is possible too.
* The barcode matrix is a 2D array of the values of the wished barcodes/qr-codes. The order within the matrix represents their "physical" position - e.g. one could mark physical boxes with the barcodes in the very same 2D order. I.e. if you look at the barcode located at index [0,0] it represents a box at the left top. If the goal barcode is at [2,2] - the searched box will be in the horizontal and vertical center (assuming a 5x5 matrix is used)
* The navigation will lead you first to the correct horizontal position, by telling you at each barcode you look at, where you're located relative to the goal. As soon as you're at the correct horizontal position the navigation will continue to the right vertical position until the goal barcode / qr code is found.
* Version 1.1

### How do I get set up? ###
* IDE: Android Studio (tested with 2.1.2)
* Android SDK
* Dependencies: ZXing (Zebra Crossing) library for barcode detection (automatically included by Gradle)
* Navigation configuration: The barcode navigation matrix is located in .tools.BarcodeNavigation.java
* Navigation usage:  The destination barcode can be defined in the CameraPreviewView. 
* Images location: res/drawable | Sounds location: res/raw
* Automatically taking of photos: Flag in CameraPreviewView (disabled by default)
* Make sure the app has the required permission on start, as there is no runtime-check yet! (Camera, external storage)

### Test image matrix with the correct order of the hardcoded navigation database ###
<img src="/testimages/belgium.png" alt="" width="100px"/><img src="/testimages/cafe.png" alt="" width="100px"/><img src="/testimages/cat.png" alt="" width="100px"/><img src="/testimages/computer.png" alt="" width="100px"/><img src="/testimages/day.png" alt="" width="100px"/>

<img src="/testimages/dertest.png" alt="" width="100px"/><img src="/testimages/dog.png" alt="" width="100px"/><img src="/testimages/gestern.png" alt="" width="100px"/><img src="/testimages/grass.png" alt="" width="100px"/><img src="/testimages/hallowelt.png" alt="" width="100px"/>

<img src="/testimages/heute.png" alt="" width="100px"/><img src="/testimages/keyboard.png" alt="" width="100px"/><img src="/testimages/moon.png" alt="" width="100px"/><img src="/testimages/nature.png" alt="" width="100px"/><img src="/testimages/news.png" alt="" width="100px"/>

<img src="/testimages/night.png" alt="" width="100px"/><img src="/testimages/peace.png" alt="" width="100px"/><img src="/testimages/phone.png" alt="" width="100px"/><img src="/testimages/rat.png" alt="" width="100px"/><img src="/testimages/restaurant.png" alt="" width="100px"/>

<img src="/testimages/school.png" alt="" width="100px"/><img src="/testimages/star.png" alt="" width="100px"/><img src="/testimages/today.png" alt="" width="100px"/><img src="/testimages/tv.png" alt="" width="100px"/><img src="/testimages/yesterday.png" alt="" width="100px"/>

### Who do I talk to? ###

* Repo owner and developer: android@michaeltroger.com

### Credits ###

* The barcode/qr-code detection is based on Desmond Shaw's Android Barcode Reader https://github.com/DynamsoftRD/Android-Barcode-Reader
