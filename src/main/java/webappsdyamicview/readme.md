* Suppose you implement the cart page of an online shop. This page shouldn't display the same data for everyone.
It also doesn't even show the same information every time for the same user.
* The information below is different despite the same page. It's dynamic





### example of a dynamic webpage 

![image](/Users/alexanderfournier/Downloads/Spring-Intro/src/main/resources/img/img_3.png)




* Most projects display dynamic data to the user. Now, for a user's request expressed through an HTTP
request set by the browser, the browser recieves some data, processes it, and then sends back
an HTTP response that the browser needs to display. We'll review the Spring MVC workflow and then work 
on an example to demonstrate how the view can get dynamic values from the controller.


* In the previous example we implemented at the end of chapter 8, the browsers content was the 
same for every HTTP request for our page. Remember the Spring MVC flow. 

1. The client sends an HTTP request to the web server
2. The dispatcher serverlet uses the handler mapping to find out what controller action to call.
3. The dispatcher servlet calls the controller's action
4. After executing the action associated with the HTTP request, the controller returns the view name the dispatcher servlet needs to render the HTTP response
5. the response is sent back to the client

![image](/Users/alexanderfournier/Downloads/Spring-Intro/src/main/resources/img/img_4.png)

* Number 4 is where we need to make a change. We want the controller not only to return
the view name but somehow also send data to the view. The view will incorporate this data
to define the HTTP response. This way, if the server sends a list of one product, and the page
displays the list, the page will display one product.  If the controller sends two products for the same view, now the displayed
data will be different. 