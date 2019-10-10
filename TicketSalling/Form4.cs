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
    public partial class Form4 : Form
    {
        private Ticket ticket2;

        public Form4(Ticket ticket)
        {
            ticket2 = ticket;
            
            InitializeComponent();
        }

        private void Form4_Load(object sender, EventArgs e)
        {
            ticket.Text = ticket2.ToString();
        }

        private void OkButton_Click(object sender, EventArgs e)
        {
            Form1 form1 = new Form1();
            form1.Show();
            this.Hide();
        }
    }
}
