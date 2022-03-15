using System;
using WSDL.mensajes;

namespace WSDL.operaciones
{
    public class Operaciones : Mensajes
    {

        public List<string> saludos = new List<string>();

        public string Saludar(string nombre)
        {
            string msj = "Hola " + nombre + ", te saluda Alejandro";
            saludos.Add(msj);
            return msj;
        }

        public string Mostrar(int id)
        {
            return "x";
        }

        public List<string> BuscarSaludos()
        {
            return saludos;
        }
    }
}