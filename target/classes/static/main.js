  $( function() {
    var availableTags = [
      "Hyderabad",
      "Chennai",
      "New Delhi",
      "Bangalore",
      "Vijayawada",
      "Puna",
      "Mumbai"
    ];
    $( "#source" ).autocomplete({
      source: availableTags
    });
    $( "#destination" ).autocomplete({
          source: availableTags
        });
  } );
