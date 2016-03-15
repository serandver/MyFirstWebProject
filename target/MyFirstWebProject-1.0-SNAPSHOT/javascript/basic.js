$(document).ready(function(){
   $('#updateUserName').submit(function(){
       $.ajax({
           url: 'update',
           type: 'POST',
           datatype: 'json',
           data: $('#updateUserName').serialize(),
           success: function(data){
               if(data.isValid){
                   $('#displayName').html('Your name is: ' + data.userName);
                   $('#displayName').slideDown(500);
               }
               else {
                   alert('Please enter a valid userName');
               }
           }
       });
       return false;
   });
});
