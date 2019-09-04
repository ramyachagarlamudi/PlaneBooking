  $( function() {
      $( "#flyDate").datepicker();
      $( "#flyDate").datepicker( "option", "dateFormat", "yy-mm-dd" );
      $( "#flyDate").datepicker( "option", "minDate", "Now");
      $( "#flyDate").datepicker( "option", "maxDate", "+2m");
      $( "#flyDate").datepicker('setDate', 'today');
    } );
//var currentDate = new Date(),
//day = currentDate.getDate(),
//month = currentDate.getMonth() + 3,
//year = currentDate.getFullYear();
//week =currentDate.getDay();
//var tdata = year+"-"+month+"-"+day;
//document.getElementById("flydate").max = year+"-"+month+"-"+day ;
