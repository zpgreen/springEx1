var main = {
	init : function(){
		var _this = this;
		$('#btn_click').click(function(){
			alert("click");
			_this.get();
		});
	},
	send : function(){
		var data = {
			id : $('#id').val(),
			address : $('#address').val()
		};
		$.ajax({
			type : 'POST',
			url : '/creative',
			datatype : 'json',
			contentType : 'application/json; charset=utf-8',
			data : JSON.stringify(data)
		}).done(function(){
			alert("done!!");
		}).fail(function(error){
			alert(JSON.stringify(error));
		})
	},
	get : function(){
		$.ajax({
			url: '/creative',
			// datatype : "json",
			success : function(resd){
				$("#id").val(resd.id)
				$("#address").val(resd.address)
			}
		});
	}
}
main.init();
// $(document).ready(function(){
// 	var _this = this;
// 		$('#btn_click').click(function(){
// 			alert("click");
// 			_this.get();
// 		});
// })