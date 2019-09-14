  $( function() {
      $( "#flyDate").datepicker();
      $( "#flyDate").datepicker( "option", "dateFormat", "yy-mm-dd" );
      $( "#flyDate").datepicker( "option", "minDate", "Now");
      $( "#flyDate").datepicker( "option", "maxDate", "+2m");
      $( "#flyDate").datepicker('setDate', 'today');
    } );
