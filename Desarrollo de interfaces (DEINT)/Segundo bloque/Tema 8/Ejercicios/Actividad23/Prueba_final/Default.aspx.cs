﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using Prueba_final.Controlador;

namespace Prueba_final
{
    public partial class _Default : Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {
            if (!Controlador.LoginStatus.Logeado())
            {
                Response.Redirect("./Paginas/Sesion/Login");
            }
        }
    }
}