/**
 * bootstrapTable初始化
 * @param url：请求url
 * @param cache：是否缓存
 * @param sortName：排序列名
 * @param sortOrder：排序方式
 * @param columns：展示列数组
 */
function initTable(url,cache,sortName,sortOrder,columns){
    $('#datatable').bootstrapTable('destroy');//先销毁表格
    $("#datatable").bootstrapTable({
		url: url,
        dataType: "json",
        singleSelect: false,
        striped: true,	//是否显示行间隔色
        cache: cache,	//是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
        sortable: true,	//是否启用排序 
        pagination: true,	//显示分页按钮
        sortName:sortName,	//排序列名
        sortOrder:sortOrder,	//默认排序
        pageNumber: 1,	//初始化加载第一页，默认第一页
        pageSize: 2,	//默认显示的每页个数
        pageList: [10, 25, 50, 100],	//可供选择的每页的行数（*）
        queryParamsType: '',	//默认值为 'limit' ,在默认情况下 传给服务端的参数为：offset,limit,sort // 设置为 '' 在这种情况下传给服务器的参数为：pageSize,pageNumber
        queryParams:function(params){
            var temp = {
                pageSize: params.pageSize,   //页面大小
                pageNumber: params.pageNumber,  //当前页
                sortName: params.sortName,  //排序列
                sortOrder: params.sortOrder,    //排序方式
                queryJson: JSON.stringify(getQuetyData()),  //查询数据
            }
            return temp;
        },
        responseHandler:function(res){
            //动态渲染表格之前获取有后台传递的数据时,用于获取出除去本身渲染所需的数据的额外参数
            //详见此函数参数的api
            return res;
        },
        //search: true, 显示搜索框（客户端搜索）
        sidePagination: "server", //服务端处理分页
        //showToggle:true, 	//是否显示详细视图和列表视图的切换按钮
        //cardView: false,	//是否显示详细视图
        detailView: false,	//是否显示父子表
        columns: [{
            align : 'center',
            valign : 'middle',
            checkbox : true,
            width : 10
        },{
            field: 'goodId',
            title: '商品id',
            align : 'center',
            valign : 'middle',
            width : 60
        },{
        	field : 'goodName',
            title : '商品名称',
            align : 'center',
            width :  100,
            valign : 'middle'
        },{
        	field : 'hasCount',
            title : '库存数量',
            align : 'center',
            width :  100,
            valign : 'middle'
        },{
        	field : 'goodEndTime',
            title : '失效时间',
            align : 'center',
            width :  100,
            valign : 'middle'
        },{
            title : '操作',
            field : 'id',
            align : 'center',
            width :  120 ,
            valign : 'middle',
            formatter : function(value,row,index){
                var e = '<a href="javascript:void()" onclick="editGood(\''+ row.goodId + '\')">编辑</a> ';  
                var d = '<a href="javascript:void()" onclick="deleteGood(\''+ row.goodId +'\')">删除</a> '; 
                return e+d;
            }
        }],
        onLoadSuccess: function(){  //加载成功时执行  
            //$("#theTable th").css("text-align","center");  //设置表头内容居中
        },  
        onLoadError: function(){  //加载失败时执行  
        	alert("加载数据失败");
        }        
    });
}