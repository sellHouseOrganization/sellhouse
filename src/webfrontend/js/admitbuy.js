$(function () {
    $("#scheduleid").blur(()=>{
        alert("22222");
    var scheduleid = localStorage.getItem("scheduleid");
    $("#scheduleid").val(scheduleid);

    $.ajax({
        url: ADMITBUY_URL + "findAll",
        type: "get",
        data:{"scheduleid":$("#scheduleid").val()},
        dataType: 'json',
        success: function (schedule) {
            alert($("#scheduleid").val());
            console.log(schedule);
            //客户姓名
            $("#clientName").val(schedule.clientName)  ;
            //房源名称
            $("#houseName").val(schedule.houseName)  ;
            //定金
            $("#fromtMoney").val(schedule.fromtMoney)  ;
            //预售单价
            $("#price").val(schedule.price)  ;
            //预购时间
            $("#scheduleDate").val(schedule.scheduleDate)  ;
            //预交售价
            $("#mustPrices").val(schedule.mustPrices)  ;
            //认购时间
            $("#admitbuyDate").val(schedule.admitbuyDate);
            //私人面积
            $("#privateArea").val(schedule.privateArea)  ;
            //首付
            $("#firstPay").val(schedule.firstPay)  ;
            //付款方式
            $("#structure").val(schedule.structure)  ;
            //成交总价
            $("#sumPrices").val(schedule.sumPrices);
            //经办人员
            $("#managePerson").val(schedule.managePerson)  ;
            //简要备注
            $("#remake").val(schedule.remake)  ;

        }
    })
    })
    $("#btnSvn").click(()=>{
        $.ajax({
            url: ADMITBUY_URL+"insert",
            type: "post",
            data: {"firstPay":$("#firstPay").val(),"admitbuyDate":$("#admitbuyDate").val(),
                   "managePerson":$("#managePerson").val(),"structure":$("#structure").val()},
            dataType: "json",
            success:function (data) {
                if (!data){
                    alert("认购失败")
                }
            }
        })
    })
})


