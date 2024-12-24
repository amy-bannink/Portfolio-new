function footerOpen() {
    //footer element
    let footer = document.getElementById("footer");
    console.log(window.getComputedStyle(footer).backgroundColor);
    let footerText = document.getElementsByClassName("footer-text");


    if (window.getComputedStyle(footer).backgroundColor == 'rgb(172, 172, 172)'){

        footer.style.backgroundColor = '#010101';
        footer.style.height = '150px';
        document.getElementById("footer-div").style.backgroundColor = '#010101';
        // document.getElementById("footer-div-projects").style.backgroundColor = '#010101';
        document.getElementById("arrow-icon").style.transform = 'rotate(270deg)';
        document.getElementById("arrow-icon").src = '../img/arrow-icon-yellow.svg';
        
        for (let i = 0; i < footerText.length; i++){
            footerText[i].style.color = '#FACF0F';
        }
        
    }
    else if(window.getComputedStyle(footer).backgroundColor == 'rgb(1, 1, 1)'){
        console.log('test elif');
        footer.style.backgroundColor = '#ACACAC';
        footer.style.height = '70px';
        for (let i = 0; i < footerText.length; i++){
            footerText[i].style.color = '#FBFBFB';
        }
        document.getElementById("arrow-icon").style.transform = 'rotate(90deg)';
        document.getElementById("arrow-icon").src = '../img/arrow-icon.svg';
        document.getElementById("footer-div").style.backgroundColor = '#ACACAC';

    }
    else{
        console.log('else');
    }

}

