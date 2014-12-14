function postdatacity() {
    var data= $("#citybasedSearch").serialize()
    alert(data);
    var requestType=0;
    var input=$('#CITY_INPUT').val();
    var data=requestType+'/'+input;
    postRequeset(data);
}
function postdatastreet() {
    var data= $("#streetbasedSearch").serialize()
    alert(data);
    
}

function postdataratebased(){
	var data= $("#ratebasedsearch").serialize()
    alert(data);
}

function postdatastarratebased(){
	var data= $("#starratebasedsearch").serialize()
    alert(data);
}

function postdatalatilongitutebased(){
	var data= $("#longitutebasedsearch").serialize()
    alert(data);
}
function postRequeset(dataval){
	var dataval=dataval;
	$.ajax({
		type: 'GET',
		contentType: 'application/json',
		crossDomain: true,
		url: 'http://localhost:8080/expedia-final/webservice/baseService/processRequest/'+dataval,
		data: '',
		success: function(data, textStatus, jqXHR)
		{ 
		alert(data);
        console.log(data);
		alert('Stock updated successfully. Status: '+textStatus); 
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
	           'div#LatitudeLongitudepop'];
	
	for(var counter=0;counter<5;counter++){
    if(id!=array[counter]){
	jQuery(array[counter]).hide();
    }
	}
}

function addRow() {
    
    var  name = document.getElementById("name");
    var age = document.getElementById("age");
    var table = document.getElementById("myTableData");

    var rowCount = table.rows.length;
    var row = table.insertRow(rowCount);

    row.insertCell(0).innerHTML= 
    row.insertCell(1).innerHTML= myName.value;
    row.insertCell(2).innerHTML= age.value;

}
function adddealDeatilsTable() {
    
    var myTableDiv = document.getElementById("myDynamicTable");
     
    var table = document.createElement('TABLE');
    table.border='1';
   
    var tableBody = document.createElement('TBODY');
    table.appendChild(tableBody);
     
    for (var i=0; i<3; i++){
       var tr = document.createElement('TR');
       tableBody.appendChild(tr);
      
       for (var j=0; j<4; j++){
           var td = document.createElement('TD');
           td.width='75';
           td.appendChild(document.createTextNode("Cell " + i + "," + j));
           tr.appendChild(td);
       }
    }
    myTableDiv.appendChild(table);
   
}

