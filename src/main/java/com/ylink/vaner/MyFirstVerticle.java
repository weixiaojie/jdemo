package com.ylink.vaner;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Vertx;
import io.vertx.core.http.HttpServer;
import io.vertx.core.http.HttpServerResponse;
import io.vertx.ext.web.Route;
import io.vertx.ext.web.Router;

public class MyFirstVerticle extends AbstractVerticle {

	 public static void main(String[] args) {
	      /*  Vertx vertx = Vertx.vertx();
	        HttpServer server = vertx.createHttpServer();
	        Router router = Router.router(vertx);
	        // 路径必须是以“/”开头的,但是Route将会忽略最后的斜杠（/）,当然我们也可以使用通配符“*”,这样就能匹配以该路径开头的所有路径了
	        //还有占位符“:”用于获取路径参数的，以及使用正则表达式匹配路径URI的，官网都有例子
	        Route route = router.route().path("/*");
	        //还可以将数据放在routingContext中，put get
	        route.handler(routingContext -> {
	            HttpServerResponse response = routingContext.response();
	            response.putHeader("content-type", "text/plain");
	            response.end("hello world!");
	        });
	        System.out.println("PathServer.main()");
	        server.requestHandler(router::accept).listen(8080);*/
	    }
}