$(function(){
				
				// User1
				$('#btnUser2s').click(function(){
					
					$.ajax({
						url: '/Ch10/user2',
						type: 'GET',
						dataType: 'json',
						success: function(data){
							console.log(data);							
						}
					});
				});
				
				$('#btnUser2').click(function(){
					$.ajax({
						url: '/Ch10/user2/A102',
						type: 'GET',
						dataType: 'json',
						success: function(data){
							console.log(data);							
						}
					});
					
				});
				
				$('#btnUser2Register').click(function(){
					const jsonData = {
						id :'s101',
						name : '홍길동',
						hp : '010-1111-1001',
						age : 22
					};
					
					$.ajax({
						url: '/Ch10/user2',
						type: 'POST',
						data: 'jsonData',
						dataType: 'json',
						success: function(data){
							console.log(data);							
						}
					});
					
				});
				
				$('#btnUser2Modify').click(function(){
					const jsonData = {
						id: 's101',
						name: '홍길동',
						hp: '010-2222-1001',
						age: 23
					};
					
					$.ajax({
					url: '/Ch10/user2',
					type: 'PUT',
					data: jsonData,
					dataType: 'json',
					success: function(data){
						console.log(data);							
					}
					
				});
				});
				$('#btnUser2Delete').click(function(){
					$.ajax({
						url: '/Ch10/user2',
						type: 'POST',
						dataType: 'jsonData',
						success: function(data){
							console.log(data);							
						}
					});
				});
			
			});
			