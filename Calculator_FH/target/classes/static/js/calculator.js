// получаем коэффициент по времени

let option1 = document.getElementById("option1");
let option2 = document.getElementById("option2");
let option3 = document.getElementById("option3");
option1.onclick = function () {
    const req = new XMLHttpRequest();
    req.open('POST', '/calculator/time')
    req.send("0.8")
}
option2.onclick = function () {
    const req = new XMLHttpRequest();
    req.open('POST', '/calculator/time')
    req.send("1")
}
option3.onclick = function () {
    const req = new XMLHttpRequest();
    req.open('POST', '/calculator/time')
    req.send("1.2")
}

// получаем коэффициенты от качества

let option12 = document.getElementById("option12");
let option22 = document.getElementById("option22");
let option32 = document.getElementById("option32");
option12.onclick = function () {
    const req = new XMLHttpRequest();
    req.open('POST', '/calculator/quality')
    req.send("1")
}
option22.onclick = function () {
    const req = new XMLHttpRequest();
    req.open('POST', '/calculator/quality')
    req.send("1.1")
}
option32.onclick = function () {
    const req = new XMLHttpRequest();
    req.open('POST', '/calculator/quality')
    req.send("1.2")
}

// получем коэф вовлеченности



let b1 = document.getElementById("1");
let b2 = document.getElementById("2");
let b3 = document.getElementById("3");
let b4 = document.getElementById("4");
let b5 = document.getElementById("5");

b1.onclick = function () {
    const req = new XMLHttpRequest();
    req.open('POST', '/calculator/involvement')
    req.send("1")
}
b2.onclick = function () {
    const req = new XMLHttpRequest();
    req.open('POST', '/calculator/involvement')
    req.send("1.1")
}
b3.onclick = function () {
    const req = new XMLHttpRequest();
    req.open('POST', '/calculator/involvement')
    req.send("1.2")
}
b4.onclick = function () {
    const req = new XMLHttpRequest();
    req.open('POST', '/calculator/involvement')
    req.send("1.35")
}
b5.onclick = function () {
    const req = new XMLHttpRequest();
    req.open('POST', '/calculator/involvement')
    req.send("1.5")
}
let butt = document.getElementById('result-button');
butt.onclick = function () {
    let val = document.getElementById('placeholder').value;
    const req = new XMLHttpRequest();
    req.open('POST', '/calculator/result')
    req.send(val)
    let result = document.getElementById('result-page')
    document.getElementById('str').innerHTML="Результат готов";

};