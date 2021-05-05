var asd=new Vue({
    el:'#asd2',
    data:{
        elementos:
        {id:null,
        nombre:null,
        apellidos:null}

    },
    methods:{
        agregar:function(){

            fetch("/clientes/agregar",{
                method: "POST",
                body: JSON.stringify(this.elementos),
                headers:{
                    "Content-Type": "application/json"
                }
            }).then(function(res){return res.json();}).then(res=>document.write("Se registro correctamente"));
        },
        
    }
})