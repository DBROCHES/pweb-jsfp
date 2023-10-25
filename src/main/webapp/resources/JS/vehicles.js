function mostrarAnos() {
    var fechaActual = new Date();
    var anoActual = fechaActual.getFullYear();
    var selectAnos = document.getElementById("year_of_manufacture");

    for (var i = 1900; i <= anoActual; i++) {
        var option = document.createElement("itemlabel");
        option.text = i;
        option.value = i;
        selectAnos.add(option);
    }
}