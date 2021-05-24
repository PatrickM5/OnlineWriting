function objectifyForm(formArray) {//serialize data function
    var returnArray = {};
    for (var i = 0; i < formArray.length; i++) {
        returnArray[formArray[i]['name']] = formArray[i]['value'];
    }
    return returnArray;
}

toastr.options = {
    "positionClass": "toast-bottom-right",
  }



//   <div class="clentBalances" id="clientBalances">
//             <li class="nav-item d-none d-sm-inline-block">
//               <a href="#" class="nav-link">Units Remaining: 45455.00</a>
//             </li>
//           </div>
 

if(user.portalRole === 'CLIENT'){
    $("#clientBalances").html('');
    $.ajax({
        type: "GET",
        url: "/bsms/data/client-apikeys/"+user.client,
        dataType: "json", 
        success: function (data) {
        const apiKeys =[];
           
         if(data.length > 0){
        $("#clientBalances").append(
            `<li class="nav-item d-none d-sm-inline-block">
                <a href="#" class="nav-link">Available Balance</a>
            </li>`
            );  

          for (var i in data) {
           // var balance =   fetchBalances(data[i].key);
            
           // balances.push(balance);


            apiKeys.push(data[i].key);
                $.ajax({
                    type: "GET",
                    url: "/bsms/data/credit-balance/"+data[i].key,
                    dataType: "json", 
                    async: false,
                    success: function (data2) {
                    console.log(data2);
                    balance= data2.balance;
                    $("#clientBalances").append(
                        `
                            <li class="nav-item d-none d-sm-inline-block">
                                <a href="#" class="nav-link">${data[i].messageType}: KES ${data2.balance}</a>
                            </li>`
                        );   
                
                    }
                });
        }
       }

        }
      });

}else if(user.portalRole === 'ADMIN'){
   
    $("#adminBalances").html('');
    $.ajax({
        type: "GET",
        url: "/bsms/data/quota/balance",
        dataType: "json", 
        success: function (data) {
        $("#adminBalances").append(
            `
                <li class="nav-item d-none d-sm-inline-block">
                    <a href="#" class="nav-link">Remaining Balance: ${data[0].balance}</a>
                </li>

                <li class="nav-item d-none d-sm-inline-block">
                    <a href="#" class="nav-link">Weighted Avg: ${data[0].unitCost}</a>
                </li>

                <li class="nav-item d-none d-sm-inline-block">
                  <a href="#" class="nav-link">Expiry Date: ${data[0].expiryDate}</a>
                </li>
                
                `
            );   
    
        }
    });




}


function fetchBalances(key){
   
  
     

}

