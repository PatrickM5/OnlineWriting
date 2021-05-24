$(document).ready(function () {
    $(".submitIcon").hide();
//     //ajax load clients

//     $.ajax({
//       type: "POST",
//       url: "/data/services",
//       dataType: "json", 
//       success: function (data) {
//         $(".client").html('<option value="--select--">--Select client--</option>');
//         // Add options
//         for (var i in data) {
//           $(".client").append('<option value="'+ data[i].email +'">'+ data[i].name +'</option>')
//         }
//       }
//   });

  $('#services').on('change', function (e) {
    var optionSelected = $("option:selected", this);
    var valueSelected = this.value;
    
   var amounting=$(this).find(':selected').data('amount');

    $.ajax({
      async:false,
      type: "POST",
      url: "/data/problems",
      contentType: "application/json; charset=utf-8",
      dataType: "json", 
      data: JSON.stringify({ id: valueSelected }),
      success: function (data) {
        $("#problem").html('');
        // Add options
        for (var i in data) {
          $('<option>').val(data[i].id).text(data[i].name)
          .attr('data-amount', data[i].amount_chargable)
          .attr('data-name', data[i].name)
          .appendTo('#problem');

        }
        amounting+=$("#problem").find(':selected').data('amount');
      }
  });


  $.ajax({
    async:false,
    type: "POST",
    url: "/data/academics",
    contentType: "application/json; charset=utf-8",
    dataType: "json", 
    data: JSON.stringify({ id: valueSelected }),
    success: function (data) {
        if(data.length < 1){
         $('#academicdiv').addClass('hidden');
         console.log("Value Empty")
        }else{
            $('#academicdiv').removeClass('hidden');
            $("#academic").html('');
            // Add options
            for (var i in data) {
              $('<option>').val(data[i].id).text(data[i].name)
              .attr('data-amount', data[i].amount_chargable)
              .attr('data-name', data[i].name)
              .appendTo('#academic');
             // $("#academic").append('<option th:attr="data-amount=${choice.amount_chargable},data-name=${choice.name}" value="'+ data[i].id +'">'+ data[i].name +'</option>')
            }
            amounting+=$("#academic").find(':selected').data('amount');
        }
       
     
    }
});

$.ajax({
  async:false,
    type: "POST",
    url: "/data/urgencies",
    contentType: "application/json; charset=utf-8",
    dataType: "json", 
    data: JSON.stringify({ id: valueSelected }),
    success: function (data) {
      $("#urgencie").html('');
      // Add options
      for (var i in data) {
        $('<option>').val(data[i].id).text(data[i].name)
              .attr('data-amount', data[i].amount_chargable)
              .attr('data-name', data[i].name)
              .appendTo('#urgencie');
        //$("#urgencie").append('<option th:attr="data-amount=${choice.amount_chargable},data-name=${choice.name}" value="'+ data[i].id +'">'+ data[i].name +'</option>')
      }
      amounting+=$("#urgencie").find(':selected').data('amount');
    }
});
 
//var number =$('#number').val();
  setFinalPriceDouble(amounting);

});

$('#problem').on('change', function (e) {
  var amounting=Number($(this).find(':selected').data('amount'));
  var academicAmount =Number($("#academic").find(':selected').data('amount'));
  var urgencyAmount =Number($("#urgencie").find(':selected').data('amount'));
  var servicesAmount =Number($("#services").find(':selected').data('amount'));
console.log(amounting);
console.log("academic:"+academicAmount);
console.log("urgency:"+urgencyAmount);
console.log("service:"+servicesAmount);

  amounting+=academicAmount;
  amounting+=urgencyAmount;
  amounting+=servicesAmount;

  
  //var number =$('#number').val();
  setFinalPriceDouble(amounting);

});

$('#academic').on('change', function (e) {
  var amounting=Number($(this).find(':selected').data('amount'));
  var problemAmount =Number($("#problem").find(':selected').data('amount'));
  var urgencyAmount =Number($("#urgencie").find(':selected').data('amount'));
  var servicesAmount =Number($("#services").find(':selected').data('amount'));

  amounting+=problemAmount;
  amounting+=urgencyAmount;
  amounting+=servicesAmount;

  console.log(amounting);
console.log("academic:"+problemAmount);
console.log("urgency:"+urgencyAmount);
console.log("service:"+servicesAmount);
console.log(amounting);
  
  //var number =$('#number').val();
  setFinalPriceDouble(amounting);

});

$('#urgencie').on('change', function (e) {
  var amounting=Number($(this).find(':selected').data('amount'));
  var problemAmount =Number($("#problem").find(':selected').data('amount'));
  var academicyAmount =Number($("#academic").find(':selected').data('amount'));
  var servicesAmount =Number($("#services").find(':selected').data('amount'));

  amounting+=problemAmount;
  amounting+=academicyAmount;
  amounting+=servicesAmount;

  console.log(amounting);
  console.log("academic:"+problemAmount);
  console.log("urgency:"+academicyAmount);
  console.log("service:"+servicesAmount);
  console.log(amounting);

  //var number =$('#number').val();
  setFinalPriceDouble(amounting);

});

});


function setFinalPriceDouble(amount){
 
  var times=Number(document.getElementById('number').value);
  console.log(times);
  $('#amounting').text((amount * times).toFixed(2));
}


function increaseValue() {
    var value = parseInt(document.getElementById('number').value, 10);
    value = isNaN(value) ? 1 : value;
    value++;
    document.getElementById('number').value = value;
    var amount=allvalues();
    //console.log(amount);
    setFinalPriceDouble(amount);
  }
  

  function decreaseValue() {
    var value = parseInt(document.getElementById('number').value, 10);
    value = isNaN(value) ? 1 : value;
    // value <= 1 ? value = 1 : '';
    if(value <=1){
        value=1;
    }else{
        value--;
    }
    document.getElementById('number').value = value;
     var amount=allvalues();
    // console.log(amount);
    setFinalPriceDouble(amount);
  }


  function allvalues(){
    var amounting=Number($("#urgencie").find(':selected').data('amount'));
    var problemAmount =Number($("#problem").find(':selected').data('amount'));
    var academicyAmount =Number($("#academic").find(':selected').data('amount'));
    var servicesAmount =Number($("#services").find(':selected').data('amount'));
    amounting+=problemAmount;
    amounting+=academicyAmount;
    amounting+=servicesAmount;
  return amounting;
  }