//import javafx.application.Application;
//import javafx.scene.Group;
//import javafx.scene.Scene;
//import javafx.scene.web.WebEngine;
//import javafx.scene.web.WebView;
//import javafx.stage.Stage;
//
//public class Html extends Application {
//    public static void main(String[] args) {
//        launch(args);
//    }
//
//    @Override
//    public void start(Stage primaryStage) throws Exception {
//        WebView webView = new WebView();
//        WebEngine webEngine = new WebEngine();
//        //webEngine.load("file://");
//        webEngine.loadContent("" +
//                "<div id='div'>hello world</div>" +
//                "<script>document.getElementById('div').style.color='blue';" +
//                "function changeColor() {" +
//                "   document.getElementById('div').style.color='green';" +
//                "document.getElementById('div').innerHTML = setGoodbye('Max')" +
//                "}</script>" +
//                "");
//        JSObject jsObject = (JSObject) webEngine.executeScript("window");
//        jsObject.setMember("myClass", new MyClass());
//        webEngine.getLoadWorker()
//                .stateProperty()
//                .addListener( (obs, oldValue, newValue) -> {
//                    if (newValue == SUCCEEDED) {
//                        webEngine.executeScript("changeColor():");
//                    }
//                });
//
//        Group group = new Group();
//        group.getChildren().addAll(webView);
//        group.getChildren().addAll();
//        primaryStage.setScene(new Scene(group, 400, 300));
//        primaryStage.show();
//    }
//    public class Myclass {
//        String getHello(String name) {
//            return "hello " + name;
//        }
//    }
//}
