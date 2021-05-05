function listar(){
    var contenido=document.querySelector('#contenido')
    fetch('/listar_prod').then(res=>res.json()).then(data=>{
        //document.write("<h2>" + data[0].id + " " + data[0].nombre + " " + data[0].apellidos + "</h2>");
        for (var i=0;i<data.length;i++){
            //contenido.innerHTML=`${data['0'].id}`;
            //contenido.innerHTML=`${data[i].nombre}`;
            console.log(data[i].nombre);
            document.write("<h2>" + data[i].id + " " + data[i].nombre + " " + data[i].vencimiento + "</h2>");
            //contenido.innerHTML=`${data['0'].id}`;
        }
        document.write("<img src='imgs/kali_im.png' alt='La imágen no está disponible en estos momentos' height='400' width='500' srcset='kali_im.png 2x'/>")
        /*
        console.log(data['0'].id);
        console.log(data['1'].id);
        console.log(data['2'].id);
        contenido.innerHTML=`${data['0'].id}`;
        contenido.innerHTML=`${data['1'].id}`;
        contenido.innerHTML=`${data['2'].id}`;
        */
        //contenido.innerHTML=`<p>ID:${data}</p>`
        
    })
}