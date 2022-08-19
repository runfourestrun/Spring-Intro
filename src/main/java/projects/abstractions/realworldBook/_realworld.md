* Objects implemented use cases are known as ***Services***
* Objects that interact with a database are known as ***Repositories*** and stored in a dao directory
* Objects who's responsibility is to establish communication with something outside the app are called ***proxies***
* A ***POJO*** is a simple Type with no dependencies
### Task

* Say you are implementing an app a team uses to manage their tasks. One of the app’s features is allowing the users to leave comments for the tasks. When a user publishes a comment, it is stored somewhere (e.g., in a database), and the app sends an email to a specific address configured in the app.

![/Users/alexanderfournier/Downloads/Spring-Intro/src/main/resources/img/img3.png](/Users/alexanderfournier/Downloads/Spring-Intro/src/main/resources/img/img3.png)

###After abstraction
![](/Users/alexanderfournier/Downloads/Spring-Intro/src/main/resources/img/Screen Shot 2022-07-28 at 7.07.58 PM.png)
* Figure 4.6 The CommentService object depends on the projects.abstractions provided by CommentRepository and CommentNotificationProxy interfaces. The classes DBCommentRepository and EmailCommentNotificationProxy further implement these interfaces. This design decouples the implementation of the “publish comment” use case from its dependencies and makes the application easier to change for future developments.



### Objects that you need to add to the SpringContext

CommentService—Has two dependencies, the CommentRepository and the CommentNotificationProxy

DBCommentRepository—Implements the CommentRepository interface and is a dependency of the CommentService

EmailCommentNotificationProxy—Implements the CommentNotificationProxy interface and is a dependency of the CommentService