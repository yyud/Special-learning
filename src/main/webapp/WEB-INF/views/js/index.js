function addNewTab(tabname, url) {
    //创建一个新的窗口，在mainlayout上
    if(!$("#mainTabs").tabs('getTab', tabname)) {
        $("#mainTabs").tabs('add', {
            title: tabname,
            selected: true,
            closable: true,
            content: "<iframe src='" + 'http://' + url + "' style='width:100%;height:100%'  frameborder='no' border='0' marginwidth='0' marginheight='0' scrolling='auto' />"
        });
    } else {
        $('#mainTabs').tabs('select', tabname);
    }
}