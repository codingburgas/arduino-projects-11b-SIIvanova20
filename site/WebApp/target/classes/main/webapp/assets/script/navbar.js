window.onscroll = function() {StickyNavBar()};

var navbar = document.getElementById("navbar");
var sticky = navbar.offsetTop;

function StickyNavBar() {
    if (window.pageYOffset >= sticky) {
        navbar.classList.add("sticky")
    } else {
        navbar.classList.remove("sticky");
    }
}