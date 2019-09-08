  $(document).ready(function(){
    $("#search-form").submit(function (event) {
         event.preventDefault();

         var search = {}
         search["source"] = $("#source").val();
         search["destination"]=$("#destination").val();
         search["noOfPassengers"]=$("#noOfPassenger").val();
         search["flyDate"]=$("#flyDate").val();
        search["selectedClass"]= $("#selectedClass").val();
        $.ajax({
        type: "GET",
        contentType: "application/json",
        url: "/search/",
        data: search,
        dataType: 'json',
        cache: false,
        timeout: 600000,
        success: function (data) {
        var json ="<h2>Flights Available Details</h2>"+"<h4>From Source "+$("#source").val()+" To Destination "+$("#destination").val()+"</h4>";
           console.log("output",data);
           drawTable(data);
          function drawTable(data) {
              for (var i = 0; i < data.length; i++) {
                  drawRow(data[i]);
              }
          }
             $("#div1").html(json);
          function drawRow(rowData) {
              var row = $("<tr/>")
              $("#flightDataTable").append(row);
              row.append($("<td>" + rowData.flightName + "</td>"));
               row.append($("<td>" + rowData.departureTime + "-"+ rowData.arrivalTime + "</td>"));
              row.append($("<td>" + "Direct" + "</td>"));
              row.append($("<td>" + $("#noOfPassenger").val() + "</td>"));
              row.append($("<td>" + rowData.price+ "</td> </tr>"));
              row.append($("<td> <button type= submit>View Deal</button>" + "</td>"));
          }
          function deleteRows(){
            var i=1;
               $("#flightDataTable td").each(function(e){
               	if(i!=1) $(e).remove();
               i++;
               });
          }
           },
        error: function (e) {
            var json = "<h4>Ajax Response</h4><pre>"
                + e.responseText + "</pre>";
            $('#feedback').html(json);
            console.log("ERROR : ", e);
            $("#btn-search").prop("disabled", false);

        }
    });
  });
});
