// Call the dataTables jQuery plugin
$(document).ready(function() {

});


async function crearConsorcio(){

    let datos= {};
    datos.nombre= document.getElementById("txtNombre").value;
    datos.cuit= document.getElementById("txtCuit").value;
    datos.correo= document.getElementById("txtCorreo").value;

    if(!confirm("¿Desea agregar este consorcio?")){
        return;
    }
   const request = await fetch('api/crearconsorcio', {
    method: 'POST',
    headers: {
      'Accept': 'application/json',
      'Content-Type': 'application/json'
    },
     body: JSON.stringify(datos)
  });
  //const consorcios = await request.json();
    alert("El consorcio fue guardado exitosamente")
    location.reload()

}
