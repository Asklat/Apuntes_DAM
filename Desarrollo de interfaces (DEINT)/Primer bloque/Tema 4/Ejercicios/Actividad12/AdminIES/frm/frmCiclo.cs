using AdminIES.DLL;
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace AdminIES.frm
{
    public partial class frmCiclo : Form
    {
        private int idSelecionado;
        private string nombreSlecionado;
        private Form formPadre;
        private CicloDLL cicloDLL;

        public frmCiclo(Form formPadre)
        {
            this.formPadre = formPadre;
            cicloDLL = new CicloDLL();
            InitializeComponent();
            LoadDatos();
        }

        private void LoadDatos()
        {
            dataGridView.DataSource = cicloDLL.CargarDatos().Tables[0];
        }

        private void VaciarDatos()
        {
            textNombreCiclo.Text = "";
            textID.Text = "";
        }

        private void btnAgregar_Click(object sender, EventArgs e)
        {
            if (textNombreCiclo.Text != "")
            {
                cicloDLL.Agregar(textNombreCiclo.Text);
                LoadDatos();
                VaciarDatos();
            }
        }

        private void btnModificar_Click(object sender, EventArgs e)
        {
            if (textNombreCiclo.Text != "")
            {
                cicloDLL.Modificar(idSelecionado, textNombreCiclo.Text);
                LoadDatos();
                VaciarDatos();
            }
        }

        private void btnBorrar_Click(object sender, EventArgs e)
        {
            cicloDLL.Borrar(idSelecionado);
            LoadDatos();
            VaciarDatos();
        }

        private void dataGridView_CellContentClick(object sender, DataGridViewCellEventArgs e)
        {
            if (!dataGridView.Rows[e.RowIndex].Cells[0].Value.ToString().Equals(""))
            {
                idSelecionado = Convert.ToInt32(dataGridView.Rows[e.RowIndex].Cells[0].Value.ToString());
                nombreSlecionado = dataGridView.Rows[e.RowIndex].Cells[1].Value.ToString();
                textID.Text = idSelecionado.ToString();
                textNombreCiclo.Text = nombreSlecionado;
            }
            
        }

        private void btnCancelar_Click(object sender, EventArgs e)
        {
            VaciarDatos();
            Hide();
            formPadre.Show();
        }

        private void frmCiclo_FormClosed(object sender, FormClosedEventArgs e)
        {
            Application.Exit();
        }
    }
}
