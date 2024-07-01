document.addEventListener("DOMContentLoaded", function() {
    if (isUserLoggedIn()) {
        document.getElementById("div-for-hidden-statistics").style.display = "hidden";
        document.getElementById("main-container").style.display = "flex";
        document.getElementById("milestone-div").style.display = "flex";
    }
    else {
        document.getElementById("div-for-hidden-statistics").style.display = "flex";
        document.getElementById("main-container").style.display = "hidden";
        document.getElementById("milestone-div").style.display = "hidden";
    }
});

function isUserLoggedIn() {
    return true;
}