
function footerOpen() {
    let footer = document.getElementById("footer");
    footer.style.backgroundColor = '#010101';
    footer.style.height = '150px';
    document.getElementById("footer-div").style.backgroundColor = '#010101';
    // document.getElementById("footer-div-projects").style.backgroundColor = '#010101';
    document.getElementById("arrow-icon").style.transform = 'rotate(270deg)';
    document.getElementById("arrow-icon").src = 'img/arrow-icon-yellow.svg';
    let footerText = document.getElementsByClassName("footer-text");
    console.log(footerText[0]);
    for (let i = 0; i < footerText.length; i++){
        footerText[i].style.color = '#FACF0F';
    }
}

