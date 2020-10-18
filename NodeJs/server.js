var http = require('http');
var url = require('url');

function startserver(route,handle){
	function onRequest(request,response){
		var reviewData = "";
		var pathname = url.parse(request.url).pathname;
		console.log('request recieved for' + pathname);
		request.setEncoding("utf8");
		request.addListener("data",function(chunk){
			reviewData += chunk;
		});
		request.addListener("end",function(){
			route(handle,pathname, response, reviewData);
		});
		//response.writeHead(200,{'Content-Type': 'text/plain'});
		//response.write('Hello World');
		//response.end();
	}
	http.createServer(onRequest).listen(8888);
	console.log('Server started on localhost at 8888 port'); 
}
exports.startserver = startserver;