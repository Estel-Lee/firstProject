/* ========== */
/* Temha */
(function () {
  // Body
  document.body.addEventListener("click", () => {
    document
      .querySelectorAll(".dropset")
      .forEach((element) => element.classList.remove("active"));
    document
      .querySelectorAll(".selectset")
      .forEach((element) => element.classList.remove("active"));
  });

  // Inputset
  const inputsetElements = document.querySelectorAll(".inputset-textarea");
  inputsetElements.forEach((inputsetElement) => {
    inputsetElement.addEventListener("keyup", () => {
      const inputsetText = inputsetElement.value;
      const inputsetCount = inputsetElement
        .closest(".inputset")
        .querySelector(".inputset-count");
      if (inputsetText.length === 0 || inputsetText === "") {
        inputsetCount.textContent = "0";
      } else {
        inputsetCount.textContent = inputsetText.length;
      }
      if (inputsetText.length > 4000) {
        inputsetElement.value = inputsetText.substring(0, 4000);
      }
    });
  });

  // Fileset
  const filesetElements = document.querySelectorAll(".fileset");
  filesetElements.forEach((filesetElement) => {
    const filesetInput = filesetElement.querySelector(".fileset-input");
    const filesetCancel = filesetElement.querySelector(".fileset-cancel");
    filesetInput.addEventListener("change", () => {
      filesetInput.classList.add("active");
      filesetCancel.style.display = "block";
    });
    filesetCancel.addEventListener("click", () => {
      filesetInput.value = "";
      filesetInput.classList.remove("active");
      filesetCancel.style.display = "none";
    });
  });

  // Tabset
  const tabsetLink = document.querySelectorAll(".tabset-link");
  tabsetLink.forEach((buttonElement) => {
    const clickEventHandler = (event) => {
      event.stopPropagation();
      const button = event.target.closest(".tabset-link");
      const buttonGrandParent = button.closest(".tabset-list");
      const buttonParent = button.closest(".tabset-item");
      const buttonParentSiblings = getSiblings(buttonGrandParent, buttonParent);
      const buttonParentIndex = getIndex(buttonParent);
      const itemTabsetContainer = button
        .closest(".tabset")
        .querySelector(".tabset-container");
      buttonParentSiblings.forEach((siblingElement) => {
        siblingElement.querySelector(".tabset-link").classList.remove("active");
      });
      button.classList.add("active");
      if (itemTabsetContainer) {
        itemTabsetContainer
          .querySelectorAll(".tabset-cont")
          .forEach((contElement) => {
            const contElementIndex = getIndex(contElement);
            contElement.classList.remove("active");
            if (contElementIndex === buttonParentIndex) {
              contElement.classList.add("active");
            }
          });
      }
    };
    buttonElement.removeEventListener("click", clickEventHandler);
    buttonElement.addEventListener("click", clickEventHandler);
  });

  // Selectset
  const selectsetToggle = document.querySelectorAll(".selectset-toggle");
  const selectsetLink = document.querySelectorAll(".selectset-link");
  selectsetToggle.forEach((buttonElement) => {
    const clickEventHandler = (event) => {
      event.stopPropagation();
      const button = event.target.closest(".selectset-toggle");
      const buttonParent = button.closest(".selectset");
      buttonParent.classList.toggle("active");
    };
    buttonElement.removeEventListener("click", clickEventHandler);
    buttonElement.addEventListener("click", clickEventHandler);
  });
  selectsetLink.forEach((buttonElement) => {
    const clickEventHandler = (event) => {
      event.stopPropagation();
      const button = event.target.closest(".selectset-link");
      const buttonText = button.querySelector("span").innerHTML;
      const buttonGrandParent = button.closest(".selectset-list");
      const buttonParent = button.closest(".selectset-item");
      const buttonParentSiblings = getSiblings(buttonGrandParent, buttonParent);
      const buttonSelectsetToggle = button
        .closest(".selectset")
        .querySelector(".selectset-toggle");
      buttonParentSiblings.forEach((siblingElement) => {
        siblingElement.querySelector(".selectset-link").classList.remove("on");
      });
      button.classList.toggle("on");
      buttonSelectsetToggle.querySelector("span").innerHTML = buttonText;
    };
    buttonElement.removeEventListener("click", clickEventHandler);
    buttonElement.addEventListener("click", clickEventHandler);
  });

  // Dropset
  const dropsetToggle = document.querySelectorAll(".dropset-toggle");
  dropsetToggle.forEach((buttonElement) => {
    const clickEventHandler = (event) => {
      event.stopPropagation();
      const button = event.target.closest(".dropset-toggle");
      const buttonParent = button.closest(".dropset");
      buttonParent.classList.toggle("active");
    };
    buttonElement.removeEventListener("click", clickEventHandler);
    buttonElement.addEventListener("click", clickEventHandler);
  });

  // Accordset
  const accordsetButton = document.querySelectorAll(".accordset-button");
  accordsetButton.forEach((buttonElement) => {
    const clickEventHandler = (event) => {
      const button = event.target.closest(".accordset-button");
      const buttonGrandParent = button.closest(".accordset");
      const buttonParent = button.closest(".accordset-item");
      const buttonParentSiblings = getSiblings(buttonGrandParent, buttonParent);
      buttonParentSiblings.forEach((siblingElement) => {
        siblingElement.classList.remove("active");
      });
      buttonParent.classList.toggle("active");
    };
    buttonElement.removeEventListener("click", clickEventHandler);
    buttonElement.addEventListener("click", clickEventHandler);
  });

  // Toast
  const toastClose = document.querySelectorAll(".toastset-close");
  toastClose.forEach((buttonElement) => {
    const clickEventHandler = (event) => {
      const button = event.target.closest(".toastset-close");
      const buttonGrandParent = button.closest(".toastset");
      buttonGrandParent.remove();
    };
    buttonElement.removeEventListener("click", clickEventHandler);
    buttonElement.addEventListener("click", clickEventHandler);
  });

  // Videoset
  const videosetButtons = document.querySelectorAll(".videoset-play");
  videosetButtons.forEach((buttonElement) => {
    const clickEventHandler = (countevent) => {
      const buttonElement = event.target
        .closest(".videoset")
        .querySelector(".videoset-video");
      const buttonGrandParent = event.target.closest(".videoset");
      buttonElement.play();
      buttonGrandParent.classList.add("active");
      buttonElement.addEventListener("click", () => {
        buttonElement.pause();
        buttonGrandParent.classList.remove("active");
      });
    };
    buttonElement.removeEventListener("click", clickEventHandler);
    buttonElement.addEventListener("click", clickEventHandler);
  });

  // Checkset
  const checksetElements = document.querySelectorAll(".checkset");
  checksetElements.forEach((checksetElement) => {
    const checksetText = checksetElement.querySelector(".checkset-text");
    const checkboxInput = checksetElement.querySelector(".checkset-input");
    checksetText.addEventListener("click", () => {
      if (!checkboxInput.disabled) {
        checkboxInput.checked = !checkboxInput.checked;
      }
    });
  });

  // Radioset
  const radiosetElements = document.querySelectorAll(".radioset");
  radiosetElements.forEach((radiosetElement) => {
    const radiosetText = radiosetElement.querySelector(".radioset-text");
    const radioboxInput = radiosetElement.querySelector(".radioset-input");
    radiosetText.addEventListener("click", () => {
      if (!radioboxInput.disabled) {
        radioboxInput.checked = !radioboxInput.checked;
      }
    });
  });

  // Function
  function getSiblings(parent, element) {
    return [...parent.children].filter((item) => item !== element);
  }
  function getIndex(element) {
    return [...element.parentNode.children].indexOf(element);
  }  
})();

  function checkAll(){
    if (!checkUserId(form.userid.value)) { 
      return false; 
    } else if (!checkPassword(form.userid.value, form.password.value, form.password2.value)) {
      return false; 
    } else if (!checkMail(form.useremail.value, form.useremail1.value)) {
      return false; 
    } else if (!checkName(form.username.value)) { 
      return false; 
    } return true;
};

