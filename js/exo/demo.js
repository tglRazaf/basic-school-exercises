const title = $('.title')
const animateBTN = $('.animate')


title.click(function () {
    $('div.app').animate({left: 650, height: 38}, 'slow');
})

animateBTN.click(function () {
    $('div.app')
        // .animate({left: 650, height: 38}, 'fast')
        // .css('color','#324105')
        //.slideUp('slow').next().slideDown('slow')
        .text('hello')
})

console.log(title);
