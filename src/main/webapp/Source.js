function postdatacity() {
    var data= $("#citybasedSearch").serialize()
    alert(data);
    var requestType=0;
    var input=$('#CITY_INPUT').val();
    var subURL  = "paramName="+requestType+"&"+"paramValue="+input;
    postRequeset(subURL);
}
function postdatastreet() {
    var data= $("#streetbasedSearch").serialize()
    alert(data);
    var requestType=1;
    var input=$('#STREET_ADDRESS_INPUT').val();
    var subURL  =   "paramName="+requestType+"&"+"paramValue="+input;
    postRequeset(subURL);
    
}

function postdataratebased(){
	var data= $("#ratebasedsearch").serialize()
    var requestType=4;
    var input1=$('#MinTotalRate_INPUT').val();
    var input2=$('#MaxTotalRate_INPUT').val();
    var subURL  = "paramName="+requestType+"&"+"paramValue="+(input1+','+input2);
    //var data=requestType+'/';
    postRequeset(subURL);
}

function postdatastarratebased(){
	var data= $("#starratebasedsearch").serialize()
    var requestType=3;
    var input1=$('#MinStarRate_INPUT').val();
    var input2=$('#MaxStarRate_INPUT').val();
    var subURL="paramName="+requestType+"&"+"paramValue="+(input1+','+input2);
    //var data=requestType+'/'+input1+','+input2;
    postRequeset(subURL);
    alert(data);
}

function postdatalatilongitutebased(){
	var data= $("#longitutebasedsearch").serialize() ;
    var requestType=2;
    var input1=$('#Latitude_INPUT').val();
    var input2=$('#Longitude_INPUT').val();
    var subURL  =   "paramName="+requestType+"&"+"paramValue="+(input1+','+input2);
    //var data=requestType+'/'+input1+','+input2;
    postRequeset(subURL);
    alert(data);
}
function postRequeset(dataval){
	var dataval=dataval;
	$.ajax({
		type: 'GET',
		contentType: 'application/json',
		crossDomain: true,
		url: 'http://localhost:8080/expedia-final/webservice/baseService/processRequest?'+dataval,
		data: '',
		success: function(data, textStatus, jqXHR)
		{ 
		addtableRowData(data)
        console.log(data);
		},
		error: function(jqXHR, textStatus, errorThrown){ alert('update Stock error: ' + textStatus); }
		 
		});
	
 }
$(document).ready(function(){
	toggle('');
  $("#CITY").click(function(){
	  $('div#CITYpop').show();
	  toggle("div#CITYpop");
	  });
  $("#STRTADD").click(function(){
	    $("div#ADDRESSpop").show();
	    toggle("div#ADDRESSpop");
	    });
  
  $("#MINMAX_TOTAL_RATE").click(function(){
	    $("div#MAXIMUMMINIMUMTOTALRATEpop").show();
	    toggle("div#MAXIMUMMINIMUMTOTALRATEpop");
	  });
  $("#MINMAX_STAR_RATE").click(function(){
	    $("div#MAXIMUMMINIMUMSTARRATEpop").show();
	    toggle("div#MAXIMUMMINIMUMSTARRATEpop");
	  });
  $("#LONGITUDE_LATITUDE").click(function(){
	    $("div#LatitudeLongitudepop").show();
	    toggle("div#LatitudeLongitudepop");
	  });
});

function toggle(id) {
	var array=['div#CITYpop','div#ADDRESSpop',
	           'div#MAXIMUMMINIMUMTOTALRATEpop',
	           'div#MAXIMUMMINIMUMSTARRATEpop',
	           'div#LatitudeLongitudepop','div#mydatadiv'];
	
	for(var counter=0;counter<array.length;counter++){
    if(id!=array[counter]){
	jQuery(array[counter]).hide();
    }
	}
}

function addtableRowData(data) {
    $('div#mydatadiv').show();
    $('#noData').hide();
    var table = document.getElementById("myTableData");
    var rowCount = table.rows.length;
    for (var x=rowCount-1; x>0; x--) {
        table.deleteRow(x);
    }

    rowCount = table.rows.length;
    alert(rowCount);
    if(data.length==0){
        $('#noData').show();
    }

    for(var counter=0;counter<data.length;counter++){

        var row = table.insertRow(rowCount);

        dealDetails= data[counter];
        row.insertCell(0).innerHTML=dealDetails.hotelId;
        row.insertCell(1).innerHTML= dealDetails.name;
        row.insertCell(2).innerHTML= '<img src='+'"'+dealDetails.imageUrl +'"'+"/>"
        row.insertCell(3).innerHTML=  dealDetails.description;
        row.insertCell(4).innerHTML= dealDetails.streetAddress;
        row.insertCell(5).innerHTML=  dealDetails.city;
        row.insertCell(6).innerHTML=dealDetails.location[0]+','+dealDetails.location[1];
        row.insertCell(7).innerHTML= dealDetails.checkInDate;
        row.insertCell(8).innerHTML= dealDetails.checkOutDate;
    }
}

