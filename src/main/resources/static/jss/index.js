var app = new({
    el: '#app',
    data: {
        titulo: 'Registro de Usuario',
        pagina: 1,
        cliente : {
            id:null,
            nombre:null,
            apellidos:null,
        },
        productos:{
            id:null,
            nombre:null,
            vencimiento:null,
        }
    },
    methods:{
        limpiar : function () {
            var inputs = document.querySelectorAll('input.auth');

            for (var i = 0; i < inputs.length; i++) {
                inputs[i].value = '';
            }

        },
        registrar:function(){
            fetch('/clientes/agregar',{
                body: JSON.stringify(this.usuario),
            }).then(res=>res.json()).then(data=>{
                this.cliente;
            })
        }
        /*
        setPagina : function (pagina) {
            this.pagina = pagina;
        },
        isPagina : function (pagina) {
            return (this.pagina == pagina);
        },
        registrarUsuario:function(){


            fetch('agregar-usuario', {
                method: 'POST',
                body: JSON.stringify(this.usuario),
                headers:{
                    'Content-Type': 'application/json'
                }
            }).then(function(res){ return res.json(); })
            .then(function(data){
                this.usuario = data;
            });
        }
        */

        /*
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

            fetch('/clientes/agregar',{
                method: 'POST',
                body: JSON.stringify(this.elementos),
                headers:{
                    'Content-Type': 'application/json'
                }
            }).then(res=>res.json()).then(res=>console.log(res));
        }
    }
})
        */
    }
});
