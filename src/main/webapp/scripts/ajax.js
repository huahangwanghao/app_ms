function handleAjaxSimple(url, data, handleSuccess) {
	$.ajax({
		type : "post",
		url : url,
		data : data,
		dataType : "json",
		contentType : "application/json",
		async : true,
		cache : false,
		error : function() {
			alert("请求失败！");
		},
		success : function(json) {
			handleSuccess(json);
		}
	});
}

function handleAjaxAdvance(type, url, data, dataType, contentType, async, cache,handleSuccess) {
	$.ajax({
		type : type,
		url : url,
		data : data,
		dataType : dataType,
		contentType : contentType,
		async : async,
		cache : cache,
		error : function() {
			alert("请求失败！");
		},
		success : function(json) {
			handleSuccess(json);
		}
	});
}