function checkUserId(id){
  var idRegExp = /^[a-zA-z0-9]{4,12}$/;
  //아이디 유효성 검사        
  if(!idRegExp.test(id)){
    alert("아이디는 영문 대소문자와 숫자 4~12자리로 입력해야합니다!");
    form.userId.value = "";
    form.userId.focus();
    return false;
  }
  return true;
}

function checkPassword(id, password, password2){
    var passwordRegExp = /^[a-zA-z0-9]{4,12}$/;
    
    //비밀번호 유효성 검사        
    if (!passwordRegExp.test(password)) {
      alert("비밀번호는 영문 대소문자와 숫자 4~12자리로 입력해야합니다!");
      form.password.value = "";
      form.password1.focus();
      return false;
    }
    //비밀번호와 비밀번호 확인이 맞지 않을 경우    
    if (password!= password2) {
     alert("두 비밀번호가 맞지 않습니다.");
     form.password.value = "";
     form.password2.value = "";
     form.password2.focus();
     return false;
    }
    //아이디와 비밀번호가 같을 때        
    if (id == password) {
      alert("아이디와 비밀번호는 같을 수 없습니다!");
      form.password.value = "";
      form.password2.value = "";
      form.password2.focus();
      return false;
    }return true;
}

function checkMail(useremail, useremail1) {
  var emailRegExp = /^[A-Za-z0-9_]+[A-Za-z0-9]*[@]{1}[A-Za-z0-9]+[A-Za-z0-9]*[.]{1}[A-Za-z]{1,3}$/;
  
  if (!emailRegExp.test(useremail, useremail1)) {
    alert("이메일 형식이 올바르지 않습니다!");
    form.useremail.value = "";
    form.useremail1.value = "";
    form.useremail.focus();
    return false;
  }
  return true;
};