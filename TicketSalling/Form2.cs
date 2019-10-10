using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Text;
using System.Windows.Forms;
using TicketSalling;

namespace TicketSalling
{
    public partial class Form2 : Form
    {
        private Airplane airplane2;
        private List<Flight> flights2;
        private int numb2;
        private int index;
        private List<Flight> flightT = new List<Flight>();
        public Form2(List<Flight> flights, Airplane airplane, int numb)
        {
            numb2 = numb;
            airplane2 = airplane;
            flights2 = flights;
            InitializeComponent();
        }

        private void Form2_Load(object sender, EventArgs e)
        {
            Random rnd = new Random();
            for (int i = 0; i < flights2.Count; i++)
            {
                if (airplane2.Equals(flights2[i].airplane))
                {
                    flightT.Add(flights2[i]);
                }
                else
                {
                    continue;
                }
            }

            for (int i = 0; i < flightT.Count; i++)
            {
                TrueF.Items.Add(flightT[i].ToString());


            }

            //MessageBox.Show("da" + flightT.Count);
        }

        private void Button1_Click(object sender, EventArgs e)
        {

            Flight flight3 = flightT[index];
            //flight3 = (Flight)flight3;
            //MessageBox.Show(flight3.ToString());
            Form3 form3 = new Form3(flight3, numb2);
            form3.Show();
            this.Hide();
        }

        private void TrueF_SelectedIndexChanged(object sender, EventArgs e)
        {
            index = TrueF.SelectedIndex;

        }
    }
}
