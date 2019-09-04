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
        var json ="<h2>Flights Available Details</h2>"+"<h4>From Source "+$("#source").val()+" To Destination"+$("#destination").val()+"</h4>";
           var  data1 = data;
            console.log("data",data);
          var obj = JSON.parse(JSON.stringify(data1));
          var tmpclass=$("#selectedClass").val();
          var passengers = $("#noOfPassenger").val();
          var date =$("#flyDate").val();
          var weekDay = new Date(date).getDay();
             $("#div1").html(json);
             $("#forclass").html(tmpclass);
             $("#forpassenger").html(passengers);
             console.log(data1);
             $("#fname").html(data.key);
             $("#basefare").html(data.val[2]);
             $("#forclass1").html(tmpclass);
             $("#forpassenger1").html(passengers);
             $("#fname1").html(data.key);
             $("#basefare1").html(data.val[2]);
            $("#btn-search").prop("disabled", false);
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
