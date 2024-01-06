function validateForm(){
    function isCapitalized(str){
        return str.charAt(0) === str.charAt(0).toUpperCase();
    }

    let firstName = document.getElementById("firstName").value;
    let lastName = document.getElementById("lastName").value;
    let email = document.getElementById("email").value;
    let mobileNumber = document.getElementById("mobileNumber").value;
    let city = document.getElementById("city").value;
    let state = document.getElementById("state").value;
    let country = document.getElementById("country").value;

    let firstNameError = document.getElementById("firstNameError");
    let lastNameError = document.getElementById("lastNameError");
    let emailError = document.getElementById("emailError");
    let mobileNumberError = document.getElementById("mobileNumberError");
    let cityError = document.getElementById("cityError");
    let stateError = document.getElementById("stateError");
    let countryError = document.getElementById("countryError");

    firstNameError.innerHTML = "";
    lastNameError.innerHTML = "";
    emailError.innerHTML = "";
    mobileNumberError.innerHTML = "";
    cityError.innerHTML = "";
    stateError.innerHTML = "";
    countryError.innerHTML = "";

    //validate first name
    if(firstName === "" || !isCapitalized(firstName) || !/^[A-Za-z]+$/.test(firstName)){
        firstNameError.innerHTML="Invalid first name. It should start with a capital letter and contain only alphabetic characters."
        return false;
    }

    //validate last name
    if(lastName === "" || !isCapitalized(lastName) || !/^[A-Za-z]+$/.test(lastName)){
        lastNameError.innerHTML = "Invalid last name. It should start with a capital letter and contain only alphabetic characters."
        return false;
    }

    //validate email
    let emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
    if(!emailRegex.test(email)){
        emailError.innerHTML = "Invalid email address";
        return false;
    }

    //validate mobile number
    let mobileRegex = /^\d{10}$/; //Assumes 10-digit mobile number
    if(!mobileRegex.test(mobileNumber)){
        mobileNumberError.innerHTML = "Invalid mobile number";
        return false;
    }

    if(city === "" || !isCapitalized(city)){
        cityError.innerHTML = "City is required and should start with a capital letter";
        return false;
    }

    if(state === "" || !isCapitalized(state)){
        stateError.innerHTML = "State is required and should start with a capital letter";
        return false;
    }

    if(country === "" || !isCapitalized(country)){
        countryError.innerHTML = "Country is required and should start with a capital letter";
        return false;
    }

    return true;
}