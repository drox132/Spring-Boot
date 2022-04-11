// Call the dataTables jQuery plugin
$(document).ready(function() {

    cargarConsorcio();

  $('#tablaConsorcio').DataTable();
});


async function cargarConsorcio(){

   const request = await fetch('api/consorcios', {
    method: 'GET',
    headers: {
      'Accept': 'application/json',
      'Content-Type': 'application/json'
    },
  });
  const consorcios = await request.json();

  console.log(consorcios);


        let listadoConsorcios='';

          for (let consorcio of consorcios){
           let botonEliminar='<a href="#" onclick="eliminarConsorcio('+consorcio.id+')" class="btn btn-danger btn-circle btn-sm"><i class="fas fa-trash"></i></a>';

            let consorcioHtml='<tr><td>'+consorcio.id+'</td><td>'
            +consorcio.nombre+'</td><td>'+consorcio.cuit+'</td><td>'
            +consorcio.correo+'</td><td>'+botonEliminar+'</td></tr>';

            listadoConsorcios += consorcioHtml;
          }
    document.querySelector("#tablaConsorcio tbody").outerHTML = listadoConsorcios;
}

    async function eliminarConsorcio(id){
    if(!confirm("¿Desea Eliminar este Consorcio?")){
    return;
    }
     const request = await fetch('api/eliminarconsorcio/'+id, {
        method: 'DELETE',
        headers: {
          'Accept': 'application/json',
          'Content-Type': 'application/json'
        },
      });
      location.reload()
}