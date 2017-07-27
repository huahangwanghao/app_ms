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

$.fn.serializeJsonObject = function(obj) {
	if (obj == undefined || obj == '')
		obj = {};
	var formarray = this.serializeArray();
	$.each(formarray, function() {
		if (obj[this.name]) {
			if (!obj[this.name].push) {
				obj[this.name] = [ obj[this.name] ];
			}
			obj[this.name].push(this.value || '');
		} else {
			obj[this.name] = this.value || '';
		}
	});
	return obj;
};
