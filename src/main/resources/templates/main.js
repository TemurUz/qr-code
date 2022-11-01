let input1 = document.querySelector('.input1');
let input2 = document.querySelector('.input2');
let input3 = document.querySelector('.input3');
let btn = document.querySelector('.main__btn');
let natija = document.querySelector('.natija');

btn.addEventListener('click', ()=> {
    let effect = input1.value * (Math.sqrt(input2.value) / input3.value)
    console.log(natija);
    natija.style.display = 'block'
    natija.innerHTML= `Natija: ${effect}`
})
