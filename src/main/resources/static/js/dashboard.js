    if (!localStorage.getItem("myURL") && document.referrer.includes("dashboard/src")) {
      localStorage.setItem("myURL", document.referrer);
    }
    else if (document.referrer.includes("dashboard/src") && document.referrer != localStorage.getItem("myURL")) {
      localStorage.removeItem("myURL");
      localStorage.setItem("myURL", document.referrer);
    }

    document.getElementById("sale-request-link").href = localStorage.getItem("myURL");
    
    const removeMyURL = () => {
      localStorage.removeItem("myURL");
    }
    
    document.getElementById("sale-request-link").onclick = removeMyURL;
    document.getElementById("logout-link").onclick = removeMyURL;
