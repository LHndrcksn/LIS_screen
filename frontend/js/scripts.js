function onLegislatorSubmit() {
    event.preventDefault();
    const firstName = document.getElementById("firstName").value;
    const lastName = document.getElementById("lastName").value;
    const homeTown = document.getElementById("homeTown").value;

    if (firstName.length === 0 || lastName.length === 0 || homeTown.length === 0) {
        alert('All fields must be filled in');
    } else {
        //Entry is valid
        submitLegislator(firstName, lastName, homeTown);
    }
            
}

function onLegislationSubmit() {
    event.preventDefault();
    const legTitle = document.getElementById("legTitle").value;
    const legText = document.getElementById("legText").value;
    const sponsors = parseSponsors();


    if (legTitle.length === 0 || legText.length === 0) {
        alert('Both title and text fields must be filled in');
    } else {
        //Entry is valid
        submitLegislation(legTitle, legText, sponsors);
    }
            
}

//Get a list of the sponsor names by if their checkboxes are checked
function parseSponsors() {
    const sponsors = document.getElementsByName("sponsor");
    return [...sponsors].filter(el => el.checked).map(el => el.id);
}

async function submitLegislator(firstName, lastName, homeTown) {

    const data = { 
        firstName: firstName,
        lastName: lastName,
        homeTown: homeTown
    };

    const response = await fetch('http://localhost:8080/api/legislators', {
        method: 'POST',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify(data)
    });

    window.location.replace("legislator_view.html");
}

async function submitLegislation(legTitle, legText, sponsors) {

    const data = {
        legTitle: legTitle,
        legText: legText,
        sponsors: sponsors
    };

    const response = await fetch('http://localhost:8080/api/legislation', {
        method: 'POST',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify(data)
    });

    window.location.replace("legislation_view.html");
}