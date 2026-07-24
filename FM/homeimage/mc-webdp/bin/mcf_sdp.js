var sdp = new SDP();
var windowObj;	// PreviewWindowオブジェクト保持用の変数


function svf_print(){
	window.onbeforeunload = function(){
		rtnmcframe7_windowclose();
	}

	var param = GetQueryString();
	rtnmcframe7(param["port"],param["reqno"],"1","0");
	var foo;

	if (param["preview"] == "1") {
		foo = sdp.embedPreviewWindow('iframeID', param["raw"], 2, 1,
		function(res){ 
			//印刷終了後の処理
			directprint_close();
			windowObj.close();
		},
		  function(err){ 
			//印刷終了後の処理
			directprint_error(err.response.data.status);
			windowObj.close();
		}
		);
		foo.then(function(res){
  			//プレビュー成功後処理
			windowObj = res.window;//プレビュー成功後に、プレビュー画面のウィンドウオブジェクト（res.window）を変数（windowObj）にセットする
		}).catch(function(err){
			if (err.response === void 0) {
				alert("Preview error to mcframe 7:" + err);
				directprint_close();
			}
			else {
				var status = err.response.data.status; //ステータス取得します。
				if(status === -102 || status === -103){
					directprint_close();
				}
			}
		});
	}
	else {
		foo = sdp.print(param["raw"], param["printer"]);
		foo.then(function(){
			directprint_close();
		}).catch(function(err){
			directprint_error(err.response.data.status);
		});
	}
}

function directprint_close() {
	var param = GetQueryString();
	rtnmcframe7(param["port"],param["reqno"],"2","0");
	window.onbeforeunload = null;
	if (param["close"] == "1") {
		setTimeout(
			function () { window.open('about:blank','_self').close(); },
			1000);
	}
}

function directprint_error(rtn_cd) {
	var param = GetQueryString();
	rtnmcframe7(param["port"],param["reqno"],"2",rtn_cd);
	window.onbeforeunload = null;
	if (param["close"] == "1") {
		setTimeout(
			function () { window.open('about:blank','_self').close(); },
			1000);
	}
}


function rtnmcframe7(port, reqno, status, rtn_cd) {
	try{
		var xh;
		xh = new XMLHttpRequest();
		xh.open("GET",getUrl(port, reqno, status, rtn_cd) ,false);
		xh.send();
	}
	catch (e) {
		alert("Socket error to mcframe 7:" + e.message + ":" + status + ":" + rtn_cd);
		alert(status + ":" + rtn_cd);
	}
}

function rtnmcframe7_windowclose() {
	var param = GetQueryString();
	var url = getUrl(param["port"], param["reqno"], "2", "0");
	fetch(url, {keepalive:true, mode:"cors"});
	_mcsleep(300);
}

function getUrl(port, reqno, status, rtn_cd) {
	return "http://localhost:" + port + "/mcframe?class_id=mcframe.clientCore.report.MCClientSDPLsnr?method=setPrintCondition;s=" + reqno + ";s=" + status + ";s=" + rtn_cd
}

function GetQueryString() {
	if (1 < document.location.search.length) {
		var query = decodeURIComponent(document.location.search.substring(1));
		var parameters = query.split('&');

		var result = new Object();
		for (var i = 0; i < parameters.length; i++) {
			var element = parameters[i].split('=');
			var paramName = decodeURIComponent(element[0]);
			var paramValue = decodeURIComponent(element[1]);
			result[paramName] = paramValue;
		}
		return result;
	}
	return null;
}

function _mcsleep(waitMsec) {
  var startMsec = new Date();
  while (new Date() - startMsec < waitMsec);
}


