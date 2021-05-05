function iniciar(){
    var contenido=document.querySelector('#asd3')
    var asd=document.getElementById('elid').value;
    //document.write(asd);
    //console.log(asd);
    document.write(asd);
    var url="/clientes/listar/"+asd;
    fetch(url).then(res=>res.json()).then(asd=>{
        if(asd.nombre!=null){
            document.write("<h1>"+"Bienvenido a su pagina : "+ asd.nombre + "</h1>")
        }else{
            document.write("No se ha encontrado al usuario, por favor actualice la página y vuelva a introducir su ID")
        }

    });
}
