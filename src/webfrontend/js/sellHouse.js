// api url
const sellHouse_URL = "http://127.0.0.1:9090/Item/"

// offersum url
const OFFERSUM_URL = "http://127.0.0.1:9090/offersum/"
// admitbuy url
const ADMITBUY_URL = "http://127.0.0.1:9090/admitbuy/"

/**
 * 快速的将 form 表单数据转为 json 格式
 * @param $form
 */
function getFormData($form) {
    var unindexed_array = $form.serializeArray()
    var indexed_array = {}

    $.map(unindexed_array, (n, i) => {
        indexed_array[n['name']] = n['value']
    })

    return indexed_array
}