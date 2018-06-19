/* 
 * Ranga AJAX PART IN MAIL TRACK
 */
$('#saveDipBtn').click(function () {
    var dipname = $('#dipname');
    var ajx = new XMLHttpRequest();
    ajx.open("POST", "../SaveDip?dipname=" + dipname.val(), "true");
    ajx.onload = function () {
        if (ajx.status >= 200 && ajx.status < 400) {
            var x = JSON.parse(ajx.responseText);
            console.log(x.length);
            for (i = 0; i < x.length; i++) {
                var ok = x[i].ok;
                switch (ok) {
                    case 'error':
                        demo.showNotification('bottom', 'right', 'Department Name too Short', 'warning');
                        break;
                    case 'null':
                        demo.showNotification('bottom', 'right', 'No inputs', 'warning');
                        break;
                    case 'good':
                        demo.showNotification('bottom', 'right', 'Save Success', 'success');
                        dipname.val("");
                        break;
                }
            }        
        }
    };
    ajx.onerror = function () {
        console.log("Error");
    };
    ajx.send();
});






